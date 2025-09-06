import java.util.*;
class Area
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the HEIGHT of Triangle");
        double h = sc.nextDouble();
        System.out.println("Enter the Base of Triangle");
        double b = sc.nextDouble();
        double area = 0.0D;
        area = 0.5 * b * h;
        System.out.println("Area of Triangle=" + area);
    }
}