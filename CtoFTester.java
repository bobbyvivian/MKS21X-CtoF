public class CtoFTester {

  /*
  celsiusToFahrenheit():
  parameter should be in degrees celsius as a double,
  the function should return the temperature in fahrenheit as a double

  fahrenheitToCelsius():
  parameter should be in degrees fahrenheit as a double,
  the function should return the temperature in celsius as a double
  */

  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
  }

  public static double fahrenheitToCelsius(double fahr) {
    return (fahr - 32) * 5/9;
  }

  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(0));
    System.out.println(celsiusToFahrenheit(-40));
    System.out.println(celsiusToFahrenheit(100));

    System.out.println(fahrenheitToCelsius(32));
    System.out.println(fahrenheitToCelsius(-40));
    System.out.println(fahrenheitToCelsius(212));
  }
}
