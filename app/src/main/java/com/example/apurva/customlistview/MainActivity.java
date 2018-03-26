package com.example.apurva.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    int[] picture={R.drawable.icon1,R.drawable.icon2,R.drawable.password,R.drawable.share_this};
    String[] names={"Mohan","Arjun","Apurva","Raj"};
    ListView mylist;
    MyCustomAdapter myCustomAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylist=findViewById(R.id.mylistview);

        myCustomAdapter=new MyCustomAdapter(this,names,picture);
        mylist.setAdapter(myCustomAdapter);
    }
}
