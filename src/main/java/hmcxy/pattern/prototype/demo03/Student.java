package hmcxy.pattern.prototype.demo03;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote
 */
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
