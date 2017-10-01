/* 
    The Organism class constitutes an individual organism with a unique genome
    upon which genetic algorithms can be applied.
    
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