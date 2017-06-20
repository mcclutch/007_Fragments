package com.example.pckosek.a007_fragments;


/* ------------------------*/
/*    FILE VERSION 5.0     */
/* ------------------------*/

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentOne extends Fragment implements View.OnClickListener{

    private View mRootView;
    private FragmentOneInterface mCallback;
    private TextView mTextView;
    private Button mButton;

    private int mClickCounter = 0;

    public FragmentOne() {
    }

    public static FragmentOne newInstance() {
        FragmentOne fragment = new FragmentOne();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_one, container, false);
        mTextView = (TextView) mRootView.findViewById(R.id.tv_01);
        mTextView.setText("This is a Fragment 1");

        mButton = (Button) mRootView.findViewById(R.id.button1);
        mButton.setOnClickListener(this);
        return mRootView;
    }

    @Override
    public void onClick(View v) {
        mClickCounter++;
        mTextView.setText(mClickCounter+"");
    }

    public interface FragmentOneInterface {
        void updateCounter(int i);
    }
}
