package com.example.application;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import static com.example.application.R.id.imgIcon;

public class HistoryListAdapter extends RecyclerView.Adapter<HistoryListAdapter.HistoryListViewHolder> {
    @NonNull
    private String[] data;
    public HistoryListAdapter(String[] data) {
        this.data=data;
    }
    @Override
    public HistoryListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_layout,parent,false);
        return new HistoryListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryListViewHolder holder, int position) {
        String title = data[position];
        holder.txtTitle.setText(title);



    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class HistoryListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtTitle;
        public HistoryListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon= (ImageView) itemView.findViewById(R.id.profile_image);
            txtTitle= (TextView) itemView.findViewById(R.id.textView3);

        }
    }
    }

