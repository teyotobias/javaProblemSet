/*
Name: Teyo Turrubiates
Section: 17629
UTEID: ttt2443
 */

package Assignment1;

import java.util.Scanner;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;
public class problem3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String str = in.nextLine();
        problem3 test3 = new problem3();
        test3.speechTag(str);


    }

    public void speechTag(String str){
        MaxentTagger tagger = new MaxentTagger("src/assignment1/english-bidirectional-distsim.tagger");
        String taggedString = tagger.tagString(str);
        System.out.println(taggedString);
    }


}
