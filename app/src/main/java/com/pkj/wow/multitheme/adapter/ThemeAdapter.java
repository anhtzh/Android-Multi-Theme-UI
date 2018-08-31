package com.pkj.wow.multitheme.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pkj.wow.multitheme.R;
import com.pkj.wow.multitheme.ScrollingActivity;
import com.pkj.wow.multitheme.view.preview.PreviewThemeColor;
import com.pkj.wow.multitheme.view.preview.PreviewThemeView;

import java.util.List;

public class ThemeAdapter extends RecyclerView.Adapter<ThemeAdapter.MyViewHolder> {
 
    private List<PreviewThemeColor> themeList;
    private RecyclerViewClickListener mRecyclerViewClickListener;
 
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public PreviewThemeView themeView;
        private RecyclerViewClickListener mListener;
 
        public MyViewHolder(View view, RecyclerViewClickListener listener) {
            super(view);
            mListener = listener;
            themeView = (PreviewThemeView) view.findViewById(R.id.themeView);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            mListener.onClick(view, getAdapterPosition());
            ScrollingActivity.selectedTheme = getAdapterPosition();
            ScrollingActivity.mTheme = ScrollingActivity.mThemeList.get(getAdapterPosition()).getId();
            themeView.setActivated(true);
            ThemeAdapter.this.notifyDataSetChanged();
        }
    }
 
 
    public ThemeAdapter(List<PreviewThemeColor> themeList, RecyclerViewClickListener recyclerViewClickListener) {
        this.themeList = themeList;
        mRecyclerViewClickListener = recyclerViewClickListener;
    }
 
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row_theme, parent, false);
 
        return new MyViewHolder(itemView, mRecyclerViewClickListener);
    }
 
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        PreviewThemeColor theme = themeList.get(position);
        holder.themeView.setTheme(theme);

        if(ScrollingActivity.selectedTheme == position){
            holder.themeView.setActivated(true);
        }else {
            holder.themeView.setActivated(false);
        }
    }
 
    @Override
    public int getItemCount() {
        return themeList.size();
    }
}