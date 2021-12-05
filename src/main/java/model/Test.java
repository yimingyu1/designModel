package model;

/**
 * ClassName: Test
 * Description:
 * date: 2021/12/5 下午10:04
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) {
        SoyPicture soyPicture1 = new RedSoy();
        soyPicture1.make();
        SoyPicture soyPicture2 = new PrueSoy();
        soyPicture2.make();
    }

}
