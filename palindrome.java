import java.util.Scanner;
public class palindrome{
     public static void main (String[] args) {
         Scanner sc =  new Scanner(System.in);
         System.out.println("Enter a number");
         int num = sc.nextInt();
          int originalnum=0; int reversednum=0; int remainder=0;
         while(num!=0){
             remainder=num%10;
             originalnum= (originalnum*10) + num ;
             num = num/10;
             
             if(num==originalnum){
                 System.out.println("the number is palindrome");
                
             }
             else{
                 System.out.println("the number is not palindrome");
             }
         }
        
    }
}
