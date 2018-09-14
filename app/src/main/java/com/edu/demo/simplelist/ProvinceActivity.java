package com.edu.demo.simplelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProvinceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView txtView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_province);

        txtView = (TextView) findViewById(R.id.txtView);
        Intent intent = getIntent();
        txtView.setText(intent.getStringExtra("Address_name"));
    }
}
