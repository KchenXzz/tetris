package test;

import blocks.J;
import blocks.Per;
import blocks.T;
import models.Map;
import models.MapUtil;

/**
 * @author kcx
 * @version v1.0.0
 * @description
 * @createTime 2023/8/11 17:43
 */
public class JTurnTest {
    public static void main(String[] args) {
        Map map = MapUtil.mapBuild();
        Per per = new J();
        map.setPer(per);
        map.show();


    }
}
