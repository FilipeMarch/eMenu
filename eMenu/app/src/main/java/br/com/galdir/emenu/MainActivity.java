package br.com.galdir.emenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Cria uma lista de itens na tela principal do app
        String[] itens = {"Comidas", "Bebidas", "Sobremesas"};

        ListView listaDeItens = (ListView) findViewById(R.id.lista_itens);

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);

        listaDeItens.setAdapter(adapter);




    }
}
