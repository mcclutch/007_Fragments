package com.example.pckosek.a007_fragments;

/* ------------------------*/
/*    FILE VERSION 5.0     */
/* ------------------------*/

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    public FragmentTwo() {
    }

    public static FragmentTwo newInstance() {
        FragmentTwo fragment = new FragmentTwo();
        return fragment;
    }


    // NEW FOR VERSION 2.0 - THIS FRAGMENT USES HIS OWN XML FILE!

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_two, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("This is a Fragment 2");
        return rootView;
    }
}
