import java.util.*;
class Tem
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        double t = sc.nextDouble();
        double c = 0.0D;
        c = (t - 32) * 5 / 9;
        System.out.println("Temperature in ˚C:" + c + "˚C");
    }
}