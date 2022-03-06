package hmcxy.pattern.builder.demo1;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote ofo单车构建者，用来构建ofo单车
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
