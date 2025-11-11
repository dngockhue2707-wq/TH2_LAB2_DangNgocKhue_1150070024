package com.example.th2_lab2_dnk24;

import android.os.Bundle;
import android.os.Handler;
import android.view.*;
import androidx.fragment.app.Fragment;

public class M000SplashFrg extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.m000_frg_splash, container, false);
        new Handler().postDelayed(() -> ((MainActivity)getActivity()).gotoM001Screen(), 2000);
        return view;
    }
}
