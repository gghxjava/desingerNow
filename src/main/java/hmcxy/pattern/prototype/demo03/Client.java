package hmcxy.pattern.prototype.demo03;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

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



    }


}
