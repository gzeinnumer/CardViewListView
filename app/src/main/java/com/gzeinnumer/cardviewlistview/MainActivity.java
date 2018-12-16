package com.gzeinnumer.cardviewlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    int[] images = {R.drawable.gambar_1,R.drawable.busy,R.drawable.cry,R.drawable.devilicon,R.drawable.laught,R.drawable.love,R.drawable.mad,R.drawable.offline,R.drawable.sad,R.drawable.smile};
    String[] title = {"M. Fadli Zein And Cybertech","Busy","Cry","Devil Icon","Laught","Love","Mad","Offline","Sad","Smile"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        CardViewListViewAdapter adapter = new CardViewListViewAdapter(this,images,title);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), title[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
