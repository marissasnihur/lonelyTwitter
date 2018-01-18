package ca.ualberta.cs.lonelytwitter;

/**
 * Created by msnihur on 1/17/18.
 */
import java.util.Date;
public class HappyMood extends CurrentMood{
    HappyMood(){super();}
    HappyMood(Date date){super(date);}

    @Override
    public boolean isHappy(){
        return True;
    }
}
