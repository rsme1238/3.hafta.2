
package pkg3.hafta.pkg2;

import java.util.Scanner;

public class Hafta2 {

    
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       
        System.out.println("Enter a number 1-7: ");
        int n =input.nextInt();
        
        if(n==1){
            System.out.println("Today is Sun");
        }
        else if(n==2){
            System.out.println("Today is Mon");
        }
        
         else if(n==3){
            System.out.println("Today is Tus");
        } 
         else if(n==4){
            System.out.println("Today is Wen");
        }
         else if(n==5){
            System.out.println("Today is Thurs");
        }
         else if(n==6){
            System.out.println("Today is Fri");
        }
         else if(n==7){
            System.out.println("Today is Sat");
        }
         else{
            System.out.println("Err");
        }
        
    }
    
}
