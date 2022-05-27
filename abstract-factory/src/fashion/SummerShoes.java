package fashion;

// concrete product
public class SummerShoes implements IShoes{
    @Override
    public String getName() {
        return "Summer shoes";
    }

    @Override
    public String getModel() {
        return "This is summer shoes";
    }
}
