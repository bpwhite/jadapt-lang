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
    // Environments are the unit of simulation
    // Unique ID for environment
    public int env_id;
    private int env_id_max = 9999999;
    // Ensure environment ID's are unique
    public static ArrayList<Integer> env_ids = new ArrayList<>();
    
    // Container for the evolutionary alphabet
    public Alphabet alphabet = new Alphabet();
    
    // Container for molecules present in the environment
    public ArrayList<Molecule> molecules = new ArrayList<Molecule>();
    
    // Constructor for Environment class
    public Environment() {
        int unique_id = 0; // flag for unique env_id check
        MathAdapt m1 = new MathAdapt();
        // Check ID list
        
        while(unique_id == 0) {
            int temp_id = m1.randomRange(1, env_id_max);
            if(env_ids.contains(temp_id)) {
                continue; // contains ID # already
            }
        
            // Add assigned ID to list
            env_id = temp_id;
            env_ids.add(env_id);
            unique_id = 1;
        }
    }
    
    public void SpawnEnvironment(   int alph_len, 
                                    int num_mols,
                                    int max_mol_size) {
        System.out.print("Environment ID: " + env_id + "\n");
        // Generate Alphabet
        alphabet.GenerateAlphabet(alph_len);      // spawn letters
        
        // Generate molecules from alphabet
        for(int i = 0; i < num_mols; i++) {
            // Initialize empty molecule
            Molecule molecule = new Molecule();
            
            // Assign letters to molecule
            molecule.SpawnMolecule(alphabet, max_mol_size);
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