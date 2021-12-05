package model;

/**
 * ClassName: SoyPicture
 * Description:
 * date: 2021/12/5 下午10:04
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public abstract class SoyPicture {

    public final void make(){
        if (isAdd()){
            add();
        }
        over();
    }

    public abstract void add();

    private void over(){
        System.out.println("over");
    }
    public boolean isAdd(){
        return true;
    }
}
