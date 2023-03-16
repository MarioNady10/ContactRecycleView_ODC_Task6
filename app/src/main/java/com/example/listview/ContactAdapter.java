package com.example.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
ArrayList<Contact> data ;

    public ContactAdapter(ArrayList<Contact> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater Inflater = LayoutInflater.from(parent.getContext());
        View view = Inflater.inflate(R.layout.contact,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.UserName.setText(data.get(position).getName());
        holder.UserNumber.setText(data.get(position).getNumber());
        holder.User_photo.setImageResource(data.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder{
       public ImageView User_photo;
       public TextView UserName,UserNumber;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            User_photo = itemView.findViewById(R.id.User_photo);
            UserName = itemView.findViewById(R.id.PersonName);
            UserNumber = itemView.findViewById(R.id.PersonNumber);

        }
    }
}
