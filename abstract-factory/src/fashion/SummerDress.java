package fashion;

// concrete product
public class SummerDress implements IDress{

    @Override
    public String getName() {
        return "Summer dress";
    }

    @Override
    public String getModel() {
        return "This is summer dress";
    }
}
