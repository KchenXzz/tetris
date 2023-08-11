package test;

import blocks.O;
import blocks.Per;
import models.Card;
import models.Map;
import models.MapUtil;

/**
 * @author kcx
 * @version v1.0.0
 * @description
 * @createTime 2023/8/10 20:06
 */
public class SubtractTest {
    private static Per per;//积木对象
    private static Map map = MapUtil.mapBuild();//公共地图



    public static void main(String[] args) {


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                map.getMap()[i+18][j]=new Card();
            }
        }

        map.show();
        rowDrop(19);
        map.show();




    }
    public static void subtract() {
//        //遍历map
//        Card[][] cards = map.getMap();
//        for (int i = 0; i < cards.length; i++) {
//            for (int i1 = 0; i1 < cards[i].length; i1++) {
//            }
//        }
        //消除只会发生在刚落底的积木那个行 之上
        //得到当前下落到底的积木的最靠下的块， 从下往上看。 逐行判断有没有满满了就消除
        // 消除， 从map 的二维数组里删掉当前行的块
        // 将 上面的所有有块的位置的块 下降一格

        int minRow = 0;//
        for (int i = 0; i < per.getCards().length; i++) {
            if (per.getCards()[i].getRow() > minRow) {
                minRow = per.getCards()[i].getRow();
            }
        }

        for (int i = 0; i < Map.COL; i++) {
            if (map.getMap()[minRow][i] == null) {
                return;
            }
        }//minRow是当前满了要消除的层


        //直接让上层块覆盖当前层  消除后 都下落一层
        //要递归
        rowDrop(minRow);


    }

    public static void rowDrop(int row) {
        map.show();
        //上层全是null结束递归
        boolean f = false;
        for (int i = 0; i < Map.COL; i++) {
            if (map.getMap()[row][i] != null) {
                f = true;
            }
        }
        System.out.println(f);
        if (f) {
            for (int i = 0; i < Map.COL; i++) {
                map.getMap()[row][i] = map.getMap()[row - 1][i];
            }
            rowDrop(row-1);
            rowDrop(row);
        }
    }

}
