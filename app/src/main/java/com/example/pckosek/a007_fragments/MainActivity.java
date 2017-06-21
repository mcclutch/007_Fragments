package com.example.pckosek.a007_fragments;

/* ------------------------*/
/*    FILE VERSION 6.0     */
/* ------------------------*/

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity implements FragmentOne.FragmentOneInterface{

    private WittyComment mwittyComment;

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    private int mCount = 0;

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

    @Override
    public void updateCounter(int i) {
        mCount = i;
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
                case 2 :
                    return FragmentThree.newInstance();
                default :
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3;       // Show 3 total pages.
        }
    }
}
