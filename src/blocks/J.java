package blocks;


import models.Card;

/**
 * @author kcx
 * @version v1.0.0
 * @description J型积木
 * @createTime 8/8/2023 7:36 pm
 */
public class J extends Per {
    public J(){
        Card[] cards = new Card[4];
        cards[0] = new Card(0, 0);
        cards[1] = new Card(0, 1);
        cards[2] = new Card(0, 2);
        cards[3] = new Card(1, 2);
        for (int i = 0; i < this.getCards().length; i++) {
            this.getCards()[i].setRow(cards[i].getRow());
            this.getCards()[i].setCol(cards[i].getCol());
        }
        turn();

    }


    @Override
    public void turnLeft() {
        Card[] cards = this.getCards();
        cards[0].drop(2);
        cards[1].moveLeft();
        cards[1].drop();
        cards[2].moveLeft(2);
        cards[3].up();
        cards[3].moveLeft();
    }

    @Override
    public void turnRight() {
        Card[] cards = this.getCards();
        cards[0].moveRight(2);
        cards[1].drop();
        cards[1].moveRight();
        cards[2].drop(2);
        cards[3].drop();
        cards[3].moveLeft();
    }

    @Override
    public void turnDown() {
        Card[] cards = this.getCards();
        cards[0].moveRight(2);
        cards[0].drop(2);
        cards[1].drop(2);
        cards[2].drop(2);
        cards[2].moveLeft(2);
        cards[3].moveLeft(2);
    }
    @Override
    public String toString() {
        return "J";
    }
}
