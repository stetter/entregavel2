package com.stetter.entregavel2.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.stetter.entregavel2.R;

public class FragmentReceitas extends Fragment {

    public static FragmentReceitas queroUmFragment(int numeroDeFragment, String title, int color) {
        FragmentReceitas fragmentFirst = new FragmentReceitas();
        Bundle args = new Bundle();
        args.putString("TITULO", title);
        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.activity_view_page, container, false);
        Bundle umBundle = getArguments();
        String umTitulo = umBundle.getString("TITULO");

        return fragmentView;
    }
}