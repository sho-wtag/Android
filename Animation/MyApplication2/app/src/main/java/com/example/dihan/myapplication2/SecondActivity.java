package com.example.dihan.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;

public class SecondActivity extends AppCompatActivity {

    private LinearLayout scenesHolder;
    private Scene all;
    private Scene gym;
    private Scene office;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        scenesHolder = (LinearLayout) findViewById(R.id.scenes_holder);

        all = Scene.getSceneForLayout(scenesHolder, R.layout.all_scene, this);
        gym = Scene.getSceneForLayout(scenesHolder, R.layout.gym_scene, this);
        office = Scene.getSceneForLayout(scenesHolder, R.layout.office_scene, this);
    }

    public void showAllScene(View view) {
        TransitionManager.go(all, new ChangeBounds());
    }

    public void showOfficeScene(View view) {
        TransitionManager.go(office, new ChangeBounds());
    }

    public void showGymScene(View view) {
        TransitionManager.go(gym, new ChangeBounds());
    }
}
