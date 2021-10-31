package com.example.indichat.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.indichat.R;
import com.example.indichat.model.callmodel;
import com.example.indichat.model.chatmodel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class call_rec_adapter extends RecyclerView.Adapter<call_rec_adapter.holder> {

    public call_rec_adapter(ArrayList<callmodel> data) {
        this.data = data;
    }

    ArrayList<callmodel> data;

    @NonNull
    @NotNull
    @Override
    public call_rec_adapter.holder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.call_adapter, parent, false);
        return new call_rec_adapter.holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull call_rec_adapter.holder holder, int position) {
        holder.imageView.setImageResource(data.get(position).getImage());
        holder.icon.setImageResource(data.get(position).getIcon());
        holder.header.setText(data.get(position).getHeader());
        holder.desc.setText(data.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class holder extends RecyclerView.ViewHolder {
        ImageView imageView, icon;
        TextView header, desc;

        public holder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            header = itemView.findViewById(R.id.header);
            desc = itemView.findViewById(R.id.desc);
            icon = itemView.findViewById(R.id.icon);

        }
    }
}
