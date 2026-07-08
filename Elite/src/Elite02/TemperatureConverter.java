package Elite02;

public class TemperatureConverter implements Temperature {

	@Override
    public double cToF(double cel) {
        return (cel * 9 / 5) + 32;
    }

    @Override
    public double fToC(double fah) {
        return (fah - 32) * 5 / 9;
    }

}
