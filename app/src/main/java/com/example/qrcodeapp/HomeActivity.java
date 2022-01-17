package com.example.qrcodeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    // Initialize variable
    private Button generateQRBtn, scanQRBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Assign variable
        generateQRBtn = findViewById(R.id.idBtnGenerateQR);
        scanQRBtn = findViewById(R.id.idBtnScanQR);

        // Action of the Generate Button ----------------------------
        generateQRBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Call GenerateQRCodeActivity
                Intent i = new Intent(HomeActivity.this,GenerateQRCodeActivity.class);
                startActivity(i);
            }
        });

        // Action of the Scan Button ----------------------------
        scanQRBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Call ScanQRCodeActivity
                Intent i = new Intent(HomeActivity.this,ScanQRCodeActivity.class);
                startActivity(i);
            }
        });
    }
}