package com.example.th2_lab2_dnk24;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.fragment.app.Fragment;
import java.util.*;
import android.content.pm.ActivityInfo;

public class M001TopicFrg extends Fragment {
    private ListView lvTopics;
    private Button btnOn, btnOff;
    private final List<String> topics = Arrays.asList("Con gái", "Học sinh", "Gia đình");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.m001_frg_topic, container, false);

        lvTopics = view.findViewById(R.id.lvTopics);
        btnOn = view.findViewById(R.id.btnOn);
        btnOff = view.findViewById(R.id.btnOff);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, topics);
        lvTopics.setAdapter(adapter);

        lvTopics.setOnItemClickListener((parent, view1, position, id) -> {
            String selected = topics.get(position);
            ((MainActivity) requireActivity()).gotoM002Screen(selected);
        });

        btnOn.setOnClickListener(v -> {
            requireActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
            Toast.makeText(getContext(), "Đã bật xoay ngang!", Toast.LENGTH_SHORT).show();
        });

        btnOff.setOnClickListener(v -> {
            requireActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            Toast.makeText(getContext(), "Đã tắt xoay ngang!", Toast.LENGTH_SHORT).show();
        });

        return view;
    }
}
