/* jadapt-lang

    A program for solving problems using autonomously evolving populations of
    "organisms" in a defined problem space (environment).

    In this program, organisms are units of an evolving population that is 
    working autonomously to solve problems in a given problem space. Organisms
    contain a genome, upon which selective processes are carried out. Selection
    processes optimize genomes for solving certain problems in the problem space 
    (ie. the environment).
    
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
import java.util.Arrays;

public class TestAdapt {
    public static void main(String[] args) {
        
        // Spawn a new environment
        Environment e1 = new Environment();
        // Load alphabet
        e1.SpawnAlphabet(10);
        
        
        Organism o1 = new Organism();
        System.out.println("Organism Name: " + o1.getName());
    
        
        
    }
}