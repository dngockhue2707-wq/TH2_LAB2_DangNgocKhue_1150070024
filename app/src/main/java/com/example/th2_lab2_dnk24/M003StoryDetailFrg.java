package com.example.th2_lab2_dnk24;

import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class M003StoryDetailFrg extends Fragment {
    private static final String ARG_TITLE = "title";
    private static final String ARG_CONTENT = "content";

    public static M003StoryDetailFrg newInstance(String title, String content) {
        M003StoryDetailFrg f = new M003StoryDetailFrg();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        args.putString(ARG_CONTENT, content);
        f.setArguments(args);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.m003_frg_story_detail, container, false);
        TextView tvTitle = view.findViewById(R.id.tvStoryTitle);
        TextView tvContent = view.findViewById(R.id.tvStoryContent);

        tvTitle.setText(getArguments().getString(ARG_TITLE));
        tvContent.setText(getArguments().getString(ARG_CONTENT));

        return view;
    }
}
