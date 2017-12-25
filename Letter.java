/* jadapt-lang

    Letter class for jadapt-lang
    
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

class Letter {
    
    public Force force = new Force();
    public String name;
    public String desc;
    
    private static ArrayList<String> assigned_ltr = new ArrayList<String>();
    
    // Local Letter Grid
    private int lg_x_max = 25;
    private int lg_y_max = 10;
    
    private String[][] local_grid = new String[lg_y_max][lg_x_max];
    
    public Letter() {
        // Constructor for a new letter
        StericWalker(); // create local grid
        GenerateName(); // assign a unique alphanumeric letter
        String test = "A";
        desc = test;
    }
    
    private void GenerateName() {
        int unique_string = 0; // flag for unique string check
        
        MathAdapt m1 = new MathAdapt();
        
        while(unique_string == 0) {
            // Generate a random alphanumeric string of 1
            String temp_name = m1.randomString(1);
            // Check if temp_name has been assigned yet
            
            if(assigned_ltr.contains(temp_name)) {
                break; // Contains the name already, retry.
            }
 
            // Add letter to assigned list
            name = temp_name;
            assigned_ltr.add(name);
            unique_string = 1;
        }
    }
    
    private void StericWalker() {
    // Creates an empty local grid
        for (int y = 0; y < lg_y_max; y++) {
            for(int x = 0; x < lg_x_max; x++) {
                local_grid[y][x] = ".";
            }
        }
    }
    
    public void printLocalGrid() {
        for (int y = 0; y < lg_y_max; y++) {
            for(int x = 0; x < lg_x_max; x++) {
                System.out.print(local_grid[y][x]);
            }
            System.out.print("\n");
        }
    }
}