package com.example.pckosek.a007_fragments;

/* ------------------------*/
/*    FILE VERSION 6.0     */
/* ------------------------*/

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentThree extends Fragment {

    public FragmentThree() {
    }

    public static FragmentThree newInstance() {
        FragmentThree fragment = new FragmentThree();
        return fragment;
    }


    // NEW FOR VERSION 2.0 - THIS FRAGMENT USES HIS OWN XML FILE!

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_three, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.tv_f3);
        textView.setText("This is a Fragment 3");
        return rootView;
    }
}
