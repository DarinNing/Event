package com.example.admin.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new MyClickListener());
    }

    class MyClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view){
            EditText editText = (EditText) findViewById(R.id.editText);
            editText.setText("bubububu");
        }
    }
}
