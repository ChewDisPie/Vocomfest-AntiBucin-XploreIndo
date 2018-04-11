package com.xplore.xploreindonesia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final Button button_gallery = (Button) findViewById(R.id.buttonGalllery);
        final Button button_xmart = (Button) findViewById(R.id.buttonXmart);
        final Button button_jelajah = (Button) findViewById(R.id.buttonJelajah);
        final Button button_profile = (Button) findViewById(R.id.buttonProfile);
        button_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGallery();
            }
        });

        button_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfile();
            }
        });

        button_jelajah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openJelajah();
            }
        });
        button_xmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openXmart();
            }
        });
    }

    private void openJelajah() {
        Intent intent = new Intent(this, Jelajah.class);
        startActivity(intent);
    }

    private void openProfile() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    private void openGallery() {
        Intent intent = new Intent(this, Gallery.class);
        startActivity(intent);
    }

    private void openXmart() {
        Intent intent = new Intent(this, XmartActivity.class);
        startActivity(intent);
    }

}
