package com.example.mvp.Bean;

/**
 * Created by xueliang on 2018/12/29 0029.
 */
public class Person {


    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    private String src;
    private int text;
    public Person(int text, String src) {
        this.text = text;
        this.src = src;
    }



}
