package com.itc.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    ArrayList<SetGetData> sgData;

    public Adapter(Context context, ArrayList<SetGetData> sgData) {
        this.context = context;
        this.sgData = sgData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_member, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.onBind(sgData.get(position));
    }

    @Override
    public int getItemCount() {
        return sgData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(SetGetData setGetData) {
            ArrayList<TextView> textViews = new ArrayList<>(
                    Arrays.asList(
                            itemView.findViewById(R.id.tv_member)
                    )
            );
            ImageView imageView = itemView.findViewById(R.id.iv_member);
            LinearLayout linearLayout = itemView.findViewById(R.id.ll_member);

            ArrayList<String> data = new ArrayList<>(Arrays.asList(
                    setGetData.getName(),
                    setGetData.getPosition(),
                    setGetData.getBorn()
            ));
            textViews.get(0).setText(data.get(0));
            imageView.setImageResource(setGetData.getPict());
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, Biodata.class);
                    intent.putExtra("Name", data.get(0));
                    intent.putExtra("Position", data.get(1));
                    intent.putExtra("Born", data.get(2));
                    intent.putExtra("Pict", setGetData.getPict());
                    context.startActivity(intent);
                }
            });
        }
    }
}