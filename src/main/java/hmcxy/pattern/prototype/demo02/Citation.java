package hmcxy.pattern.prototype.demo02;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote
 */
public class Citation implements Cloneable{

    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation)super.clone();
    }

    public void show(){
        System.out.println(student.getName()+"同学：在2022学年第一学期中表现优秀，被评为三好学生");
    }
}
