package com.edu.demo.simplelist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> Address;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lvAddress);
        Address = new ArrayList<>();

        Address.add("Ha Noi");
        Address.add("Hai Phong");
        Address.add("Quang Binh");
        Address.add("Quang Tri");
        Address.add("Hue");
        Address.add("Da Nang");
        Address.add("Quang Nam");
        Address.add("Binh Dinh");
        Address.add("Quy Nhon");
        Address.add("Binh Thuan");
        Address.add("Dong Nai");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Address);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ProvinceActivity.class);
                intent.putExtra("Address_name", Address.get(position).toString());
                startActivity(intent);
            }
        });
    }
}