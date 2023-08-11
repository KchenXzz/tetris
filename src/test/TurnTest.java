package test;

import blocks.*;
import models.Map;
import models.MapUtil;

/**
 * @author kcx
 * @version v1.0.0
 * @description
 * @createTime 2023/8/11 9:02
 */
public class TurnTest {
    public static void main(String[] args) {
        Map map = MapUtil.mapBuild();

//        for (int i = 0; i < 7; i++) {
//            Per per ;
//            switch (i) {
//                case 0 -> {
//                    per = new I();
//                    map.setPer(per);
//                    map.show();
//                    map.del(per);
//                }
//                case 1 -> {
//                    per = new J();
//                    map.setPer(per);
//                    map.show();
//                    map.del(per);
//                }
//                case 2 -> {
//                    per = new L();
//                    map.setPer(per);
//                    map.show();
//                    map.del(per);
//                }
//                case 3 -> {
//                    per = new N();
//                    map.setPer(per);
//                    map.show();
//                    map.del(per);
//                }
//                case 4 -> {
//                    per = new O();
//                    map.setPer(per);
//                    map.show();
//                    map.del(per);}
//                case 5 -> {
//                    per = new T();
//                    map.setPer(per);
//                    map.show();
//                    map.del(per);}
//                case 6 -> {
//                    per = new Z();
//                    map.setPer(per);
//                    map.show();
//                    map.del(per);}
//            }
//        }


        Per per = new T();
        Per per1=new L();
        map.del(per1);//per1 的实例化会污染map ???? 要del一下
        map.setPer(per);
        map.show();
        map.del(per);
        map.setPer(per1);
        map.show();
    }


}

