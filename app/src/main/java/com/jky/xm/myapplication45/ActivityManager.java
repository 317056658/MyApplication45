package com.jky.xm.myapplication45;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/6.
 */

public class ActivityManager {
    public static List<Activity> activities=new ArrayList<>();
    public  static  void addActivity(Activity activity){
         activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static  void finishAll(){
        for (Activity activity: activities){
            //isFinishing()判断当前Activity 是否 关闭
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }


}
