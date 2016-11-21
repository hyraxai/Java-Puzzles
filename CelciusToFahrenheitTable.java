
//CelciusToFahrenheitTable.java

public class CelciusToFahrenheitTable
{
  public static void main(String[] args)
  {
    final double STARTING_CEL = 0;       // Starting Celcius
    final double MAX_CEL = 20;           // Maxiumum Celcius
    final double INCREMENT = 1;          // Cecius increment

    double celcius;                      // To hold the degrees in Celcius
    double fahrenheit;                   // To hold the degrees in fahrenheit

    System.out.println("Celcius\t\tFahrenheit");
    System.out.println("----------------------------------");

    for (celcius = STARTING_CEL; celcius <= MAX_CEL; celcius += INCREMENT)
    {
      fahrenheit = ((celcius * 9)/5) + 32;
      System.out.printf("%.1f\t\t%.1f\n", celcius, fahrenheit);
    }
  }
}
