import java.util.*;
class kj
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int a=sc.nextInt();
        if((a&1)==1)
            System.out.println("The number is odd");
        else
            System.out.println("The number is even");
    }
}