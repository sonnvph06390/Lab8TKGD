package com.example.son.lab8tkgd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bai2 extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter adapter;
    List<Student> studentList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        recyclerView=findViewById(R.id.liststudent);


        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setImageBackground(R.drawable.bbb);
            student.setImageHeart(R.drawable.ic_favorite_border_black_24dp);
            student.setImageShare(R.drawable.ic_menu_share);
            studentList.add(student);

        }
        adapter=new MyAdapter(Bai2.this,studentList);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(Bai2.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}
