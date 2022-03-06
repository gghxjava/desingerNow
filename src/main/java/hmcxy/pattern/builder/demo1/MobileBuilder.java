package hmcxy.pattern.builder.demo1;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote 具体的构建者，用来构建摩拜单车对象
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("单纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }

}
