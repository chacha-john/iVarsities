package com.chachaup.ivarsities.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chachaup.ivarsities.R;
import com.chachaup.ivarsities.models.University;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UniversityListAdapter extends RecyclerView.Adapter<UniversityListAdapter.UniversityViewHolder> {
    public List<University> mUniversities;
    public Context mContext;

    public UniversityListAdapter(Context context, List<University> universities){
        mContext = context;
        mUniversities = universities;
    }

    public class UniversityViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.textViewUniversityName)
        TextView mName;
        @BindView(R.id.textViewWebsite) TextView mSite;

        public UniversityViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            mContext = itemView.getContext();
        }

        public void bindUniversity(University university){
            mName.setText(university.getuName());
            mSite.setText(university.getuWebPages().get(0));
        }
    }

    @NonNull
    @Override
    public UniversityListAdapter.UniversityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.university_item,parent,false);
        UniversityViewHolder viewHolder = new UniversityViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UniversityListAdapter.UniversityViewHolder holder, int position) {
        holder.bindUniversity(mUniversities.get(position));
    }

    @Override
    public int getItemCount() {
        return mUniversities.size();
    }
}
