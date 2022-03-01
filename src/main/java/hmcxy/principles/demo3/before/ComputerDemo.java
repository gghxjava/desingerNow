package hmcxy.principles.demo3.before;

public class ComputerDemo {

    public static void main(String[] args) {
        //创建组件对象
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        InterCpu interCpu = new InterCpu();
        KingstonMemory kingstonMemory = new KingstonMemory();

        //创建计算机对象
        Computer c = new Computer();
        c.setCpu(interCpu);
        c.setHardDisk(xiJieHardDisk);
        c.setMemory(kingstonMemory);
        c.run();
    }

}
