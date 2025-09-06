import java.util.*;
class leap
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to be checked");
        int y=sc.nextInt();
        if(y%4==0&&(y%100!=0||y%400==0))
            System.out.println("The year is a leap year");
        else
            System.out.println("The year is not a leap year");
    }
}