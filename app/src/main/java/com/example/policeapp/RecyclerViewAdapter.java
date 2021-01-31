package com.example.policeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    List<notification_class> MainImageUploadInfoList;

    public RecyclerViewAdapter(Context context, List<notification_class> TempList) {

        this.MainImageUploadInfoList = TempList;

        this.context = context;
    }
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.not_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {

        notification_class studentDetails = MainImageUploadInfoList.get(position);

        holder.StudentNameTextView.setText(studentDetails.getText());
        holder.StudentNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(),maps.class);
                view.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return MainImageUploadInfoList.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView StudentNameTextView;


        public ViewHolder(View itemView) {

            super(itemView);

            StudentNameTextView = (TextView) itemView.findViewById(R.id.tv_not_text);


        }
    }
}
