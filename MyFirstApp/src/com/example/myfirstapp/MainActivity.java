package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState); //부모의 클래스를 초기화 한다.! 부모클래스 ->Activity
        setContentView(R.layout.main);
        Button myButton = (Button)findViewById(R.id.button);
       
    }
}
