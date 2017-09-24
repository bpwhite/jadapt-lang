/* jadapt-lang
*
* Generates environmental variables for jadapt-lang
*
* Copyright Bryan P. White, 2017
*/

public class Environment {
    
    private Alphabet alphabet;
    
    public void SpawnAlphabet(int len) {
        Alphabet alphabet = new Alphabet(); // initialize new alphabet
        alphabet.GenerateAlphabet(10);      // spawn letters
        //System.out.println(alphabet.GetLetters());
        //alphabet.printLetters();
        
    }
    
    public Alphabet getAlphabet() {
        return alphabet;
    }
    

}