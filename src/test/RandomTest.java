package test;

import java.util.Random;

/**
 * @author kcx
 * @version v1.0.0
 * @description
 * @createTime 10/8/2023 2:30 pm
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();

        while (true){
            System.out.println(random.nextInt(7));
        }


    }
}
