package bridge;

/**
 * @author yimingyu
 * @date 2021/12/04
 */
public abstract class Phone {
    private Brand brand;

    public Phone(){}

    public Phone(Brand brand){
        this.brand = brand;
    }

    protected void call(){
        this.brand.call();
    }

    protected  void open(){
        this.brand.call();
    }

    protected void close(){
        this.brand.close();
    }
}
