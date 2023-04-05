package ru.mirea.gorkoun.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        textView=findViewById(R.id.intentAppTextView);
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("key");
        int numInOrder = 7;
        textView.setText("КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ " + Math.pow(numInOrder, 2) + " , А ТЕКУЩЕЕ ВРЕМЯ " + value);
    }
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}