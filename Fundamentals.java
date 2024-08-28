import java.util.Scanner;
public class Fundamentals {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num>0)
         System.out.println("Positive");
        else if(num<0)
         System.out.println("Negative");
        else{
            System.out.println("zero");
        }
        switch(num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid");
        } 
        for(int i=1;i<=num;i++){
            System.out.print(i);
        }
        int n=num;
        System.out.println();
        while(n>0){
            System.out.print(n);
            n--;
        }
        n=1;
        System.out.println();
        do { 
            System.out.print(n);
            n++;
        } while (n<=3);
    }
}
