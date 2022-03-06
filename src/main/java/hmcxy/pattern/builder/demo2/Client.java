package hmcxy.pattern.builder.demo2;

/**
 * @author qinxd
 * @date 2022/3/6
 * @apiNote
 */
public class Client {

    public static void main(String[] args) {

        //创建手机对象
        Phone build = new Phone.Builder()
                .cpu("inter").
                screen("三星").
                memory("金士顿").
                mainborad("华硕").
                build();
        System.out.println(build);


    }

}
