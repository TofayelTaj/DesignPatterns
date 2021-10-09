package PrototypeDesignPattern;

public class TestPrototype {
    public static void main(String[] args) {
        //....cloning with prototype design pattern....
        var s1 = new Student(1, "tofayel");
        System.out.println(s1.toString());
        var s2 = s1.getClone();
        System.out.println(s2.toString());

        var t = new Teacher(1, "jalaluddin", "c#");

        System.out.println(t.toString());
        var t2 = t.getClone();
        System.out.println(t2.toString());
    }
}
