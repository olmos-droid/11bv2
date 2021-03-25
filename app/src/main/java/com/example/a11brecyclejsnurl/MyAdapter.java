package com.example.a11brecyclejsnurl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context mContext;
    private List<GuyCandy> guys;
    public static final String TAG = "TAG";


    public MyAdapter(Context mContext, List<GuyCandy> guys) {
        this.mContext = mContext;
        this.guys = guys;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.cardview_boy,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {


        holder.name.setText(guys.get(position).getName());
        holder.city.setText(guys.get(position).getCountry());
        holder.etnia.setText(guys.get(position).getEthnicity());
        holder.dot.setText(String.valueOf(guys.get(position).getDot())+"cm");
        Picasso.get().load(guys.get(position).getFoto1())
                .fit()
                .centerCrop()
                .into(holder.imageUrl);

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(mContext,DetailActivity.class);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                }
                intent.putExtra("Nombre",guys.get(position).getName());

                intent.putExtra("Estatus",guys.get(position).getRelationship());

                intent.putExtra("interestedIn",guys.get(position).getInterestedIn());

                intent.putExtra("Ciudad",guys.get(position).getCountry());
                intent.putExtra("Visitas",guys.get(position).getProfileVisits());
                intent.putExtra("Status",guys.get(position).getCareerStatus());
                intent.putExtra("Sexo",guys.get(position).getGender());
                intent.putExtra("LugarNacimiento",guys.get(position).getPlaceOfBirth());
                intent.putExtra("Signo",guys.get(position).getZodiacSign());
                intent.putExtra("Dotación",guys.get(position).getDot());

                intent.putExtra("Altura",guys.get(position).getHeight());
                intent.putExtra("Peso",guys.get(position).getWeight());
                intent.putExtra("Etnia",guys.get(position).getEthnicity());
                intent.putExtra("Pelo",guys.get(position).getHairColor());

                intent.putExtra("Ojos",guys.get(position).getEyeColor());
                intent.putExtra("Prepucio",guys.get(position).getPrepucio());
                intent.putExtra("VelloFacial",guys.get(position).getFacialhair());
                intent.putExtra("Tatuajes",guys.get(position).getTattoos());
                intent.putExtra("Perforaciones",guys.get(position).getPiercing());
                intent.putExtra("Intereses",guys.get(position).getHobbies());
                intent.putExtra("foto1",guys.get(position).getFoto1());
                intent.putExtra("foto2",guys.get(position).getFoto2());

                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return guys.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name,city,etnia,dot;
        ImageView imageUrl;

        ConstraintLayout constraintLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textViewName2);
            city = itemView.findViewById(R.id.textViewCity2);
            etnia = itemView.findViewById(R.id.textViewEtnia2);
            dot = itemView.findViewById(R.id.textViewDot2);
            imageUrl = itemView.findViewById(R.id.imageViewFoto1);

            constraintLayout = itemView.findViewById(R.id.contraintRow);

        }
    }
}
