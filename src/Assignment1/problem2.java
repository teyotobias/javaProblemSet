/*
Java program that takes as input a paragraph as a String and identifies if any of
the words in the paragraph is a $1.00 word. The value of each word is
calculated by adding up the value of each one of its characters.
Each letter in the alphabet is worth its position in pennies i.e. a = 1, b=2... y=25, z=26.
Capital and lowercase letters have the same values. All non-alpha characters have a value of $0.00.
 */
package Assignment1;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter words");
        String newString = in.nextLine();
        problem2 test2 = new problem2();
        test2.dollarWord(newString);
    }

//find words worth a dollar
//use subtraction from ascii values to track letters back to program-defined values (1,2,3...)
//keep track of where current word begins
//use string substr library function to print out dollar word substring
//words end on spaces
//make sure to exclude values that are not letters
    public void dollarWord(String para){
        char x = ' ';
        int a = 0;
        int dollarCheck = 0;
        int p = 0;

        for(int y = 0; para.length() > y; y++){
            a = y;
            while(para.length() > y && para.charAt(y) != 32 ){
                p = para.charAt(y);
                if(p > 64){
                    if(p == 96){
                        y++;
                        continue;
                    }
                    if(p < 91){
                        p += 32;
                    }
                    p-= 96;
                    dollarCheck += p;
                    y++;
                }
                else {
                    y++;
                }

            }
            if(dollarCheck == 100){
                System.out.println(para.substring(a,y));
            }
            dollarCheck = 0;

            //while(para[y] != " ")
                //if(para[y] is a letter (in ascii range)
            //check if its capital or lowercase
                    //dollarCheck += para[y] - ascii common
            //IF dollarCheck = 100
                //System.out.println(para.substring(a,y)
            //dollarCheck = 0
        }
    }
}
