package com.example.mvp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mvp.Adapter.Myadpater;
import com.example.mvp.Bean.Person;
import com.example.mvp.Presner.Mvppre;
import com.example.mvp.View.MvpView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MvpView{

    private ListView lv;
    private Mvppre jj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
       jj = new Mvppre(this);

        jj.fetch();

    }


    @Override
    public void load() {
        Toast.makeText(MainActivity.this, "正在加载", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void show(List<Person> persons) {
        lv.setAdapter(new Myadpater(persons,this));
    }



}
