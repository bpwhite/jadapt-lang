/* 
    The Force class.
    
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

public class Force {
    public double ES_dir; // electrostatic
    public double ES_mag;
    public String ES_geom;
    
    public double VW_mag; // van der waals

    public double bond_in;
    public double bond_out;

    private String[] geoms = {  "sphere",
                                "cone"
                                };
    

    // "ES" electrostatic type force
    // "VW" van der waals type force

    public Force() {
        MathAdapt m1 = new MathAdapt();

        bond_in = m1.randomRange(0, 360);
        bond_out = m1.randomRange(0, 360);
        while (Math.abs(bond_in - bond_out) < 35) {
            bond_out = m1.randomRange(0, 360);
        }
        
        ES_dir = m1.randomRange(0, 360);
        ES_mag = m1.randomRange(1,500);
        ES_geom = geoms[m1.randomRange(0, 1)];
        
        VW_mag = m1.randomRange(1,10);
    }

    
}