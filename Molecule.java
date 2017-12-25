/* 
    Molecule class. Group of covalently bonded letters.
    
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

public class Molecule {
    
    private ArrayList<Letter> genome = new ArrayList<Letter>();
    private String molecule_id;
    
    // Create a molecule (grouped letters) within
    // a random size range.
    public void SpawnMolecule(  Alphabet alphabet,
                                int max_mol_size) {
        MathAdapt m1 = new MathAdapt();
        
        // Number of start letters in the molecule
        int mol_size = m1.randomRange(1, max_mol_size);
        
        for (int i = 0; i < mol_size; i++) {
            genome.add(alphabet.drawLetter());
        }
        
        MathAdapt s1 = new MathAdapt();
        molecule_id = s1.randomString(10);
    }
    
    public ArrayList<Letter> getGenome() {
        return genome;
    }
    
    public String getMolID() {
        return molecule_id;
    }
    
    public String genomeString() {
        // Return a string version of the concatenated genome (letter) names
        String genomeStr = "";
        
        for (Letter letter : genome) {
            genomeStr = genomeStr.concat(letter.name);
        }
        
        return genomeStr;
    }


}