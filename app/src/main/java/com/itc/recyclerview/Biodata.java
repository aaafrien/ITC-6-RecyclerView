package com.itc.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Biodata extends AppCompatActivity {

    ArrayList<TextView> textViews = new ArrayList<>();
    private int[] textViewId = {
            R.id.tv_name,
            R.id.tv_position,
            R.id.tv_born,
    };

    ImageView ivMember;
    Button btBack;

    String name, position, born;
    int member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        for (int value : textViewId) textViews.add(findViewById(value));
        ivMember = findViewById(R.id.iv_member);
        btBack = findViewById(R.id.bt_back);

        getIntent().hasExtra("Name");
        getIntent().hasExtra("Position");
        getIntent().hasExtra("Born");
        getIntent().hasExtra("Pict");
        name = getIntent().getStringExtra("Name");
        position = getIntent().getStringExtra("Position");
        born = getIntent().getStringExtra("Born");
        member = getIntent().getIntExtra("Pict",1);

        textViews.get(0).setText(name);
        textViews.get(1).setText(position);
        textViews.get(2).setText(born);
        ivMember.setImageResource(member);

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Biodata.this, MemberList.class);
                startActivity(intent);
            }
        });


    }
}