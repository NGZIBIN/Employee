package com.example.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<AndroidVersion> OSList;
    ArrayAdapter<AndroidVersion> aaOS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv.findViewById(R.id.lv);

        OSList = new ArrayList<>();
        OSList.add(new AndroidVersion("Software Technical Leader", 3400.0, "John"));
        OSList.add(new AndroidVersion("Programmer", 2200.0, "May"));

        aaOS = new CustomAdapter(this, R.layout.row,OSList);
        lv.setAdapter(aaOS);

    }
}
