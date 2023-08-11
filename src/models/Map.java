package models;


import blocks.Per;

/**
 * @author kcx
 * @version v1.0.0
 * @description 地图类
 * @createTime 7/8/2023 5:54 pm
 */
public class Map {

    public static final int ROW=20;
    public static final int COL=10;

    private static Card[][] map;

    private Per per;//当前正在移动的积木

    public Per getPer() {
        return this.per;
    }

    public void setPer(Per per) {
        this.per = per;
        for (Card card : per.getCards()) {
            map[card.getRow()][card.getCol()]=card;
        }
    }

    public Map(Card[][] cards ) {
        map=cards;
    }
    public Map(){}

    /**
     * 给地图添加积木，积木的坐标就是地图的坐标
     */
    public void add(Per per){
        for (Card card : per.getCards()) {
            map[card.getRow()][card.getCol()]=card;
        }
    }

    /**
     * 删除积木
     */
    public void del(Per per){
        for (Card card : per.getCards()) {
            map[card.getRow()][card.getCol()]=null;
        }
    }

    /**
     * 打印地图状态
     */
    public void show(){
        System.out.println("当前积木："+this.per);
        MapUtil.printMap(map);
    }



    public  Card[][] getMap() {
        return map;
    }

}
