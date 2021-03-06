package com.onboardify.onboardifyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.onboardify.OnBoardingHelper.OnBoard;
import com.onboardify.OnBoardingHelper.OnBoardifySuccessListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnBoard.getInstance().startOnBoarding(this, this, new OnBoardifySuccessListener() {
            @Override
            public void onSuccess(String value) {
                Log.e("Test","Value");
            }
        });
    }
}
