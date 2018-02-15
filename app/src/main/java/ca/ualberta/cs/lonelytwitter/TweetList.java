package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by marissasnihur on 2018-02-14.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int count;

    public void add(Tweet tweet){
        tweets.add(tweet);
    }
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }
    public int getCount(){
        count = tweets.size();
        return count;
    }
}
