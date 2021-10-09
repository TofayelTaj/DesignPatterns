package SingletonDesignPattern;

public class SingletonClass {

    private static SingletonClass singletonObj;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private SingletonClass() {
    }
    public static SingletonClass getInstance(){
        if(singletonObj == null){
            singletonObj = new SingletonClass();
            return singletonObj;
        }
        return singletonObj;
    }
}
