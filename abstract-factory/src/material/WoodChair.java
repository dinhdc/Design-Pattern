package material;

public class WoodChair implements Material{
    @Override
    public void getProductName() {
        System.out.println("WoodChair: getProductName() method");
    }

    @Override
    public void getPrice() {
        System.out.println("WoodChair: $25");
    }
}
