package proxy.staticProxy;

/**
 * ClassName: TeacherProxy
 * Description:
 * date: 2021/12/5 下午8:27
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
public class TeacherProxy implements ITeacher{

    private ITeacher iTeacher;

    public TeacherProxy(ITeacher iTeacher){
        this.iTeacher = iTeacher;
    }

    public void teach(){
        System.out.println("start....");
        iTeacher.teach();
        System.out.println("end .....");
    }
}
