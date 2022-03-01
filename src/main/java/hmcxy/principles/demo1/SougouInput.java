package hmcxy.principles.demo1;

/**
 * 搜狗输入法
 */
public class SougouInput {

    //聚合
    private AbstractSkin skin;

    //提供set方法
    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }

}
