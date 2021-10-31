package com.example.indichat.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.indichat.R;
import com.example.indichat.adapter.status_rec_adapter;
import com.example.indichat.model.statusmodel;

import java.util.ArrayList;

public class status_fragment extends Fragment {
    RecyclerView rec;
    ArrayList<statusmodel> arr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_status_fragment, container, false);
        rec = view.findViewById(R.id.rec);

        arr = new ArrayList<>();
        statusmodel ob1 = new statusmodel(R.drawable.p, "Pikaso", "6:34 am");
        arr.add(ob1);
        statusmodel ob2 = new statusmodel(R.drawable.jj, "June", "Yesterday 7.05 pm");
        arr.add(ob2);
        statusmodel ob3 = new statusmodel(R.drawable.b, "Bob", "9:00 am");
        arr.add(ob3);
        statusmodel ob4 = new statusmodel(R.drawable.h, "Hoppie", "Yesterday 8:30 pm");
        arr.add(ob4);
        statusmodel ob5 = new statusmodel(R.drawable.d, "Denial", "Yesterday 6:34 pm");
        arr.add(ob5);
        statusmodel ob6 = new statusmodel(R.drawable.oo, "Ocean", "10:00 am");
        arr.add(ob6);

        rec.setLayoutManager(new LinearLayoutManager(getContext()));
        rec.setAdapter(new status_rec_adapter(arr));
        return view;
    }
}