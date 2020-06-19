package com.lupawktu.possqlite.PublicMethod;

import java.nio.charset.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Mind on 5/30/2017.
 */

public class SHA512Password {
    public String acak ( ) {
        return "Xdc$ag67#@a";
    }

    public String Hash ( String text, String salt ) {
        String generatePassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance ( "SHA-512" );
            md.update ( salt.getBytes ( StandardCharsets.UTF_8 ) );
            byte[] bytes = md.digest ( text.getBytes ( StandardCharsets.UTF_8 ) );
            StringBuilder sb = new StringBuilder ( );
            for ( byte aByte : bytes ) {
                sb.append ( Integer.toString ( ( aByte & 0xff ) + 0x100, 16 ).substring ( 1 ) );
            }
            generatePassword = sb.toString ( );
        } catch ( Exception e ) {
            e.printStackTrace ( );
        }
        return generatePassword;
    }
}
