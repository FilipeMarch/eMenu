package br.com.galdir.emenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
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


        //referência para o botão e associado a ele um listener para o evento de clique
        Button novoItem = (Button) findViewById(R.id.novo_item);
        novoItem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                //objetivo do click será...
                Intent intent = new Intent(MainActivity.this, NovoItemActivity.class);
                startActivity(intent);

            }



        });




    }
}
