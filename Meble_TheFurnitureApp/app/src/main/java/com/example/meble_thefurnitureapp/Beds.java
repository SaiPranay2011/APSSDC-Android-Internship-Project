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
 * Use the {@link Beds#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Beds extends Fragment{


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Beds() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Beds.
     */
    // TODO: Rename and change types and number of parameters
    public static Beds newInstance(String param1, String param2) {
        Beds fragment = new Beds();
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
       View view =  inflater.inflate(R.layout.fragment_beds, container, false);

       ImageView BabyCotsActivity = (ImageView) view.findViewById(R.id.BabyCots);

       ImageView BedswithStorageActivity = (ImageView) view.findViewById(R.id.BedsWithStorage);

       ImageView BunkBedsActivity = (ImageView) view.findViewById(R.id.BunkBeds);

       ImageView ChildrenBedsActivity = (ImageView) view.findViewById(R.id.ChildrenBeds);

       ImageView DoubleBedsActivity = (ImageView) view.findViewById(R.id.DoubleBeds);

       ImageView SingleBedsActivity = (ImageView) view.findViewById(R.id.SingleBeds);

       ImageView SofaBedsActivity = (ImageView) view.findViewById(R.id.SofaBeds);


       BabyCotsActivity.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i;
              i = new Intent(view.getContext(),Beds_BabyCots.class);
               startActivity(i);

           }
       });

       BedswithStorageActivity.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i;
               i = new Intent(view.getContext(),Beds_BedswithStorage.class);
               startActivity(i);
           }
       });

       BunkBedsActivity.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i;
               i = new Intent(view.getContext(),Beds_BunkBeds.class);
               startActivity(i);
           }
       });

       ChildrenBedsActivity.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(view.getContext(),Beds_ChildrensBeds.class);
               startActivity(i);
           }
       });

        DoubleBedsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),Beds_DoubleBeds.class);
                startActivity(i);
            }
        });

        SingleBedsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),Beds_SIngleBeds.class);
                startActivity(i);
            }
        });

        SofaBedsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(view.getContext(),Beds_SofaBeds.class);
                startActivity(i);
            }
        });
       return view;
    }

}