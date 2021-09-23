public class CtoFTester {

  /* celsiusToFahrenheit()
  parameter should be degrees in celsius as a double,
  the function should return the temperature in fahrenheit as a double
  */

  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
  }

  /* fahrenheitToCelsius()
  parameter should be degrees in fahrenheit as a double,
  the function should return the temperature in celsius as a double
  */

  public static double fahrenheitToCelsius(double fahr) {
    return (fahr - 32) * 5/9;
  }

}
