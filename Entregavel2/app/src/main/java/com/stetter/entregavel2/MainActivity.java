package com.stetter.entregavel2;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

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

        EditText searchEdit = findViewById(R.id.editTextSearchView);

        getListaReceitas();
        setaRecyclerView();
        setEditTextListener(searchEdit);
    }

    public void setaRecyclerView(){
        mRecyclerView = findViewById(R.id.recyclerviewMain);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        adapter = new RecyclerViewAdapter(this,listaReceitas,this);
        mRecyclerView.setAdapter(adapter);
    }

    private void setEditTextListener(EditText searchEdit) {
        searchEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i("LOG", "Texto digitado ao digitar no EditText: " + s.toString());
                searchReceita(s.toString());
            }
        });
    }

    private void searchReceita(String name) {
        List<Receitas> searchList = new ArrayList<>();

        for (Receitas receitas : listaReceitas) {
            if (receitas.getNome().contains(name)) {
                searchList.add(receitas);
            }
        }

        if (!searchList.isEmpty()) {
            adapter.update(searchList);
        }
    }

    private List<Receitas> getListaReceitas(){

        listaReceitas.clear();
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Picanha","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Chorizo","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Contra","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Mingon","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Chuleta","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de T Bone","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));
        listaReceitas.add(new Receitas("Bife de Ancho","Temperar o bife com sal grosso",10));


        return listaReceitas;
    }

    @Override
    public void onItemClick(Receitas receitas) {

    }
}
