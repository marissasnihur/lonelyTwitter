package ca.ualberta.cs.lonelytwitter;

/**
 * Created by msnihur on 1/17/18.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException;

}
