import material.AbstractMaterialFactory;
import material.Material;
import material.MaterialProducer;
import shape.AbstractFactory;
import shape.FactoryProducer;
import shape.Shape;

public class Client {
    public static void main(String[] args) {
        testMaterial();
    }

    public static void testShape(){
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape1.draw();
        //get an object of Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Square
        shape2.draw();
        //get shape factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape3.draw();
        //get an object of Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //call draw method of Shape Square
        shape4.draw();
    }

    public static void testMaterial(){
        //get shape factory
        AbstractMaterialFactory materialFactory = MaterialProducer.getFactory("Plastic");
        //get an object of plastic table
        assert materialFactory != null;
        Material table = materialFactory.getProduct("Table");
        Material chair = materialFactory.getProduct("Chair");
        chair.getProductName();
        table.getProductName();
    }

}
