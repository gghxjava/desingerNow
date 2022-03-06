package hmcxy.pattern.builder.demo2;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote 手机类
 */
public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainborad;

    private Phone(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainborad = builder.mainborad;
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainborad;
        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }
        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }
        public Builder mainborad(String mainborad){
            this.mainborad = mainborad;
            return this;
        }

        //使用构建者创建phone对象
        public Phone build(){
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainborad='" + mainborad + '\'' +
                '}';
    }
}
