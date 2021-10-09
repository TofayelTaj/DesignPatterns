package PrototypeDesignPattern;

public class Teacher implements IPrototype {
    private int tId;
    private String name;
    private String subject;

    public Teacher(int tId, String name, String subject){
        this.tId = tId;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public IPrototype getClone(){
        return  new Teacher(tId, name, subject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
