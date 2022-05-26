package com.example.segregacja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText odpad_input, gdzie_wyrzucic;
    Button add_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        odpad_input = findViewById(R.id.odpad_input);
        gdzie_wyrzucic = findViewById(R.id.gdzie_wyrzucic);
        add_button2 = findViewById(R.id.add_button2);

        add_button2.setOnClickListener(view -> {
            MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
            myDB.addTrash(odpad_input.getText().toString().trim(),
                    gdzie_wyrzucic.getText().toString().trim());
        });

    }
}