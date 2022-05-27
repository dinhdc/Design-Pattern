package fashion;


// concrete product
public class WinterShoes implements IShoes{
    @Override
    public String getName() {
        return "Winter shoes";
    }

    @Override
    public String getModel() {
        return "This is winter shoes";
    }
}
