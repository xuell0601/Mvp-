package com.example.mvp.View;

import com.example.mvp.Bean.Person;

import java.util.List;

/**
 * Created by xueliang on 2018/12/29 0029.
 */
public interface MvpView {
    /**
     * 定义统一的规则
     */
    //显示加载框
    void load();
    //显示数据
    void show(List<Person> persons);

}
