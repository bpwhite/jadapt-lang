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

public class Alphabet {
    
    private ArrayList<String[]> letters = new ArrayList<String[]>();
    
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
            f1.GenerateForce();
            
            String test = "A";
            
            // Combine letter components
            String[] letter_info = new String[3];
            
            letter_info[0] = letter_name;
            letter_info[1] = test;
            letter_info[2] = f1.type;
            
            System.out.println(letter_info[0] + " -> " + letter_info[1]);
            letters.add(letter_info);
            num_letters = i;
        }

    }
    
    public ArrayList<String[]> getLetters() {
        return letters;
    }
    
    void printLetters() {
        System.out.println("Printing Alphabet: ");
        for (int i = 0; i < letters.size(); i++) {
            System.out.print("Letter: ");
            for (int j = 0; j < letters.get(i).length; j++) {
                System.out.print(letters.get(i)[j] + "\t");
            }
            System.out.println("");
        }
    }
}