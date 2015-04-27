package com.example.ryant.swipeviewtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ryant on 4/26/2015.
 */
public class StartPageActivity extends Activity {
    Button mLaunchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        mLaunchButton = (Button) findViewById(R.id.startButton);

    }

    public void launchScreenSlide(View view)
    {
        Intent intent = new Intent(this, ScreenSlideActivity.class);
        // Destroy launch activity after starting ScreenSlideActivity
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }


}
