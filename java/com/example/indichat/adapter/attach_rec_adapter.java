package com.example.indichat.adapter;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.indichat.Activity_others.attachmenu_activity;
import com.example.indichat.Fragments.camera_fragment;
import com.example.indichat.R;
import com.example.indichat.model.attachmodel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class attach_rec_adapter extends RecyclerView.Adapter<attach_rec_adapter.holder> {
    ArrayList<attachmodel> data;
    Context context;

    public attach_rec_adapter(ArrayList<attachmodel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public holder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.attach_rec_adapter, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull holder holder, int position) {
        holder.imageView.setImageResource(data.get(position).getImage());
        holder.textView.setText(data.get(position).getText());
        attachmodel temp=data.get(position);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,attachmenu_activity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public holder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

        }
    }
}
