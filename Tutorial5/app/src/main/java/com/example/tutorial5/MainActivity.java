package com.example.tutorial5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = {"아이폰" , "에어팟" , "아이패드" , "맥북" ,"애플워치"};
                            // new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,items);
        ListAdapter adapter =  new ImageAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent , View view , int i , long id ){
                        String item = String.valueOf(parent.getItemAtPosition(i));
                        Toast.makeText(MainActivity.this,item,Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}