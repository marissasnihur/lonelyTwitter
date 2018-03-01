package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    private TextView display;
    private String tweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        display = (TextView) findViewById(R.id.display);
        Intent intent = getIntent();
        Tweet tweet = intent.getParcelableExtra("Tweet");
        String message = tweet.getMessage();
        display.setText(message);
    }


}

