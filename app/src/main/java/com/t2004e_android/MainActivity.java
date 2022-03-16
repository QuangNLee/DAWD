package com.t2004e_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button btnSubmit;
    private TextView lblName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Lay cac phan tu tu ngoai view theo id bang ham implicit findViewById()
        editText = findViewById(R.id.txtName);
        btnSubmit = findViewById(R.id.btnSubmit);
        lblName = findViewById(R.id.labelName);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                lblName.setText(name);
            }
        });
        editText.setText("Hello Night!!!");
    }
}