import java.util.*;
class BitwiseXor
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int f=sc.nextInt();
        System.out.println("Enter the second number");
        int s=sc.nextInt();
        int r=f^s;
        System.out.println("Result:  "+r);
    }
}