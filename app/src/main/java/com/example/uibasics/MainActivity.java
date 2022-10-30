package com.example.uibasics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtTxtName;
    private TextView txtHello;

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnHello:
//                Toast.makeText(this, "Hello Button Clicked", Toast.LENGTH_SHORT).show();
                txtHello.setText("Hello" + edtTxtName.getText().toString());
                break;
            case R.id.edtTxtName:
                Toast.makeText(this, "Attempting to type something..",
                        Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);

        btnHello.setOnClickListener(this);

        edtTxtName = findViewById(R.id.edtTxtName);
        txtHello = findViewById(R.id.txtHello);

        edtTxtName.setOnClickListener(this);


    }
}