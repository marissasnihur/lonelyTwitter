package ca.ualberta.cs.lonelytwitter;

/**
 * Created by msnihur on 1/17/18.
 */
import java.util.Date;

public abstract class CurrentMood {
    private Date date;

    public CurrentMood(){
        this.date = new Date(System.currentTimeMillis();
    }

    public CurrentMood(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

    public Date setDate(Date date){
        this.date = date;
    }

    public String getMood(){
        if(this.isHappy()){
            return "Happy Mood";
        }
        else{
            return "Sad Mood";
        }
    }

    public abstract boolean isHappy();
}
