import java.util.*;
public class AreaOfCircle {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius of a circle: ");
float rad = sc.nextFloat();

double area = 3.14 * rad * rad;

System.out.println("Area of Circle is: "+ area);

}
}