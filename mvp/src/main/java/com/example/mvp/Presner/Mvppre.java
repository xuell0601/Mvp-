package com.example.mvp.Presner;

import com.example.mvp.Bean.Person;
import com.example.mvp.Model.ImvpModel;
import com.example.mvp.Model.MvpModel;
import com.example.mvp.View.MvpView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by xueliang on 2018/12/29 0029.
 */
public class Mvppre<T extends MvpView> {
    /**
     * 创建构造方法
     * 拿大两个的引用
     *
     */

    MvpView view;
    MvpModel model=new ImvpModel();
   public WeakReference<T> tWeakReference;

    //创建构造方法
    public Mvppre(T view){
      //  tWeakReference = new WeakReference<>(view);
          this.view=view;
    }
    //创建绑定方法
//    public void Onattch(T view){
//        tWeakReference = new WeakReference<>(view);
//    }
    //创建解绑数据
    public void Ondeattch(){
        tWeakReference.clear();
    }



    //创建方法提取数据
    public void fetch(){
          if(view!=null){
              view.load();
              if(model!=null){
                  model.loaddata(new MvpModel.OnLoadLisner() {
                      @Override
                      public void Complted(List<Person> persons) {
                          view.show( persons);
                      }
                  });
              }
          }

    }
}
