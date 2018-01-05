package com.example.android.miwok;

import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

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

        ArrayList<Word> phrasesWords = new ArrayList<Word>();
        phrasesWords.add(new Word("Where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        phrasesWords.add(new Word("What is your name?","tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        phrasesWords.add(new Word("My name is...","oyaaset...",R.raw.phrase_my_name_is));
        phrasesWords.add(new Word("How are you feeling?","michәksәs?",R.raw.phrase_how_are_you_feeling));
        phrasesWords.add(new Word("I’m feeling good.","kuchi achit",R.raw.phrase_im_feeling_good));
        phrasesWords.add(new Word("Are you coming?","әәnәs'aa?",R.raw.phrase_are_you_coming));
        phrasesWords.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        phrasesWords.add(new Word("I’m coming.","әәnәm",R.raw.phrase_im_coming));
        phrasesWords.add(new Word("Let’s go.","yoowutis",R.raw.phrase_lets_go));
        phrasesWords.add(new Word("Come here.","әnni'nem",R.raw.phrase_come_here));

        myAdapter = new WordAdapter(this,phrasesWords,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(myAdapter);
    }
}
