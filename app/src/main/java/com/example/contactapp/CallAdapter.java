package com.example.contactapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.ViewHolder>{

    Context context;

    ArrayList<CallModel>  callModels;

    public CallAdapter(Context context, ArrayList<CallModel> callModels) {
        this.context = context;
        this.callModels = callModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.call_log_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.name.setText(callModels.get(position).getName());
        holder.calltype.setText(callModels.get(position).getCalltype());
        holder.duration.setText(callModels.get(position).getCallduration());
        holder.date.setText(callModels.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return  callModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name , calltype , duration , date;
        ImageView imageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            calltype = itemView.findViewById(R.id.calltype);
            duration = itemView.findViewById(R.id.duration);
            date = itemView.findViewById(R.id.date);
            imageView = itemView.findViewById(R.id.id_call);

        }
    }
}
