package com.example.meble_thefurnitureapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Chairs#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Chairs extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Chairs() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Chairs.
     */
    // TODO: Rename and change types and number of parameters
    public static Chairs newInstance(String param1, String param2) {
        Chairs fragment = new Chairs();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chairs, container, false);

        ImageView BenchesActivity = (ImageView) view.findViewById(R.id.Benches);

        ImageView DeskChairsActivity = (ImageView) view.findViewById(R.id.DeskChairs);

        ImageView DiningChairsActivity = (ImageView) view.findViewById(R.id.DiningChairs);

        ImageView StoolsActivity = (ImageView) view.findViewById(R.id.Stools);

        BenchesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),Chairs_Benches.class);
                startActivity(i);
            }
        });

        DeskChairsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),Chairs_DeskChairs.class);
                startActivity(i);
            }
        });

        DiningChairsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),Chairs_DiningChairs.class);
                startActivity(i);
            }
        });

        StoolsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),Chairs_Stools.class);
                startActivity(i);
            }
        });
        return view;
    }
}