package com.example.mvp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mvp.Bean.Person;
import com.example.mvp.MainActivity;
import com.example.mvp.R;

import java.util.List;

/**
 * Created by xueliang on 2018/12/29 0029.
 */
public class Myadpater  extends BaseAdapter{

    private final List<Person> data;
    private final LayoutInflater lf;
    //创建构造方法
    Context con=null;

    public Myadpater(List<Person> persons, MainActivity mainActivity){
            this.data=persons;
            this.con=mainActivity;
        lf = LayoutInflater.from(con);

    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
               if(convertView==null){
                   convertView = lf.inflate(R.layout.item, null);
               }
        ImageView im = (ImageView) convertView.findViewById(R.id.im);
        TextView tv = (TextView) convertView.findViewById(R.id.tv);
        im.setImageResource(data.get(position).getText());
        tv.setText(data.get(position).getSrc());
        return convertView;
    }
}
