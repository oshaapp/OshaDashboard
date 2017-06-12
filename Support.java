package com.example.freddie.OshaUser;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freddie.oshas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Support extends Fragment {


    public Support() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_support, container, false);
    }

}
