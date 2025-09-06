import java.util.*;
class cpi
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        double p = sc.nextDouble();
        System.out.println("Enter the rate");
        double r = sc.nextDouble();
        System.out.println("enter the time");
        double t = sc.nextDouble();
        double ci = p*(1+(r/100))*t;
        System.out.println("Compound Interest=" + ci);
    }
}

