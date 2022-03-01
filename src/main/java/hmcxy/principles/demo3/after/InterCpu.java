package hmcxy.principles.demo3.after;

public class InterCpu implements Cpu{

    @Override
    public void run(){
        System.out.println("使用interCpu");
    }

}
