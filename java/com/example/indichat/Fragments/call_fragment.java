package com.example.indichat.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.indichat.R;
import com.example.indichat.adapter.call_rec_adapter;
import com.example.indichat.adapter.status_rec_adapter;
import com.example.indichat.model.callmodel;
import com.example.indichat.model.chatmodel;
import com.example.indichat.model.statusmodel;

import java.util.ArrayList;


public class call_fragment extends Fragment {
    RecyclerView rec;
    ArrayList<callmodel> arr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_call_fragment, container, false);
        rec = view.findViewById(R.id.rec);

        arr = new ArrayList<>();
        callmodel ob1 = new callmodel(R.drawable.p, "Pikaso", "11:55 am", R.drawable.ic_baseline_videocam_24);
        arr.add(ob1);
        callmodel ob2 = new callmodel(R.drawable.jj, "June", "10:00 am", R.drawable.ic_baseline_videocam_24);
        arr.add(ob2);
        callmodel ob3 = new callmodel(R.drawable.b, "Bob", "9:08 am", R.drawable.ic_baseline_videocam_24);
        arr.add(ob3);
        callmodel ob4 = new callmodel(R.drawable.h, "Hoppie", "9.05 am", R.drawable.ic_baseline_videocam_24);
        arr.add(ob4);
        callmodel ob5 = new callmodel(R.drawable.d, "Denial", "9.00 am", R.drawable.ic_baseline_videocam_24);
        arr.add(ob5);
        callmodel ob6 = new callmodel(R.drawable.oo, "Ocean", "8:30 am", R.drawable.ic_baseline_videocam_24);
        arr.add(ob6);
        callmodel ob7 = new callmodel(R.drawable.b, "Bob", "8:00 am", R.drawable.ic_baseline_videocam_24);
        arr.add(ob7);
        callmodel ob8 = new callmodel(R.drawable.jj, "June", "Yesterday 10.35 pm", R.drawable.ic_baseline_videocam_24);
        arr.add(ob8);
        callmodel ob9 = new callmodel(R.drawable.h, "Hoppie", "Yesterday 9:00 pm", R.drawable.ic_baseline_videocam_24);
        arr.add(ob9);
        callmodel ob10 = new callmodel(R.drawable.p, "Pikaso", "Yesterday 8:30 pm", R.drawable.ic_baseline_videocam_24);
        arr.add(ob10);

        rec.setLayoutManager(new LinearLayoutManager(getContext()));
        rec.setAdapter(new call_rec_adapter(arr));
        return view;
    }
}