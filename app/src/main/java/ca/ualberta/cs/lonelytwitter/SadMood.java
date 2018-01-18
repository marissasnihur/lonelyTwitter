package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by msnihur on 1/17/18.
 */

public class SadMood extends CurrentMood{
    SadMood(){super();}
    SadMood(Date date){super(date);}

    @Override
    public boolean isHappy(){
        return false;
    }
}
}
