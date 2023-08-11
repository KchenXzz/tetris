package models;

/**
 * @author kcx
 * @version v1.0.0
 * @description
 * @createTime 7/8/2023 10:47 pm
 */
public class PerUtil {

    //四个方块一共有七种排列方式，不考虑旋转
//
//    private static HashMap<Character, Per>  blockHashMap=new HashMap<>();
//
//
//    private static char[] shapes=new char[7];
//
//    private static Random random=new Random();
//
//    //很傻逼的构造
//    static {
//        Card[] cards = new Card[4];
//        cards[0] = new Card(0, 0);
//        cards[1] = new Card(0, 1);
//        cards[2] = new Card(0, 2);
//        cards[3] = new Card(0, 3);
//        shapes[0]='I';
//        blockHashMap.put('I', new I(cards) );//xgl
//
//        Card[] cards1 = new Card[4];
//        cards1[0] = new Card(1, 1);
//        cards1[1] = new Card(1, 0);
//        cards1[2] = new Card(2, 2);
//        cards1[3] = new Card(1, 2);
//        shapes[1]='J';
//        blockHashMap.put('J', new J(cards1));//修改了
//
//        Card[] cards3 = new Card[4];
//        cards3[0] = new Card(1, 1);
//        cards3[1] = new Card(0, 0);
//        cards3[2] = new Card(0, 1);
//        cards3[3] = new Card(2, 1);
//        shapes[2]='L';
//        blockHashMap.put('L',new L(cards3));//ok
//
//        Card[] cards6 = new Card[4];
//        cards6[0] = new Card(1, 1);
//        cards6[1] = new Card(0, 0);
//        cards6[2] = new Card(1, 0);
//        cards6[3] = new Card(2, 1);
//        shapes[3]='N';
//        blockHashMap.put('N',new N(cards6));//ok
//
//        Card[] cards4 = new Card[4];
//        cards4[0] = new Card(0, 0);
//        cards4[1] = new Card(0, 1);
//        cards4[2] = new Card(1, 0);
//        cards4[3] = new Card(1, 1);
//        shapes[4]='O';
//        blockHashMap.put('O',new O(cards4));//ok
//
//        Card[] cards2 = new Card[4];
//        cards2[0] = new Card(1, 1);
//        cards2[1] = new Card(1, 0);
//        cards2[2] = new Card(2, 1);
//        cards2[3] = new Card(1, 2);
//        shapes[5]='T';
//        blockHashMap.put('T',new T(cards2));//修改了
//
//        Card[] cards5 = new Card[4];
//        cards5[0] = new Card(1, 1);
//        cards5[1] = new Card(0, 0);
//        cards5[2] = new Card(0, 1);
//        cards5[3] = new Card(1, 2);
//        shapes[6]='Z';
//        blockHashMap.put('Z',new Z(cards5));//ok
//
//    }
//
//
//    //构建积木 返回Bolck
////    public static Card[] build() {
////        int i = random.nextInt(7);
////        return build(shapes[i]);
////    }
//
//
//    /**
//     * 构建一个指定形状的随机颜色的积木
//     * @param shape 形状
//     * @return 卡片数组
//     */
//    public static Card[] build(char shape){
//        Per per = blockHashMap.get(shape);
//
////        for (Card card : per.getCards()) {
////            card.setPer(per);
////        }
//        return per.getCards();
//    }
////    public static Per getRandomPer(){
////        int i = random.nextInt(7);
////        char shape = shapes[i];
////        return blockHashMap.get(shape);
////    }


}
