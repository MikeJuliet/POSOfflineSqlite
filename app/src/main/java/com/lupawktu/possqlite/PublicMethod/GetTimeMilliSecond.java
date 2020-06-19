package com.lupawktu.possqlite.PublicMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Mind on 6/1/2017.
 */

public class GetTimeMilliSecond {

    public String timeMilliSecond ( String datetime ) {
        long timeInMilliseconds = 0;
        SimpleDateFormat sdf = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss", Locale.ENGLISH );
        try {
            Date mDate = sdf.parse ( datetime );
            if ( mDate != null )
                timeInMilliseconds = mDate.getTime ( );
            System.out.println ( "Date in milli :: " + timeInMilliseconds );
        } catch ( ParseException e ) {
            e.printStackTrace ( );
        }
        return String.valueOf ( timeInMilliseconds );
    }
}
