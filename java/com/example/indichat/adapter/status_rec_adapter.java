package com.example.indichat.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.indichat.R;
import com.example.indichat.model.statusmodel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class status_rec_adapter extends RecyclerView.Adapter<status_rec_adapter.holder> {
    ArrayList<statusmodel> data;

    public status_rec_adapter(ArrayList<statusmodel> data) {
        this.data = data;
    }

    @NonNull
    @NotNull
    @Override
    public holder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.status_adapter, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull holder holder, int position) {
        holder.imageView.setImageResource(data.get(position).getImage());
        holder.header.setText(data.get(position).getHeader());
        holder.desc.setText(data.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView header, desc, line_text;

        public holder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            header = itemView.findViewById(R.id.header);
            desc = itemView.findViewById(R.id.desc);
            line_text = itemView.findViewById(R.id.line_text);

        }
    }
}
