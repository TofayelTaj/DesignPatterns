package SingletonDesignPattern;

public class TestSingleton {
    public static void main(String[] args) {

       var obj1 = SingletonClass.getInstance();
       var obj2 = SingletonClass.getInstance();

       obj1.setName("tofayel Taj");
       System.out.println(obj1.getName());
       System.out.println(obj2.getName());

    }
}
