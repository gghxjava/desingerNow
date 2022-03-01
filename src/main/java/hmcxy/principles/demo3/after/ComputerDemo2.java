package hmcxy.principles.demo3.after;

public class ComputerDemo2 {

    public static void main(String[] args) {

        HardDisk xiJieHardDisk = new XiJieHardDisk();
        Memory kingstonMemory = new KingstonMemory();
        Cpu interCpu = new InterCpu();

        Computer computer = new Computer();
        computer.setCpu(interCpu);
        computer.setHardDisk(xiJieHardDisk);
        computer.setMemory(kingstonMemory);

        computer.run();

    }

}
