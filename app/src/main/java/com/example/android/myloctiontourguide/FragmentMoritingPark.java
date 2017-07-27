package com.example.android.myloctiontourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.R.attr.fragment;

/**
 * Created by eKasiLab Alex CDTB on 2017/07/26.
 */

public class FragmentMoritingPark extends Fragment {

    public FragmentMoritingPark() {
    }

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main, container, false);


        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText("MoritingPark");
        return view;
    }
}
