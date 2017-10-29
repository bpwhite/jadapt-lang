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
import java.util.ArrayList;

public class Environment {
    
    public Alphabet alphabet = new Alphabet();
    public ArrayList<Molecule> molecules = new ArrayList<Molecule>();

    
    public void SpawnEnvironment(   int alph_len, 
                                    int num_mols,
                                    int max_mol_size) {
        // Generate Alphabet
        alphabet.GenerateAlphabet(alph_len);      // spawn letters
        
        for(int i = 0; i < num_mols; i++) {
            Molecule molecule = new Molecule();
            MathAdapt m1 = new MathAdapt();
            
            int mol_size = m1.randomRange(1, max_mol_size);
            molecule.SpawnMolecule(alphabet, mol_size);
            molecules.add(molecule);
        }
    }
    
    public Alphabet getAlphabet() {
        return alphabet;
    }
    
    public ArrayList<Molecule> getMolecules() {
        return molecules;
    }
    
    void printMolecules() {
        System.out.println("Printing Molecules: ");
        
        System.out.print("ID\tGenome\n");
        for (Molecule molecule : molecules) {
            System.out.print(molecule.getMolID() + "\t" + molecule.genomeString() + "\n");
        }
    }

}