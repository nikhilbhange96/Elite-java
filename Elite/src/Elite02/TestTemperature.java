package Elite02;

public class TestTemperature {
	public static void main(String[] args) {

        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheit = converter.cToF(25);
        System.out.println("25 Celsius = " + fahrenheit + " Fahrenheit");

        double celsius = converter.fToC(77);
        System.out.println("77 Fahrenheit = " + celsius + " Celsius");
    }
	
}
