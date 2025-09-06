import java.util.*;
class Floating
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = 0.0f;
        c = a * b;
        System.out.println("Product=" + c);
    }
}
