/* jadapt-lang

    Generates environmental variables for jadapt-lang
    
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

public class Environment {
    
    private Alphabet alphabet;
    
    public void SpawnAlphabet(int len) {
        Alphabet alphabet = new Alphabet(); // initialize new alphabet
        alphabet.GenerateAlphabet(10);      // spawn letters
        //System.out.println(alphabet.GetLetters());
        alphabet.printLetters();
        
    }
    
    public Alphabet getAlphabet() {
        return alphabet;
    }
    

}