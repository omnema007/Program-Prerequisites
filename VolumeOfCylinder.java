import java.util.*;
public class VolumeOfCylinder {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter radius of a Cylinder: ");
float rad = sc.nextFloat();

System.out.println("Enter height of a Cylinder: ");
float height = sc.nextFloat();

double volume = 3.14 * rad * rad * height;

System.out.println("Volume of a Cylinder is: " + volume);
}
}