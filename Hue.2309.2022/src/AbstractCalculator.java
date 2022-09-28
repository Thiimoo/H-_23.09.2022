public abstract class AbstractCalculator {

    protected CalculationOperation add;
    protected CalculationOperation subtract;
    protected CalculationOperation multiply;
    protected CalculationOperation divite;

    public AbstractCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divite) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divite = divite;
    }

    public void test()
    {

    }

    public abstract Number add(Number a,Number b);

    public abstract Number multiply(Number a,Number b);

    public abstract Number subtract(Number a,Number b);

    public abstract Number divide(Number a,Number b);
}
