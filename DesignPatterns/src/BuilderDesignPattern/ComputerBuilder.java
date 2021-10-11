package BuilderDesignPattern;

public class ComputerBuilder {
    private int ram;
    private String motherBoard;
    private String processor;
    private String powersupply;
    private boolean wifi;
    private String gpu;

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
        return this;
    }

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setPowersupply(String powersupply) {
        this.powersupply = powersupply;
        return this;
    }

    public ComputerBuilder setWifi(boolean wifi) {
        this.wifi = wifi;
        return this;
    }

    public ComputerBuilder setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }
    public Computer build(){
        return new Computer( ram, motherBoard, processor, powersupply, wifi, gpu);
    }
}
