package blocks;


import models.Card;

/**
 * @author kcx
 * @version v1.0.0
 * @description
 * @createTime 9/8/2023 10:44 am
 */
public class O extends Per {
    public O(){
        Card[] cards = new Card[4];
        cards[0] = new Card(0, 0);
        cards[1] = new Card(0, 1);
        cards[2] = new Card(1, 0);
        cards[3] = new Card(1, 1);
        for (int i = 0; i < this.getCards().length; i++) {
            this.getCards()[i].setRow(cards[i].getRow());
            this.getCards()[i].setCol(cards[i].getCol());
        }
        turn();
    }

    /**
     * 逆时针旋转
     */
    @Override
    public void turnLeft() {
    }

    /**
     * 顺时针旋转
     */
    @Override
    public void turnRight() {
    }

    /**
     * 反转
     */
    @Override
    public void turnDown() {
    }
    @Override
    public String toString() {
        return "O";
    }
}
