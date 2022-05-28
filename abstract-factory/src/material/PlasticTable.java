package material;

public class PlasticTable implements Material{
    @Override
    public void getProductName() {
        System.out.println("PlasticTable: getProductName() method");
    }

    @Override
    public void getPrice() {
        System.out.println("Plastic Table: $100");
    }
}
