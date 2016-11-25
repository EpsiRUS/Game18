package ru.samsung.itschool.game18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Blabla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blabla);
    }
    public void play(View v) {
        Intent intent = new Intent (this, MainActivity.class);
        EditText et = (EditText)findViewById(R.id.editText);
        String text = et.getText().toString();
        intent.putExtra("size", text);
        startActivity(intent);
        finish();
    }
}
