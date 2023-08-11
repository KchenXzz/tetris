package models;

/**
 * @author kcx
 * @version v1.0.0
 * @description map的创建类
 * @createTime 8/8/2023 9:23 am
 */
public class MapUtil {

    /**
     * 初始化空的地图
     */
    public static Map mapBuild(){
        Card[][] cells=new Card[Map.ROW][Map.COL];

        return new Map(cells);
    }
    public static void printMap(Card[][] map) {
        System.out.println("= = = = = = = = = = = = ");
        for (Card[] cards : map) {
            System.out.print("= ");
            for (Card cell : cards) {
                if (cell!=null){
                    System.out.print("■ ");
                }else System.out.print("  ");
            }
            System.out.println("=");
        }
        System.out.println("= = = = = = = = = = = = ");
    }
}
