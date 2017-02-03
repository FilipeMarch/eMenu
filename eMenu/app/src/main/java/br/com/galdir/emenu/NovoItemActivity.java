package br.com.galdir.emenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NovoItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_item);

        //uma referência para o botão Salvar
        Button botaoSalvar = (Button) findViewById(R.id.item_salvar);
        //listener para o evento de clique nesse botão:
        botaoSalvar.setOnClickListener(new View.OnClickListener(){
            @Override

            //comportamento desejado para o botão
            public void onClick(View view) {

                //texto que aparece ao clicar no botão
                Toast.makeText(NovoItemActivity.this, "Item adicionado", Toast.LENGTH_SHORT).show();
                //retorna para a tela principal
                Intent intent = new Intent(NovoItemActivity.this, MainActivity.class);
                startActivity(intent);


            }
        });

    }


}
