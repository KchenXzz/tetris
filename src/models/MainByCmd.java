package models;


import blocks.*;


import java.util.Random;
import java.util.Scanner;

/**
 * @author kcx
 * @version v1.0.0
 * @description 俄罗斯方块游戏的主方法
 * @createTime 9/8/2023 5:03 pm
 */
public class MainByCmd {
    private static Per per;//积木对象

    private static Map map = MapUtil.mapBuild();//公共地图

    private static int score=0;//游戏结束输出得分，添加的积木越多分数越高

    public MainByCmd() {
        render();
    }

    /**
     * 游戏主方法
     */
    private void render() {
        Per nextPer = getRandomPer();

        do {
            per = nextPer;
            nextPer = getRandomPer();
            System.out.println("下一个积木：" + nextPer);
            nextPer.print();
            map.setPer(per);
            score++;
            map.show();

            while (true) {
                int input = inputControl();

                if (input == 1) {
                    per.moveLeft();
                } else if (input == 2) {
                    while (per.drop()) {
                    }
                } else if (input == 3) {
                    per.moveRight();
                }

                if (!per.drop()) {
                    map.add(per);
                    subtract();
                    break;
                }

                map.show();
            }
        } while (!isOver());

        map.add(per);
        map.show();
        System.out.println("游戏结束，得分：" + score * 10);
    }

    /**
     * 消除行
     * @param lowRow  最靠下的行 也就是最大的行数
     * @param highRow 最靠上的行 也就是最小的行数
     */
    public void rowCollapse(int lowRow, int highRow) {
        for (int row = highRow; row <= lowRow; row++) {
            boolean shouldCollapse = true;
            // 检查当前行的所有位置是否都不为空
            for (int col = 0; col < Map.COL; col++) {
                if (map.getMap()[row][col] == null) {
                    shouldCollapse = false;
                    break;
                }
            }
            if (shouldCollapse) {
                // 下移上方有方块的位置
                for (int r = row; r > 0; r--) {
                    boolean rowAboveEmpty = true;
                    for (int col = 0; col < Map.COL; col++) {
                        if (map.getMap()[r - 1][col] != null) {
                            rowAboveEmpty = false;
                        }
                        map.getMap()[r][col] = map.getMap()[r - 1][col];
                        map.getMap()[r - 1][col] = null;
                    }
                    if (rowAboveEmpty) {
                        break; // 上方的行都是空，结束遍历
                    }
                }
            }
        }
    }


    /**
     * 消除
     */
    public void subtract() {
        int lowRow = 0;
        int highRow = Map.ROW;
        for (int i = 0; i < per.getCards().length; i++) {//遍历当前添加的积木的所有块
            if (per.getCards()[i].getRow() > lowRow) {
                lowRow = per.getCards()[i].getRow();//找到最靠下的块的行
            }
            if (per.getCards()[i].getRow() < highRow) {
                highRow = per.getCards()[i].getRow();
            }
        }
        rowCollapse(lowRow, highRow);
    }


    /**
     * 是否结束
     * @return 结束ture  不结束 false
     */
    public boolean isOver() {
        map.del(per);
        for (Card card : per.getCards()) {
            if (map.getMap()[card.getRow()][card.getCol()] != null) {;
                return true;
            }
        }
        map.add(per);
        return false;
    }

    /**
     * 输入控制 没有输入判断
     * @return 1 left  2 drop  3 right
     */
    public int inputControl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入移动方向：（1 left  2 drop  3 right）");//没有输入判断
        return sc.nextInt();
    }

    /**
     * 随机生成积木
     * @return 积木对象
     */
    public Per getRandomPer() {
        Random random = new Random();
        switch (random.nextInt(7)) {
            case 0 -> {
                return new I();
            }
            case 1 -> {
                return new J();
            }
            case 2 -> {
                return new L();
            }
            case 3 -> {
                return new N();
            }
            case 4 -> {
                return new O();
            }
            case 5 -> {
                return new T();
            }
            case 6 -> {
                return new Z();
            }
        }
        return null;
    }


}
