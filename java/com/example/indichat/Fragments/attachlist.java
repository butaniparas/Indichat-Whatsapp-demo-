package com.example.indichat.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.indichat.R;
import com.example.indichat.adapter.attach_rec_adapter;
import com.example.indichat.model.attachmodel;

import java.util.ArrayList;


public class attachlist extends Fragment {
    RecyclerView rec;
    ArrayList<attachmodel> arr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attachlist, container, false);
        rec = view.findViewById(R.id.rec);

        arr = new ArrayList<>();
        attachmodel ob1 = new attachmodel(R.drawable.ic_baseline_insert_drive_file_24, "Document");
        arr.add(ob1);

        attachmodel ob2 = new attachmodel(R.drawable.ic_baseline_photo_camera_24, "Camera");
        arr.add(ob2);

        attachmodel ob3 = new attachmodel(R.drawable.ic_baseline_image_24, "Gallery");
        arr.add(ob3);

        attachmodel ob4 = new attachmodel(R.drawable.ic_baseline_audiotrack_24, "Audio");
        arr.add(ob4);

        attachmodel ob5 = new attachmodel(R.drawable.ic_baseline_payment_24, "Payment");
        arr.add(ob5);

        attachmodel ob6 = new attachmodel(R.drawable.ic_baseline_add_location_24, "Location");
        arr.add(ob6);

        attachmodel ob7 = new attachmodel(R.drawable.ic_baseline_person_24, "Contact");
        arr.add(ob7);

        rec.setLayoutManager(new GridLayoutManager(getContext(), 3));
        rec.setAdapter(new attach_rec_adapter(arr, getContext()));
        return view;
    }
}