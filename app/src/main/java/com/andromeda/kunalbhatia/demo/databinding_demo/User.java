package com.andromeda.kunalbhatia.demo.databinding_demo;

import android.util.Log;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;

public class User {

    String name,email,imageurl;
    int age;
    boolean isonline;

    public User(String name, String email, String imageurl, int age, boolean isonline) {
        this.name = name;
        this.email = email;
        this.imageurl = imageurl;
        this.age = age;
        this.isonline = isonline;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getImageurl() {
        return imageurl;
    }

    public int getAge() {
        return age;
    }

    public boolean isIsonline() {
        return isonline;
    }

    public void clickhandler(){
        Log.e("ma","good");
        
    }
    @BindingAdapter("android:loadimage")
    public void loadimage(ImageView view,String url){
        Glide.with(view).load(url).into(view);
    }
    
}
