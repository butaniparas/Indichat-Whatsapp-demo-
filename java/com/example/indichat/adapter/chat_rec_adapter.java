package com.example.indichat.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.indichat.Activity_others.chat_activity;
import com.example.indichat.MainActivity;
import com.example.indichat.R;
import com.example.indichat.model.chatmodel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class chat_rec_adapter extends RecyclerView.Adapter<chat_rec_adapter.holder> {


    ArrayList<chatmodel> data;

    public chat_rec_adapter(ArrayList<chatmodel> data, Context context) {
        this.data = data;
        this.context = context;
    }

    Context context;

    @NonNull
    @NotNull
    @Override
    public holder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_rec_adapter, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull holder holder, int position) {
        holder.imageView.setImageResource(data.get(position).getImage());
        holder.header.setText(data.get(position).getHeader());
        holder.desc.setText(data.get(position).getDesc());
        chatmodel temp=data.get(position);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, chat_activity.class);
                intent.putExtra("image",temp.getImage());
                intent.putExtra("header",temp.getHeader());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        holder.header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, chat_activity.class);
                intent.putExtra("image",temp.getImage());
                intent.putExtra("header",temp.getHeader());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        holder.desc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, chat_activity.class);
                intent.putExtra("image",temp.getImage());
                intent.putExtra("header",temp.getHeader());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
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
        TextView header, desc;

        public holder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            header = itemView.findViewById(R.id.header);
            desc = itemView.findViewById(R.id.desc);

        }
    }
}
