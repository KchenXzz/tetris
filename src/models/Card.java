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
     * 下落
     */
    public void drop() {
        this.row++;
    }

    /**
     * 下落
     * @param n 格子数
     */
    public void drop(int n) {
        row += n;
    }
    /**
     * 左移
     */
    public void moveLeft() {
        this.col--;
    }
    /**
     * 左移
     * @param n 格子数
     */
    public void moveLeft(int n) {
        col -= n;

    }
    /**
     * 右移
     */
    public void moveRight() {
        this.col++;
    }
    /**
     * 右移
     * @param n 格子数
     */
    public void moveRight(int n) {
        col += n;
    }

    /**
     * 上移
     */
    public void up() {
        this.row--;
    }
    /**
     * 上移
     * @param n 格子数
     */
    public void up(int n) {
        row -= n;
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
