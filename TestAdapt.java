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
        
        Environment e1 = new Environment();
        e1.SpawnAlphabet(10);
        
        /*
        Arrays.toString(e1.getAlphabet().getLetters().toArray());
        */
        
        Organism o1 = new Organism();
        System.out.println("Name: " + o1.getName());
    
        
        
    }
}