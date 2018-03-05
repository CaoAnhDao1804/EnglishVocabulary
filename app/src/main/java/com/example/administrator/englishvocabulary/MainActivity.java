package com.example.administrator.englishvocabulary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.englishvocabulary.controllers.TopicManager;
import com.example.administrator.englishvocabulary.model.Topic;
import com.example.administrator.englishvocabulary.model.Vocabulary;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TopicManager topicManager= TopicManager.getsInstance();
        topicManager.load();
        ArrayList<Topic> topics= topicManager.getmTopicArrayList();
        for (Topic t: topics){
            System.out.println(t.toString());
        }

        public void  gotoLearn(View view){
            Intent  intent= new Intent();
            startActivities(intent);
    }
    ArrayList<Vocabulary> vocabularies= topicMan
    ArrayList<Vocabulary> vocabularies= topicManager.getmVocabularyArrayList();
        for (Vocabulary v: vocabularies){
            System.out.println(v.toString());
        }
    }
}
