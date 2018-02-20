package com.mohammedfahadkaleem.ultimatetoastlibrarysample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.mohammedfahadkaleem.ultimatetoast.UltimateToast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private int white = Color.WHITE;
    private int blue = Color.parseColor("#69B6E8");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_basic_toast).setOnClickListener(this);
        findViewById(R.id.btn_basic_toast_duration).setOnClickListener(this);
        findViewById(R.id.btn_basic_toast_icon).setOnClickListener(this);
        findViewById(R.id.btn_basic_toast_icon_duration).setOnClickListener(this);
        findViewById(R.id.btn_success_toast).setOnClickListener(this);
        findViewById(R.id.btn_error_toast).setOnClickListener(this);
        findViewById(R.id.btn_warning_toast).setOnClickListener(this);
        findViewById(R.id.btn_custom_icon_background_text).setOnClickListener(this);
        findViewById(R.id.btn_custom_two_icons_background_text).setOnClickListener(this);
/*      UltimateToast.setDefaultBackgroundColor(yellow);
        UltimateToast.setDefaultTextColor(Color.RED);
        UltimateToast.setDisableIcon(true);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.rammetto_one_regular);
        UltimateToast.setFont(typeface);
        UltimateToast.setTextSize(100);
        UltimateToast.reset();*/
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_basic_toast:
                UltimateToast.make(this,
                        "Basic Toast!").show();
                break;
            case R.id.btn_basic_toast_duration:
                UltimateToast.make(this,
                        "Basic Toast w/ Duration",
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_basic_toast_icon:
                UltimateToast.make(this,
                        "Basic Toast w/ Icon",
                        view.getResources().getDrawable(R.drawable.ic_refresh_black_24dp)).show();
                break;
            case R.id.btn_basic_toast_icon_duration:
                UltimateToast.make(this,
                        "Basic Toast w/ Icon and Duration",
                        view.getResources().getDrawable(R.drawable.ic_refresh_black_24dp),
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_success_toast:
                UltimateToast.makeSuccess(this, "Success Toast", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_error_toast:
                UltimateToast.makeError(this, "Error Toast", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_warning_toast:
                UltimateToast.makeWarning(this, "Warning Toast", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_custom_icon_background_text:
                UltimateToast.make(this, "Someone replied to your tweet", view.getResources().getDrawable(R.drawable.twitter), white, blue, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_custom_two_icons_background_text:
                UltimateToast.make(this,
                        "Someone replied to your tweet",
                        view.getResources().getDrawable(R.drawable.twitter),
                        view.getResources().getDrawable(R.drawable.pin),
                        white, blue, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

