package com.example.pckosek.a007_fragments;


/* ------------------------*/
/*    FILE VERSION 4.0     */
/* ------------------------*/

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    public FragmentOne() {
    }

    public static FragmentOne newInstance() {
        FragmentOne fragment = new FragmentOne();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("This is a Fragment 1");

        Button button = (Button) rootView.findViewById(R.id.button1);
        return rootView;
    }
}
