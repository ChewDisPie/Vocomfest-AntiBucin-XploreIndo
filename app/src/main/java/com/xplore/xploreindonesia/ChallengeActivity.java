package com.xplore.xploreindonesia;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ChallengeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Misi");
        setContentView(R.layout.activity_challenge);
    }

    public void openDetail(View view){
        Intent intent = new Intent(this,ChallengeDetail.class);
        startActivity(intent);
    }

}
