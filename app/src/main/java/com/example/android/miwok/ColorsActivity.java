package com.example.android.miwok;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    WordAdapter myAdapter;

    @Override
    protected void onStop() {
        super.onStop();
        myAdapter.releaseMediaPlayer();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Word> colorsWords = new ArrayList<Word>();
        colorsWords.add(new Word("red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        colorsWords.add(new Word("green","chokokki",R.drawable.color_green,R.raw.color_green));
        colorsWords.add(new Word("brown","tolookosu",R.drawable.color_brown,R.raw.color_brown));
        colorsWords.add(new Word("gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        colorsWords.add(new Word("black","kululli",R.drawable.color_black,R.raw.color_black));
        colorsWords.add(new Word("white","kelelli",R.drawable.color_white,R.raw.color_white));
        colorsWords.add(new Word("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colorsWords.add(new Word("mustard yelow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        myAdapter = new WordAdapter(this,colorsWords,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(myAdapter);
    }
}
