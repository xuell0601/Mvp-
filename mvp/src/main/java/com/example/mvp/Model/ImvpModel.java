package com.example.mvp.Model;

import com.example.mvp.Bean.Person;
import com.example.mvp.R;

import java.util.ArrayList;

/**
 * Created by xueliang on 2018/12/29 0029.
 */
public class ImvpModel implements MvpModel {


    @Override
    public void loaddata(OnLoadLisner onLoadLisner) {

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(R.drawable.ic_launcher,"hello"));
        //将数据返回上层
        onLoadLisner.Complted(persons);

    }
}
