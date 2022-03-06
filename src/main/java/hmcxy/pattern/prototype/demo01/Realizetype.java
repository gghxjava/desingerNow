package hmcxy.pattern.prototype.demo01;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote
 */
public class Realizetype implements Cloneable{

    public Realizetype() {
        System.out.println("具体的原型对象创建完成");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体的原型已复制成功");
        return (Realizetype)super.clone();
    }

}
