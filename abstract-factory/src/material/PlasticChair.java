package material;

public class PlasticChair implements Material{
    @Override
    public void getProductName() {
        System.out.println("PlasticChair: getProductName() method");
    }

    @Override
    public void getPrice() {
        System.out.println("PlasticChair Price: $50");
    }
}
