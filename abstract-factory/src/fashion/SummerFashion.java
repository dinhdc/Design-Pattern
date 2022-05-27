package fashion;

public class SummerFashion implements IFashion{
    @Override
    public IShoes CreateShoe() {
        return new SummerShoes();
    }

    @Override
    public IDress CreateDress() {
        return new SummerDress();
    }
}
