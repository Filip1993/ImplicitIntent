package com.filipkesteli.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        setupListeners();
    }

    private void initWidgets() {
        btnGo = (Button) findViewById(R.id.btnGo);
    }

    private void setupListeners() {
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendImplicitIntent();
            }
        });
    }

    private void sendImplicitIntent() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com"));
        startActivity(intent);
    }
}
