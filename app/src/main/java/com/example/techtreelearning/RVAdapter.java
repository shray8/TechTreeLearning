package com.example.techtreelearning;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends  RecyclerView.Adapter<RVAdapter.MyViewHolder>{

    ArrayList<RVDataModel> rvDataHolder;

    public RVAdapter(ArrayList<RVDataModel> rvDataHolder) {
        this.rvDataHolder = rvDataHolder;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design_recyclerview, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imgDesignRV.setImageResource(rvDataHolder.get(position).getImage());
        holder.tvHeader.setText(rvDataHolder.get(position).getHeader());
        holder.tvDesc.setText(rvDataHolder.get(position).getDesc());

    }

    @Override
    public int getItemCount() {
        return rvDataHolder.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imgDesignRV;
        TextView tvHeader;
        TextView tvDesc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imgDesignRV = itemView.findViewById(R.id.ImgDesignRV);
            tvHeader = itemView.findViewById(R.id.TVHeader);
            tvDesc = itemView.findViewById(R.id.TVDesc);

        }
    }
}
