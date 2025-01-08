import java.util.*;
public class TemperatureConverter {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter Temperature in Celcius: ");

double cel = sc.nextFloat();

double far = (cel * 9/5) + 32;

System.out.println("Temperature in Farheinheit: " + far);
}
}