package com.example.pckosek.a007_fragments;

/* ------------------------*/
/*    FILE VERSION 4.0     */
/* ------------------------*/

import java.util.ArrayList;
import java.util.List;


// Custom Class that holds an array list of strings

public class WittyComment {

    int version;
    // NOTE THAT THE VARIABLE NAME HERE MUST MATCH THAT OF THE JSON
    List<Review> reviews;
    String author;

    private int mIndx;

    public WittyComment() {
        reviews = new ArrayList<Review>();
        mIndx = 0;
    }

    // public method to get the next string
    public String getNextComment() {
        Review r = reviews.get(mIndx);

        mIndx++;
        mIndx %= reviews.size();

        return r.quote;
    }

    public class Review {
        String quote;
        String author;
        float score;

        public Review() {

        }

    }

}