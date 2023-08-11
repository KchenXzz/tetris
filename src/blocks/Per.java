package blocks;

import models.Card;
import models.Map;
import models.MapUtil;

import java.util.Random;

/**
 * @author kcx
 * @version v1.0.0
 * @description 积木的根类
 * @createTime 8/8/2023 5:49 pm
 */
public abstract class Per {

    private Card[] cards;//卡片数组

    private Card[][] sMap=new Card[4][Map.COL];
    private static Map map = new Map();//存储他们的公共map

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    //初始化构造
    public Per() {
        this.cards=new Card[4];
        for (int i = 0; i < cards.length; i++) {
            cards[i]=new Card();
        }
    }
    public void  print(){
        for (Card card : cards) {
            sMap[card.getRow()][card.getCol()] = card;
        }
        MapUtil.printMap(this.sMap);
    }

    /**
     * 随机旋转 并初始化在二维数组的位置
     */
    protected void turn(){
        Random random = new Random();
        switch (random.nextInt(4)){
            case 0-> {}
            case 1-> this.turnDown();
            case 2-> this.turnLeft();
            case 3-> this.turnRight();
        }
//        initPer();//初始化位置
    }


    /**
     * 初始化位置   找最高的行，如果不是第0行，就向下移动到0行、
     */
//    protected void initPer(){
//        int minRow = Map.ROW;
//        for (Card card : this.cards) {
//            if (card.getRow()<minRow){
//                minRow=card.getRow();
//            }
//        }
//        if (minRow!=0){
//            for (Card card : this.cards) {
//                card.setRow(card.getRow()-minRow);
//            }
//            for (int i = 0; i < this.cards.length; i++) {
//                cards[i].setRow(cards[i].getRow()-minRow);
//                cards[i].setRow();
//            }
//        }
//    }


    public void setPer(Per per) {
        for (Card card : this.cards) {
            card.setPer(per);
        }
    }

    /**
     * 能不能下降了 能 true
     */
    public boolean canDrop(){
        for (Card card : this.cards) {
            if (card.getRow()==Map.ROW-1||map.getMap()[card.getRow()+1][card.getCol()]!=null){
                return  false;
            }
        }
        return true;
    }

    /**
     * 能不能左移了 能 true
     */
    private boolean canLeft(){
        for (Card card : this.cards) {
            if (card.getCol()==0||map.getMap()[card.getRow()][card.getCol()-1]!=null){
                return  false;
            }
        }
        return true;
    }
    /**
     * 能不能右移了 能 true
     */
    private boolean canRight(){
        for (Card card : this.cards) {
            if (card.getCol()==Map.COL-1||map.getMap()[card.getRow()][card.getCol()+1]!=null){
                return  false;
            }
        }
        return true;
    }
    /**
     * 积木下降的方法
     * 成功下降 true
     */
    public boolean drop() {
        map.del(this);
        if (canDrop()){
            for (Card card : cards) {
                int row = card.getRow();
                card.setRow(++row);
            }
            map.setPer(this);
            return true;
        }else return false;
    }


    /**
     * 左移
     */
    public void moveLeft() {
        map.del(this);
        if (canLeft()){
            for (Card card : cards) {
                int col = card.getCol();
                card.setCol(--col);
            }
            map.setPer(this);
        }
    }

    /**
     * 右移
     */
    public void moveRight() {
        map.del(this);
        if (canRight()){
            for (Card card : cards) {
                int col = card.getCol();
                card.setCol(++col);
            }
            map.setPer(this);
        }
    }

    /**
     * 逆时针旋转
     */
    public abstract void turnLeft();

    /**
     * 顺时针旋转
     */
    public abstract void turnRight();

    /**
     * 反转
     */
    public abstract void turnDown();

}
