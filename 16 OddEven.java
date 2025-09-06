import java.util.*;
class OddEven
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("The number is an even number");
        else
            System.out.println("The number is an odd number");

    }
}
