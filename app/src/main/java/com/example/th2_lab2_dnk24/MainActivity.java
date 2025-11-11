package com.example.th2_lab2_dnk24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showFrg(new M000SplashFrg());
    }

    public void showFrg(Fragment frg) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.ln_main, frg)
                .addToBackStack(null)
                .commit();
    }

    public void gotoM001Screen() {
        showFrg(new M001TopicFrg());
    }

    public void gotoM002Screen(String topic) {
        showFrg(M002StoryListFrg.newInstance(topic));
    }

    public void gotoM003Screen(String title, String content) {
        showFrg(M003StoryDetailFrg.newInstance(title, content));
    }
}
