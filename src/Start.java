import models.MainByCmd;

/**
 * @author kcx
 * @version v1.0.0
 * @description 启动类
 * @createTime 2023/8/11 10:48
 */
public class Start {
    /*
   实现了俄罗斯方块的基本功能：
        1.积木的生成，七个形状的积木
        2.积木的移动，左右移动，下落
        3.积木的消除，一行满了就消除
        4.积木的下落，一行消除后，上面的积木下落
        5.积木的旋转，每个形状的积木都可以随机旋转
        6.积木的显示，用字符显示，
        7.积木的控制，用键盘录入控制左右移动，下落
        8.游戏结束，积木到顶部就结束
        9.可以提示下一个积木
        10.有积分计算

   不足：
        落地判定不流畅，有时候左移右移后已经到底，但是还要输入2 drop()一下
     */
    public static void main(String[] args) {
        new MainByCmd();
    }
}
