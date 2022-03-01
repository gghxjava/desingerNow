package hmcxy.pattern.factory.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("qxd1",11));
        list.add(new Student("qxd2",22));
        list.add(new Student("qxd3",44));
        list.add(new Student("qxd4",66));
        list.add(new Student("qxd5",65));
        Iterator<Student> it = list.iterator();
        while(it.hasNext()) {
            Student i = it.next();
            if(i.getAge() > 30) {
                it.remove();  // 删除大于30 的元素
            }
        }
        System.out.println(list);

    }

}
