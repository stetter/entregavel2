package com.stetter.entregavel2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.stetter.entregavel2.adapters.RecyclerViewAdapter;
import com.stetter.entregavel2.interfaces.RecyclerViewOnItemClickListener;
import com.stetter.entregavel2.model.Receitas;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewOnItemClickListener {

    private List<Receitas> listaReceitas = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    RecyclerViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getListaReceitas();
        setaRecyclerView();
    }

    public void setaRecyclerView(){
        mRecyclerView = findViewById(R.id.recyclerviewMain);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        adapter = new RecyclerViewAdapter(this,listaReceitas,this);
        mRecyclerView.setAdapter(adapter);
    }

    private List<Receitas> getListaReceitas(){

        listaReceitas.clear();
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));


        return listaReceitas;
    }

    @Override
    public void onItemClick(Receitas receitas) {

    }
}
