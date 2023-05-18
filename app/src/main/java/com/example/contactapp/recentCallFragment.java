package com.example.contactapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class recentCallFragment extends Fragment {

    RecyclerView recyclerView;

    CallAdapter callAdapter;
    ArrayList<CallModel> callModelArrayList;

    RecyclerView recyclerView;
    ArrayList<CallModel> callModelArrayList;
    CallAdapter callAdapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recent_call,null);
        recyclerView = v.findViewById(R.id.recycler_recent);

        callModelArrayList = new ArrayList<>();

        callAdapter = new CallAdapter(getContext(),callModelArrayList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(callAdapter);

        return v;
    }
}