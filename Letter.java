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
    public double bond_in;
    public double bond_out;
    
    public Letter() {
        MathAdapt m1 = new MathAdapt();
        bond_in = m1.randomRange(0, 360);
        bond_out = m1.randomRange(0, 360);
        while (Math.abs(bond_in - bond_out) < 35) {
            bond_out = m1.randomRange(0, 360);
        }
        
        
    }
    
}