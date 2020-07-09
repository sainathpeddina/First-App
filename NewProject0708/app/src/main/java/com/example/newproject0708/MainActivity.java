package com.example.newproject0708;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.newproject0708.R;

public class MainActivity extends AppCompatActivity {

    public void verifyEnteredText(String s){
        if (s.isEmpty()) {
            Toast.makeText(this, "There is No Input", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Entered Text " + s, Toast.LENGTH_SHORT).show();
        }
    }
    public void makeToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
    public void clickButtonMS(View v) {
        Log.i("info", "About MS Dhoni");
        EditText name = (EditText) findViewById(R.id.editText2);
        String s = name.getText().toString();
        verifyEnteredText(s);

        ImageView aa = (ImageView) findViewById(R.id.imageView2);
        aa.setImageResource(R.drawable.dhoni);
    }
    public void clickButtonAA(View v) {
        Log.i("info", "About Allu Arjun");
        EditText name = (EditText) findViewById(R.id.editText);
        String s = name.getText().toString();
        verifyEnteredText(s);

        ImageView aa = (ImageView) findViewById(R.id.imageView);
        aa.setImageResource(R.drawable.alluarjun);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);

    }
}
