package ir.vasfa.androidlibraryv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ir.vasfa.mylogger.checkLogger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkLogger c=new checkLogger();
        String sd=c.mylog();
    }
}
