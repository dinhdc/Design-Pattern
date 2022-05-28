package material;

public class WoodTable implements Material {
    @Override
    public void getProductName() {
        System.out.println("WoodTable: getProductName() method");
    }

    @Override
    public void getPrice() {
        System.out.println("WoodTable: $200");
    }
}
