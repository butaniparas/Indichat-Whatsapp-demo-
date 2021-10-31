package com.example.indichat.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.indichat.Activity_others.chat_activity;
import com.example.indichat.R;
import com.example.indichat.adapter.chat_rec_adapter;
import com.example.indichat.model.chatmodel;

import java.util.ArrayList;

public class chat_fragment extends Fragment {
    RecyclerView rec;
    ArrayList<chatmodel> arr;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chat_fragment, container, false);
        rec = view.findViewById(R.id.rec);

        arr = new ArrayList<>();
        chatmodel ob1 = new chatmodel(R.drawable.b, "Bob", "Hello bob");
        arr.add(ob1);

        chatmodel ob2 = new chatmodel(R.drawable.c, "Charlie", "Good Morning Charlie");
        arr.add(ob2);

        chatmodel ob3 = new chatmodel(R.drawable.d, "Denial", "You are crazy");
        arr.add(ob3);

        chatmodel ob4 = new chatmodel(R.drawable.f, "Feni", "Feni do you wants to drink water?");
        arr.add(ob4);

        chatmodel ob5 = new chatmodel(R.drawable.h, "Hoppie", "Tomorrow we will go to collage together.");
        arr.add(ob5);

        chatmodel ob6 = new chatmodel(R.drawable.j, "Jone", "jona yoo are so kind");
        arr.add(ob6);

        chatmodel ob7 = new chatmodel(R.drawable.jj, "June", "you are very beautiful");
        arr.add(ob7);

        chatmodel ob8 = new chatmodel(R.drawable.k, "Kali", "Amazing thoughts waiting for you");
        arr.add(ob8);


        chatmodel ob9 = new chatmodel(R.drawable.l, "Linda", "good afternoon!");
        arr.add(ob9);

        chatmodel ob10 = new chatmodel(R.drawable.oo, "Ocean", "you really like a ocean");
        arr.add(ob10);

        chatmodel ob11 = new chatmodel(R.drawable.p, "Pikaso", "what do you mean of that?");
        arr.add(ob11);

        rec.setLayoutManager(new LinearLayoutManager(getContext()));
        rec.setAdapter(new chat_rec_adapter(arr,getContext()));


        return view;
    }

}