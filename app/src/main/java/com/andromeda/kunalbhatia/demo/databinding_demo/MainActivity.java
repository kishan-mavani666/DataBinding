package com.andromeda.kunalbhatia.demo.databinding_demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.andromeda.kunalbhatia.demo.databinding_demo.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setHello("word");

        User user = new User("hardik", "h@286545", "https://cdn.myanimelist.net//images//anime//13//17405.jpg?s=59241469eb470604a792add6fbe7cce6", 23, true);
        binding.setPatel(user);

    }
}