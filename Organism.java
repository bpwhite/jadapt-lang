/* 
* The Organism class constitutes an individual organism with a unique genome
* upon which genetic algorithms can be applied.
*
* In this program, organisms are units of an evolving population that is 
* working autonomously to solve problems in a given problem space. Organisms
* contain a genome, upon which selective processes are carried out. Selection
* processes optimize genomes for solving certain problems in the problem space 
* (ie. the environment).
*
*
* Copyright Bryan P. White, 2017
*/

public class Organism {
    private String name; // Unique identifier for this individual organism

    public Organism() {
        MathAdapt s1 = new MathAdapt();
        name = s1.randomString(10);
        
    }
    
    public String getName() {
        return name;
    }
    
}