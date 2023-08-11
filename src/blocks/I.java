package blocks;


import models.Card;

/**
 * @author kcx
 * @version v1.0.0
 * @description I性积木
 * @createTime 8/8/2023 7:51 pm
 */
public class I extends Per{
    public I(){
        Card[] cards = new Card[4];
        cards[0] = new Card(0, 0);
        cards[1] = new Card(0, 1);
        cards[2] = new Card(0, 2);
        cards[3] = new Card(0, 3);
        for (int i = 0; i < this.getCards().length; i++) {
            this.getCards()[i].setRow(cards[i].getRow());
            this.getCards()[i].setCol(cards[i].getCol());
        }
        turn();
    }

    @Override
    public void turnLeft() {
        Card[] cards = this.getCards();
        for (int i = 0; i < cards.length; i++) {
            cards[i].setCol(4);
            cards[i].setRow(i);
        }

    }

    @Override
    public void turnRight() {
       turnLeft();
    }

    @Override
    public void turnDown() {

    }

    @Override
    public String toString() {
        return "I";
    }
}
