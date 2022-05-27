package fashion;

// concrete product
public class WinterDress implements IDress{
    @Override
    public String getName() {
        return "Winter dress";
    }

    @Override
    public String getModel() {
        return "This is winter dress";
    }
}
