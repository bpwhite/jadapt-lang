/* jadapt-lang
*
* Language creation routines for jadapt-lang
*
* Copyright Bryan P. White, 2017
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Alphabet {
    
    private ArrayList<String> letters = new ArrayList<String>();
    private int num_letters = 0;
    
    public void GenerateAlphabet( int len ) {
        
        MathAdapt m1 = new MathAdapt();
        
        for (int i = 0; i < len; i++) {
            String letter_name = m1.randomString(1);
            letters.add(letter_name);
            System.out.println(letter_name);
            num_letters = i;
        }
        printLetters();
        
    }
    
    public ArrayList<String> getLetters() {
        return letters;
    }
    
    void printLetters() {
        //System.out.println("Printing Alphabet: ");
        System.out.println("Letters: ");
        //System.out.println("Letters: " + letters.getClass().getName());
        //System.out.println("Num letters: " + letters);
        // Prints letters as an array
        System.out.println(Arrays.toString(letters.toArray()));
    }
}