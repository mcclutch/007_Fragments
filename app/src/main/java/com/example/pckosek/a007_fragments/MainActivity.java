package com.example.pckosek.a007_fragments;

/* ------------------------*/
/*    FILE VERSION 3.0     */
/* ------------------------*/

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.view.WindowManager;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    private WittyComment mwittyComment;

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


        // PUT THE JSON READING STUFF IN A SEPARATE CLASS TO MAKE THIS CLEANER!!
        //  [also, an activity is a Context]
        mwittyComment = new JSONReader(this).readFile();

    }

    // A Fragment of type #1

    public static class FragmentOne extends Fragment {

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
            return rootView;
        }
    }

    // A Fragment of type #2

    public static class FragmentTwo extends Fragment {

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


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0 :
                    return FragmentOne.newInstance();
                case 1 :
                    return FragmentTwo.newInstance();
                default :
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }
    }
}
