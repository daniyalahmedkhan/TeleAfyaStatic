package com.example.ast.teleafya.Ui.Doctor_Ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ast.teleafya.R;

public class AddEducation_Doctor extends AppCompatActivity {



    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_education__doctor);

        btn1 = (Button) findViewById(R.id.AddWork);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddEducation_Doctor.this , AddWork_Doctor.class);
                startActivity(intent);
            }
        });
    }
}
