package blocks;


import models.Card;

/**
 * @author kcx
 * @version v1.0.0
 * @description
 * @createTime 9/8/2023 11:38 am
 */
public class N extends Per {
    public N() {
        Card[] cards = new Card[4];
        cards[0] = new Card(0, 0);
        cards[1] = new Card(1, 0);
        cards[2] = new Card(1, 1);
        cards[3] = new Card(2, 1);
        initializePer(cards);

    }

    /**
     * 逆时针旋转
     */
    @Override
    public void turnLeft() {
        Card[] cards = this.getCards();
        cards[0].drop();
        cards[1].moveRight();
        cards[2].up();
        cards[3].up(2);
        cards[3].moveRight();
    }

    /**
     * 顺时针旋转
     */
    @Override
    public void turnRight() {
        turnLeft();

    }

    /**
     * 反转
     */
    @Override
    public void turnDown() {

    }
    @Override
    public String toString() {
        return "N";
    }
}
