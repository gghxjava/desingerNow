package hmcxy.pattern.prototype.demo01;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        //创建一个原型对象
        Realizetype realizetype = new Realizetype();
        //调用Realizetype类中的cline方法，进行克隆
        //说明他的底层不是通过new一个对象new出来的
        Realizetype clone = realizetype.clone();
        System.out.println(realizetype==clone);

    }

}
