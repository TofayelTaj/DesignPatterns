package PrototypeDesignPattern;

public class Student implements IPrototype {

    private int sId;
    private String name;
       public Student(int sId, String name){
        this.sId = sId;
        this.name = name;
    }

    @Override
    public IPrototype getClone() {
        return new Student(sId, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", name='" + name + '\'' +
                '}';
    }
}
