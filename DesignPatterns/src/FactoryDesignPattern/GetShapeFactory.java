package FactoryDesignPattern;

public class GetShapeFactory {

    public Shape getShape(String shapeType){
        if(shapeType == null) return  null;
        else if(shapeType.equalsIgnoreCase("C")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("R")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("S")){
            return new Square();
        }else return  null;
    }

}
