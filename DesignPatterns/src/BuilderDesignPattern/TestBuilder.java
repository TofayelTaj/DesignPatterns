package BuilderDesignPattern;

public class TestBuilder {

    public static void main(String[] args) {
        Computer c = new ComputerBuilder().setMotherBoard("asus").setGpu("msi").setProcessor("i5").build();
        System.out.println(c);

    }
}
