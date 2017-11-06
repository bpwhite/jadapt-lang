/* jadapt-lang

    Language creation routines for jadapt-lang
    
    Copyright (C) 2017 Bryan P. White

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.security.SecureRandom;

public class Alphabet {
    private ArrayList<Letter> letters = new ArrayList<Letter>();
    private int num_letters = 0;
    private int max_length = 26;
    
    public void GenerateAlphabet( int len ) {
    // Generate an evolutionary alphabet
        if (len > 26) {
            System.out.println("CANNOT DEFINE ALPHABET GREATER THAN " + 
                                max_length + " letters.");
            System.exit(0);
        }
        // Random string generator
        MathAdapt m1 = new MathAdapt();
        
        String[] assigned_letters = new String[len];
        String letter_name = new String();
        
        // Create len # of letters
        for (int i = 0; i < len; i++) {
            Letter letter = new Letter();
            
            // Create Letter name
            // Ensure letter names are not duplicated
            int unique_string = 0;
            while(unique_string == 0) {
                
                // Generate letter name
                letter_name = m1.randomString(1);
                
                for (int j = 0; j < assigned_letters.length; j++) {
                    if(letter_name == assigned_letters[j]) {
                        break;
                    }
                }
                // Add letter to assigned list
                assigned_letters[i] = letter_name;
                unique_string = 1;
            }
            // End Letter name
            
            // Create letter Force
            Force f1 = new Force();

            String test = "A";
            
            // Assign letter properties
            letter.name = letter_name;
            letter.desc = test;
            letter.force = f1;
            
            // Add letters to Alphabet array list
            letters.add(letter);
            num_letters = i;
        }
    }

    public ArrayList<Letter> getLetters() {
        return letters;
    }
    
    void printLetters() {
        System.out.println("Printing Alphabet: ");
        
        System.out.print("Name\tES_Mag\tBond_In\tBond_Out\n");
        for (Letter letter : letters) {
            System.out.print(   letter.name + "\t" 
                                + letter.force.ES_mag + "\t"
                                + letter.force.bond_in + "\t"
                                + letter.force.bond_out 
                                + "\n");
        }
    }
    
    public Letter drawLetter() {
        Letter random_letter = letters.get(new SecureRandom().nextInt(letters.size()));
        
        return random_letter;
    }
    
    
}