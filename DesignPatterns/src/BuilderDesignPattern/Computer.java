package BuilderDesignPattern;

public class Computer {
    private int ram;
    private String motherBoard;
    private String processor;
    private String powersupply;
    private boolean wifi;
    private String gpu;

    public Computer(int ram, String motherBoard, String processor, String powersupply, boolean wifi, String gpu) {
        this.ram = ram;
        this.motherBoard = motherBoard;
        this.processor = processor;
        this.powersupply = powersupply;
        this.wifi = wifi;
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", motherBoard='" + motherBoard + '\'' +
                ", processor='" + processor + '\'' +
                ", powersupply='" + powersupply + '\'' +
                ", wifi=" + wifi +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
