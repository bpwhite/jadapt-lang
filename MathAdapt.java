/* jadapt-lang

    Math routines for jadapt-lang

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

import java.security.SecureRandom;

public class MathAdapt {

    static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String randomString( int len ) {
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ ) 
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }
    
    public int randomRange( int min, int max ) {
        SecureRandom rnd = new SecureRandom();
        int range = max - min + 1;
        int x = rnd.nextInt(range) + min;
        return x;
    }
}
