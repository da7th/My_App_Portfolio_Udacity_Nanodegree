package com.example.android.myappportfolio;

import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button popularMBtn, stockHBtn, buildIBBtn, makeYAMBtn, goUBtn, capstoneBtn;
    private String toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast = getText(R.string.main_toast_body).toString();

        popularMBtn = (Button) findViewById(R.id.movies_button_main_menue);
        stockHBtn = (Button) findViewById(R.id.stock_button_main_menue);
        buildIBBtn = (Button) findViewById(R.id.bigger_button_button_main_menue);
        makeYAMBtn = (Button) findViewById(R.id.material_button_main_menue);
        goUBtn = (Button) findViewById(R.id.ubiquitous_button_main_menue);
        capstoneBtn = (Button) findViewById(R.id.capstone_button_main_menue);


        launchPopularMovies();
        launchStockHawk();
        launchBuildItBigger();
        launchMakeYourAppMaterial();
        launchGoUbiquitous();
        launchCapstone();
    }

    private void launchPopularMovies(){

        popularMBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //temporary toast for this stage of the app
                Toast.makeText(MainActivity.this,toast + getText(R.string.toast_extra_movies).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void launchStockHawk(){

        stockHBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //temporary toast for this stage of the app
                Toast.makeText(MainActivity.this,toast + getText(R.string.toast_extra_stock).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void launchBuildItBigger(){

        buildIBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //temporary toast for this stage of the app
                Toast.makeText(MainActivity.this,toast + getText(R.string.toast_extra_bigger).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void launchMakeYourAppMaterial(){

        makeYAMBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //temporary toast for this stage of the app
                Toast.makeText(MainActivity.this,toast + getText(R.string.toast_extra_material).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void launchGoUbiquitous(){

        goUBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //temporary toast for this stage of the app
                Toast.makeText(MainActivity.this,toast + getText(R.string.toast_extra_ubiquitous).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void launchCapstone(){

        capstoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //temporary toast for this stage of the app
                Toast.makeText(MainActivity.this,toast + getText(R.string.toast_extra_capstone).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

}
