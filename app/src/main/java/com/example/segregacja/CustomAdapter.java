package com.example.segregacja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

   private Context context;
    private ArrayList trash_id, trash_name, where_throw;

    CustomAdapter(Context context, ArrayList trash_id, ArrayList trash_name, ArrayList where_throw){

        this.context = context;
        this.trash_id = trash_id;
        this.trash_name = trash_name;
        this.where_throw = where_throw;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.trash_id_txt.setText(String.valueOf(trash_id.get(position)));
        holder.trash_title_txt.setText(String.valueOf(trash_name.get(position)));
        holder.where_throw.setText(String.valueOf(where_throw.get(position)));

    }

    @Override
    public int getItemCount() {
        return trash_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView trash_id_txt, trash_title_txt, where_throw;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            trash_id_txt = itemView.findViewById(R.id.trash_id_txt);
            trash_title_txt = itemView.findViewById(R.id.trash_title_txt);
            where_throw = itemView.findViewById(R.id.where_throw);
        }
    }
}
