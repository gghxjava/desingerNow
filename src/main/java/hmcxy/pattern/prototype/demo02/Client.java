package hmcxy.pattern.prototype.demo02;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Citation citation = new Citation();
        Student student = new Student();
        student.setName("张三");
        citation.setStudent(student);
        //克隆奖状对象
        Citation clone = citation.clone();
        //因为是浅拷贝 所以他们的数据共用一个student，当student发生改变时，这个也会相应的改变
        clone.getStudent().setName("李四");
        citation.show();
        clone.show();
        System.out.println(citation.getStudent()==clone.getStudent());
    }


}
