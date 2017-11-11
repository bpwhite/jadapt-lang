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

class Letter {
    
    public String name;
    public Force force;
    public String desc;

    // Local Letter Grid
    private int lg_x_max = 50;
    private int lg_y_max = 50;
    
    private String[][] local_grid = new String[lg_x_max][lg_y_max];
    
    public Letter() {
        // empty constructoror
        StericWalker();
    }
    
    private void StericWalker() {
        for (int i = 0; i < lg_x_max; i++) {
            for(int j = 0; j < lg_y_max; j++) {
                local_grid[i][j] = ".";
            }
        }
    }
    
    public void printLocalGrid() {
        for (int i = 0; i < lg_x_max; i++) {
            for(int j = 0; j < lg_y_max; j++) {
                System.out.print(local_grid[i][j]);
            }
            System.out.print("\n");
        }
    }
}