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

        // Create len # of letters
        for (int i = 0; i < len; i++) {
            Letter letter = new Letter();
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
        
        System.out.print("Name\tES_Mag\tBond_In\tBond_Out\tES_Geom\tVW_mag\n");
        
        for (Letter letter : letters) {
            //System.out.print(letter.name + "\n");
            //System.out.print(letter.force.ES_mag + "\n");
            
            System.out.print(   letter.name + "\t" 
                                + letter.force.ES_mag + "\t"
                                + letter.force.bond_in + "\t"
                                + letter.force.bond_out + "\t"
                                + letter.force.ES_geom + "\t"
                                + letter.force.VW_mag
                                + "\n");
            //letter.printLocalGrid();
        }
    }
    
    public Letter drawLetter() {
        Letter random_letter = letters.get(new SecureRandom().nextInt(letters.size()));
        
        return random_letter;
    }
    
    
}