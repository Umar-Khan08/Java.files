import java.sql.SQLOutput;
import java.util.*;
class Great
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&b>c)
            System.out.println("The greatest of the three numbers is:"+ a);
        else if(b>a&&a>c)
            System.out.println("The greatest of the three numbers is:"+ b);
        else
            System.out.println("The greatest of the three numbers is:"+ c);
    }
}
