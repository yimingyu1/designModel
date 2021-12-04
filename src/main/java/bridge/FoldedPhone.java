package bridge;

/**
 * @author yimingyu
 * @date 2021/12/04
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(){}

    public FoldedPhone(Brand brand){
        super(brand);
    }

    public void call(){
        super.call();
        System.out.println("翻盖手机");
    }

    public void open(){
        super.open();
        System.out.println("翻盖手机");
    }

    public void close(){
        super.close();
        System.out.println("翻盖手机");
    }

}
