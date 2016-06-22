package com.example.chukc.roundtextviewsample;

import android.app.Activity;
import android.os.Bundle;

import com.example.chukc.roundtextviewsample.view.RoundTextView;

public class MainActivity extends Activity {

	private RoundTextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTv = (RoundTextView)findViewById(R.id.testTv);
    }

}
