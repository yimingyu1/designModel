package prototype;

/**
 * ClassName: Test
 * Description:
 * date: 2021/11/27 下午9:42
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepClone1 deepClone1 = new DeepClone1("阿三", new DeepClone("张三", "法外狂徒"));
        System.out.println(deepClone1);
        System.out.println(deepClone1.hashCode());
        DeepClone1 deepClone2 = (DeepClone1) deepClone1.clone();
        System.out.println(deepClone2);
        System.out.println(deepClone2.hashCode());
        DeepClone1 deepClone11 = deepClone1.deepClone();
        System.out.println(deepClone11);
        System.out.println(deepClone11.hashCode());
    }
}
