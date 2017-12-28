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
    // debug
    private int verbose = 1;
    
    public Force force = new Force();
    public String name;
    public String desc;
    
    // List to hold assigned letter string names
    private static ArrayList<String> assigned_ltr = new ArrayList<String>();
    
    // Local Letter Grid
    private int grid_dims = 50; // ensure LOCAL grid is square
    private int lg_x_max = grid_dims;
    private int lg_y_max = grid_dims;
    
    private String[][] local_grid = new String[lg_y_max][lg_x_max];
    
    public Letter() {
        // Constructor for a new letter
        StericWalker(); // create local grid
        GenerateName(); // assign a unique alphanumeric letter
        GenerateOctagon(0.1); // Generate shape
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
                continue; // Contains the name already, retry.
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
    
    private void GenerateOctagon(double fill) {
        // List of points
        ArrayList<Double[]> points = new ArrayList<>();

        
        // Diameter fills grid to a %
        double diameter = grid_dims - fill*grid_dims;
        double midpoint = grid_dims/2;
        double radius = diameter/2;
                
        // Internal angle
        double polygon_sides = 8;
        double internal_a = 360/polygon_sides;
        double edge_length = Math.sqrt( Math.pow(radius, 2) + Math.pow(radius, 2) 
                                        - 2*(radius)*(radius)*Math.cos(internal_a*Math.PI/180));
        
        if(verbose == 1) {
            System.out.print("Diameter: " + diameter + "\n" +
                            "Midpoint: " + midpoint + "\n" +
                            "Radius: " + radius + "\n" +
                            "Internal A: " + internal_a + "\n" +
                            "Edge length: " + edge_length + "\n");
        }
        double[] p0 = new double[2];
        p0[0] = midpoint;           // midpoint x
        p0[1] = midpoint;           // midpoint y
        
        double[] p1 = new double[2];
        p1[0] = midpoint + radius;  // p1 x
        p1[1] = midpoint;           // p1 y
        
        double[] p2 = new double[2];
        //p1[0] = 
        //p1[1] = 
        
    }
    
    public void printLetter() {
        System.out.print(   name + "\t" 
                    + force.ES_mag + "\t"
                    + force.bond_in + "\t"
                    + force.bond_out + "\t"
                    + force.ES_geom + "\t"
                    + force.VW_mag
                    + "\n");
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