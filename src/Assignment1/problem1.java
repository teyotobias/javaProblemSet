/*
Name: Teyo Turrubiates
Section: 17629
UTEID: ttt2443
 */

package Assignment1;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        System.out.print("Please enter the number of adjacent digits: ");
        int adj = in.nextInt();
        System.out.print("Please enter digits to look through: ");
        String numbers = in.next();
        problem1 test = new problem1();
        test.greatProd(numbers, adj);


    }
    public void greatProd(String nums, int number){
        int max = 0;
        int potent = 0;
        int prod = 0;
        int x = 0;
        for(int i = 0; i < nums.length();i++){
            while(x < number && i + x < nums.length()){
                if(potent == 0){
                    potent = Character.getNumericValue(nums.charAt(i+x));
                    x++;
                }
                else {
                    if(Character.getNumericValue(nums.charAt(i+x)) == 0){
                        x++;
                        continue;
                    }
                    else {
                        potent *= Character.getNumericValue(nums.charAt(i + x));
                        x++;
                    }
                }
            }
            x = 0;
            if(potent > max){
                max = potent;
            }
            potent = 0;

        }
        prod = max;
        System.out.println("The highest product is: " + prod);
    }

}
