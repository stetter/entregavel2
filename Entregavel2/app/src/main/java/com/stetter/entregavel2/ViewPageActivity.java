package com.stetter.entregavel2;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.stetter.entregavel2.adapters.FragmentPageAdapter;
import com.stetter.entregavel2.model.Receitas;

import java.util.List;

public class ViewPageActivity extends AppCompatActivity {

    ViewPager viewPager;
    List<Receitas> listaReceitas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_page);

        getListaReceitas();

        viewPager = findViewById(R.id.viewpager);

        /*FragmentPageAdapter adapterViewPager = new FragmentPageAdapter(getSupportFragmentManager());*/

       /* viewPager.setAdapter(adapterViewPager);*/
    }

    private List<Receitas> getListaReceitas() {

        listaReceitas.clear();
        listaReceitas.add(new Receitas("Bife de Ancho", "Temperar o bife com sal grosso", 10));
        listaReceitas.add(new Receitas("Bife de Ancho", "Temperar o bife com sal grosso", 10));
        listaReceitas.add(new Receitas("Bife de Ancho", "Temperar o bife com sal grosso", 10));
        listaReceitas.add(new Receitas("Bife de Ancho", "Temperar o bife com sal grosso", 10));
        listaReceitas.add(new Receitas("Bife de Ancho", "Temperar o bife com sal grosso", 10));
        listaReceitas.add(new Receitas("Bife de Ancho", "Temperar o bife com sal grosso", 10));
        listaReceitas.add(new Receitas("Bife de Ancho", "Temperar o bife com sal grosso", 10));
        listaReceitas.add(new Receitas("Bife de Ancho", "Temperar o bife com sal grosso", 10));
        listaReceitas.add(new Receitas("Bife de Ancho", "Temperar o bife com sal grosso", 10));


        return listaReceitas;
    }
}