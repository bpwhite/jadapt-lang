/* jadapt-lang
*
* Language creation routines for jadapt-lang
*
* Copyright Bryan P. White, 2017
*/

import java.util.ArrayList;

public class Alphabet {
    
    private ArrayList<String> letters = new ArrayList<String>();
    
    public void GenerateAlphabet( int len ) {
        
        MathAdapt m1 = new MathAdapt();
        
        for (int i = 0; i < len; i++) {
            String letter_name = m1.randomString(1);
            letters.add(letter_name);
            System.out.println(letter_name);
        }
    }
    
    public ArrayList<String> getLetters() {
        return letters;
    }
}