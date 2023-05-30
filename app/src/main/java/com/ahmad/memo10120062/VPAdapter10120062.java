package com.ahmad.memo10120062;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

        //10120062_Ahmad Sanosi_IF2
public class VPAdapter10120062 extends RecyclerView.Adapter<VPAdapter10120062.ViewHolder> {

        ArrayList<ViewPagerItem10120062> viewPagerItemArrayList;

        public VPAdapter10120062(ArrayList<ViewPagerItem10120062> viewPagerItemArrayList) {
            this.viewPagerItemArrayList = viewPagerItemArrayList;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.viewpager_item10120062,parent,false);

            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

            ViewPagerItem10120062 viewPagerItem = viewPagerItemArrayList.get(position);

            holder.imageView.setImageResource(viewPagerItem.imageID);
            holder.tcHeading.setText(viewPagerItem.heading);
            holder.tvDesc.setText(viewPagerItem.description);


        }

        @Override
        public int getItemCount() {
            return viewPagerItemArrayList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder{

            ImageView imageView;
            TextView tcHeading, tvDesc;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);

                imageView = itemView.findViewById(R.id.ivimage);
                tcHeading = itemView.findViewById(R.id.tvHeading);
                tvDesc = itemView.findViewById(R.id.tvDesc);
            }
        }

    }