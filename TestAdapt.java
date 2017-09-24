/* jadapt-lang
*
* A program for solving problems using autonomously evolving populations of
* "organisms" in a defined problem space (environment).
*
* Copyright Bryan P. White, 2017
*/
import java.util.Arrays;

public class TestAdapt {
    public static void main(String[] args) {
        
        // Spawn a new environment
        Environment e1 = new Environment();
        // Load alphabet
        e1.SpawnAlphabet(10);
        //e1.printLetters();
        
        //Arrays.toString(e1.getAlphabet().getLetters().toArray());
        
        
        Organism o1 = new Organism();
        System.out.println("Name: " + o1.getName());
    
        
        
    }
}