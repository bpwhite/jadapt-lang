/* jadapt-lang
*
* Math routines for jadapt-lang
*
* Copyright Bryan P. White, 2017
*/

import java.security.SecureRandom;

public class MathAdapt {

    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static SecureRandom rnd = new SecureRandom();

    public String randomString( int len ) {
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ ) 
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }
}
