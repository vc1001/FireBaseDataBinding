package com.example.firebasedatabinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firebasedatabinding.databinding.ItemlistBinding;

import java.util.ArrayList;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.myViewHolder> {

    Context context;

    ArrayList<User> userlist;

    public MyCustomAdapter(Context context, ArrayList<User> userlist) {
        this.context = context;
        this.userlist = userlist;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemlistBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.itemlist,parent,false);

        return new myViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        User user = userlist.get(position);
        holder.itemlistBinding.setUser(user);

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{
      private   ItemlistBinding itemlistBinding;

        public myViewHolder(ItemlistBinding itemlistBinding) {
            super(itemlistBinding.getRoot());
            this.itemlistBinding=itemlistBinding;

            itemlistBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                }
            });
        }
    }
}
