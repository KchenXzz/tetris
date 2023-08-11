package models;

import blocks.Per;

/**
 * @author kcx
 * @version v1.0.0
 * @description 格子对象
 * @createTime 7/8/2023 5:49 pm
 */
public class Card {

    private Per per;

    private Map map = new Map();

    private int row;//行
    private int col;//列

    public Card() {
    }

    public Card(int row, int col) {
        this.col = col + 3;//位置居中
        this.row = row;
    }

    //移动方法

    /**
     * 在地图里下落
     */
    public void drop() {
        Card[][] cards = map.getMap();
        cards[this.row++][this.col] = null;
        cards[this.row][this.col] = this;

    }

    /**
     * 在地图里下落
     * @param n 格子数
     */
    public void drop(int n) {
        Card[][] cards = map.getMap();
        cards[this.row][this.col] = null;
        row += n;
        cards[this.row][this.col] = this;
    }
    /**
     * 在地图里左移
     */
    public void moveLeft() {
        Card[][] cards = map.getMap();
        cards[this.row][this.col--] = null;
        cards[this.row][this.col] = this;
    }
    /**
     * 在地图里左移
     * @param n 格子数
     */
    public void moveLeft(int n) {
        Card[][] cards = map.getMap();
        cards[this.row][this.col] = null;
        col -= n;
        cards[this.row][this.col] = this;

    }
    /**
     * 在地图里右移
     */
    public void moveRight() {
        Card[][] cards = map.getMap();
        cards[this.row][this.col++] = null;
        cards[this.row][this.col] = this;
    }
    /**
     * 在地图里右移
     * @param n 格子数
     */
    public void moveRight(int n) {
        Card[][] cards = map.getMap();
        cards[this.row][this.col] = null;
        col += n;
        cards[this.row][this.col] = this;
    }

    /**
     * 在地图里上移
     */
    public void up() {
        Card[][] cards = map.getMap();
        cards[this.row--][this.col] = null;
        cards[this.row][this.col] = this;
    }
    /**
     * 在地图里上移
     * @param n 格子数
     */
    public void up(int n) {
        Card[][] cards = map.getMap();
        cards[this.row][this.col] = null;
        row -= n;
        cards[this.row][this.col] = this;
    }

    public Per getPer() {
        return per;
    }

    public void setPer(Per per) {
        this.per = per;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

}
