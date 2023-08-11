package blocks;


import models.Card;

/**
 * @author kcx
 * @version v1.0.0
 * @description
 * @createTime 9/8/2023 11:31 am
 */
public class L extends Per {
    public L() {
        Card[] cards = new Card[4];
        cards[0] = new Card(0, 0);
        cards[1] = new Card(0, 1);
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
        cards[1].moveLeft();
        cards[2].up();
        cards[3].up(2);
        cards[3].moveRight();
    }

    /**
     * 顺时针旋转
     */
    @Override
    public void turnRight() {
        Card[] cards = this.getCards();
        cards[0].moveRight(2);
        cards[1].drop();
        cards[1].moveRight();
        cards[3].moveLeft();
        cards[3].up();
    }

    /**
     * 反转
     */
    @Override
    public void turnDown() {
        Card[] cards = this.getCards();
        cards[0].moveRight();
        cards[0].drop(2);
        cards[1].drop(2);
        cards[1].moveLeft();
        cards[2].moveLeft();
        cards[3].moveLeft();
        cards[3].up(2);
    }
    @Override
    public String toString() {
        return "L";
    }
}
