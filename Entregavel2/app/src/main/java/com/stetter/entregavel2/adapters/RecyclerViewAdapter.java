package com.stetter.entregavel2.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.stetter.entregavel2.interfaces.RecyclerViewOnItemClickListener;
import com.stetter.entregavel2.model.Receitas;
import com.stetter.entregavel2.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Receitas> listaReceitas;
    private RecyclerViewOnItemClickListener listener;
    Context mctx;

    public RecyclerViewAdapter(Context mctx, List<Receitas> listaReceitas, RecyclerViewOnItemClickListener listener) {
        this.listaReceitas = listaReceitas;
        this.listener = listener;
        this.mctx = mctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_receitas,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Receitas receitas = listaReceitas.get(position);

        holder.titulo.setText(receitas.getNome());
        holder.tempo.setText(String.format("Tempos de preparo de ", receitas.getTempoPreparo()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(receitas);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaReceitas.size();
    }

    protected class ViewHolder extends RecyclerView.ViewHolder{

        protected TextView titulo;
        protected TextView tempo;

        public ViewHolder(View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textViewTitulo);
            tempo = itemView.findViewById(R.id.textViewTempo);

        }
    }

}
