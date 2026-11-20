/*import java.util.Scanner;
class sum_digit{
    public static void main (String arg[]){
         int sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter a number ");
        for(;n>0;n = n/10){
            sum = sum+n%10;
        }  
        System.out.println("sum"+sum);
    }
}*/
import java.util.Scanner;
class sum_digit{
    public static void main(String arg[]){
         int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        while(n>0){
            int m=n%10;
            sum=sum+m;
            n=n/10;
      
        }
        System.out.println("sum: "+sum);    
        }
    }  
        
