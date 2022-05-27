package material;

public class MaterialProducer {
    public static AbstractMaterialFactory getFactory(String material){
        if(material.equals("Plastic")){
            return new PlasticFactory();
        }
        if(material.equals("Wood")){
            return new WoodFactory();
        }
        return null;
    }
}
