package ru.mirea.gorkoun.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    private EditText editTextUserBook;

    private TextView textViewUserBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        editTextUserBook = findViewById(R.id.editTextBook);
        textViewUserBook = findViewById(R.id.textViewBookShare);
        editTextUserBook.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                // do nothing
            }

            @Override
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                textViewUserBook.setText("Любимая книга разработчика: " + text);
            }

            @Override
            public void afterTextChanged(Editable text) {
                // do nothing
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume();
        textViewUserBook.setText("Любимая книга разработчика: " + editTextUserBook.getText().toString());
    }
    public void SendInfoToMainActivity (View view){
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, editTextUserBook.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }

}