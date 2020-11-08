package jbc_exercise1;
import java.util.Scanner;
/**
 * @author Dimitris Triantafyllou
 */
public class Jbc_Exercise1 {
    
    public static void getNumber(){
        int digit;
        boolean state;
        Scanner sc = new Scanner(System.in);
        
        do{
            if(sc.hasNextInt()){
                digit = sc.nextInt();
                if(digit >= 1 && digit <= 10){
                    System.out.println("Thank you, your number is : " + digit);
                    state = false;
                }else {
                    System.out.println("Please enter a valid number between 1-10 ");
                    state = true;
                }
            }else {
                System.out.println("Please enter a valid number between 1-10");
                getNumber();
                break;
            }   
        }while(state) ;     
        
    }
    
    public static void main(String[] args) {
        System.out.println("Please enter a number betreen 1 - 10");
        getNumber();
    }
    
}
