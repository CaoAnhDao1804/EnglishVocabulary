package com.example.administrator.englishvocabulary.controllers;

        import com.example.administrator.englishvocabulary.model.Topic;
        import com.example.administrator.englishvocabulary.model.Vocabulary;

        import java.util.ArrayList;

/**
 * Created by Administrator on 26/01/2018.
 */

public class TopicManager {

    private ArrayList<Topic> mTopicArrayList;
    private  ArrayList<Vocabulary> mVocabularyArrayList;
    private  static  TopicManager sInstance=null;


    private TopicManager() {
        mTopicArrayList= new ArrayList<>();
        mVocabularyArrayList = new ArrayList<>();
    }
    public  static  TopicManager getsInstance(){
        if (sInstance==null){
            sInstance= new TopicManager();
        }
        return  sInstance;
    }
    public  void load(){
        mTopicArrayList.clear();
        mVocabularyArrayList.clear();


        mTopicArrayList.add(new Topic(1,"T2"));
        mTopicArrayList.add(new Topic(2,"T4"));
        mTopicArrayList.add(new Topic(3,"T3"));
        mTopicArrayList.add(new Topic(4,"T6"));

        mVocabularyArrayList.add(new Vocabulary("pen","p1","but",1));
        mVocabularyArrayList.add(new Vocabulary("pen2","p12","but2",1));
        mVocabularyArrayList.add(new Vocabulary("pen3","p13","but3",1));
        mVocabularyArrayList.add(new Vocabulary("pen4","p14","but4",1));
        mVocabularyArrayList.add(new Vocabulary("pen5","p15","but5",1));

        mVocabularyArrayList.add(new Vocabulary("pen","p1","but",2));
        mVocabularyArrayList.add(new Vocabulary("pen2","p12","but2",2));
        mVocabularyArrayList.add(new Vocabulary("pen3","p13","but3",2));
        mVocabularyArrayList.add(new Vocabulary("pen4","p14","but4",2));
        mVocabularyArrayList.add(new Vocabulary("pen5","p15","but5",2));

        mVocabularyArrayList.add(new Vocabulary("pen","p1","but",3));
        mVocabularyArrayList.add(new Vocabulary("pen2","p12","but2",3));
        mVocabularyArrayList.add(new Vocabulary("pen3","p13","but3",3));
        mVocabularyArrayList.add(new Vocabulary("pen4","p14","but4",3));
        mVocabularyArrayList.add(new Vocabulary("pen5","p15","but5",3));

        mVocabularyArrayList.add(new Vocabulary("pen","p1","but",4));
        mVocabularyArrayList.add(new Vocabulary("pen2","p12","but2",4));
        mVocabularyArrayList.add(new Vocabulary("pen3","p13","but3",4));
        mVocabularyArrayList.add(new Vocabulary("pen4","p14","but4",4));
        mVocabularyArrayList.add(new Vocabulary("pen5","p15","but5",4));

    }


    public  ArrayList<Topic> getmTopicArrayList(){
        if (mTopicArrayList.isEmpty()){
            load();
        }
        return  mTopicArrayList;

    }

    public  ArrayList<Vocabulary> getmVocabularyArrayList (Topic topic){
        ArrayList<Vocabulary> list= new ArrayList<>();
        for (Vocabulary v: mVocabularyArrayList){
            if (v.getTopicId()==topic.getId()){
                list.add(v);
            }
        }
        return list;
    }
}

