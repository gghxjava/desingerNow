package hmcxy.principles.demo3.before;

public class Computer {

    private XiJieHardDisk hardDisk;
    private InterCpu cpu;
    private KingstonMemory memory;

    public XiJieHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(XiJieHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public InterCpu getCpu() {
        return cpu;
    }

    public void setCpu(InterCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }

    public void run(){
        System.out.println("运行计算机");
        String s = hardDisk.get();
        System.out.println("从硬盘上获取的数据"+s);
        cpu.run();
        memory.save();
    }
}
