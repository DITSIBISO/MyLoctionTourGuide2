package com.example.android.myloctiontourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by eKasiLab Alex CDTB on 2017/07/20.
 */

public class FragmentSpringBash extends Fragment {

    public FragmentSpringBash() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main, container, false);


        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("SpringBash");
        return view;
    }
}
