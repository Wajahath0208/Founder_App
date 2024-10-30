package com.example.founderapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerviewAdapter extends RecyclerView.Adapter<recyclerviewAdapter.ViewHolder> {
    private Listdata[] listdata;
    Context context;

     public recyclerviewAdapter(Listdata[] listdata,Context context){
         this.listdata =listdata;
         this.context=context;
     }
    @NonNull
    @Override
    public recyclerviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View listItem=layoutInflater.inflate(R.layout.founderitems,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewAdapter.ViewHolder holder, int position) {
    final Listdata mylistdata =listdata[position];
    holder.name.setText(mylistdata.getFoundername());
    holder.imageView.setImageResource(mylistdata.getImg_id());
    

    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
         public TextView name,description,company;
         public ImageView imageView;
//

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name =itemView.findViewById(R.id.founder_name);
            this.imageView=itemView.findViewById(R.id.founder_img);
            this.company=itemView.findViewById(R.id.founder_company);
            this.description=itemView.findViewById(R.id.founder_description);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context,com.example.founderapp.description.class);
            intent.putExtra("image", listdata[getAdapterPosition()].getImg_id());
            intent.putExtra("name",listdata[getAdapterPosition()].getFoundername());
            intent.putExtra("company",listdata[getAdapterPosition()].getCompany());
            intent.putExtra("description",listdata[getAdapterPosition()].getDescription());
            context.startActivity(intent);


        }
    }
}
