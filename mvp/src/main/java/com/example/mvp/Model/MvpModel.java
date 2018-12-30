package com.example.mvp.Model;

import com.example.mvp.Bean.Person;

import java.util.List;

/**
 * Created by xueliang on 2018/12/29 0029.
 */
public interface MvpModel {
    /**
     * 加载数据
     *
     */
      void loaddata(OnLoadLisner onLoadLisner);
    //设计内部类回调
    interface  OnLoadLisner{
      void   Complted(List<Person> persons);
    }

}
