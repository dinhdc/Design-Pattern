package material;

public class WoodFactory extends AbstractMaterialFactory {
    @Override
    public Material getProduct(String product) {
        if(product.equals("Table")){
            return new WoodTable();
        }
        if(product.equals("Chair")){
            return new PlasticTable();
        }
        return null;
    }
}
