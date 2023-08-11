package blocks;


import models.Card;

/**
 * @author kcx
 * @version v1.0.0
 * @description T型积木类
 * @createTime 8/8/2023 5:01 pm
 */
public class T extends Per {

    public T(){
        Card[] cards = new Card[4];
        cards[0] = new Card(0, 0);
        cards[1] = new Card(0, 1);
        cards[2] = new Card(0, 2);
        cards[3] = new Card(1, 1);
        initializePer(cards);
    }

    @Override
    public void turnLeft() {
        Card[] cards = this.getCards();
        cards[0].drop(2);
        cards[1].moveLeft();
        cards[1].drop();
        cards[2].moveLeft(2);
    }

    @Override
    public void turnRight() {
        Card[] cards = this.getCards();
        cards[0].moveRight();
        cards[1].drop();
        cards[2].drop(2);
        cards[2].moveLeft();
        cards[3].moveLeft();
    }

    @Override
    public void turnDown() {
        Card[] cards = this.getCards();
        cards[0].moveRight(2);
        cards[0].drop();
        cards[1].drop();
        cards[2].drop();
        cards[2].moveLeft(2);
        cards[3].up();
    }
    @Override
    public String toString() {
        return "T";
    }
}
