package material;

public class PlasticFactory extends AbstractMaterialFactory {
    @Override
    public Material getProduct(String product) {
        if(product.equals("Table")){
            return new PlasticTable();
        }
        if(product.equals("Chair")){
            return new PlasticChair();
        }
        return null;
    }
}
