package hmcxy.pattern.builder.demo1;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote 具体的产品对象
 */
public class Bike {

    private String frame; //车架

    private String seat; //车架

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
