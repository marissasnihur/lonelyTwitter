package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by marissasnihur on 2018-02-14.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private int count;

    public void add(Tweet tweet){
        tweets.add(tweet);
        if(tweets.contains(tweet)) throw new IllegalArgumentException();
    }
    public boolean hasTweet(Tweet tweet){
        if(tweets.equals(tweet)){
            return true;
        }
        //return tweets.contains(tweet);
    }
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
    public int getTweets(){
        return Collections.sort(tweets, new Comparator<Tweet>() {
            @Override
            public int compare(Tweet tweet, Tweet t1) {
                return 0;
            }
        });
    }
    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }
    public int getCount(){
        count = tweets.size();
        return count;
    }
}
