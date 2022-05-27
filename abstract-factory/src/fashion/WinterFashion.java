package fashion;

public class WinterFashion implements IFashion{
    @Override
    public IShoes CreateShoe() {
        return new WinterShoes();
    }

    @Override
    public IDress CreateDress() {
        return new WinterDress();
    }
}
