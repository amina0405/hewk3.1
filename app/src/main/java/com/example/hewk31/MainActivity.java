package com.example.hewk31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText gmail, theme, message;
    private Button send;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gmail = findViewById(R.id.gmail);
        theme = findViewById(R.id.theme);
        message = findViewById(R.id.message);
        send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("gmail",gmail.getText().toString(),null));
                intent.putExtra(Intent.EXTRA_EMAIL,gmail.getText().toString());
                intent.putExtra(Intent.EXTRA_SUBJECT,theme.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,message.getText().toString());
                startActivity(Intent.createChooser(intent,"send"));

            }
        });

    }
}