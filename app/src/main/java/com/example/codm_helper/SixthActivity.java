package com.example.codm_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
    }

    public void home5(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void acessoriosEscopeta (View view) {
        TextView escopetaEscolhida = findViewById(R.id.tv_GunProfEscopeta);
        Spinner droplist_escopeta = (Spinner) findViewById(R.id.spinnerEscopeta);
        String selecionada_escopeta = String.valueOf(droplist_escopeta.getSelectedItem());

        ImageView imagemEscopeta = (ImageView) findViewById(R.id.iv_IconGunEscopeta);
        ImageView statusEscopeta = (ImageView) findViewById(R.id.iv_GunStatsEscopeta);

        if (selecionada_escopeta.equals("Escolha sua arma")) {
            escopetaEscolhida.setText(" ");
            imagemEscopeta.setImageResource(R.drawable.background_black);
            statusEscopeta.setImageResource(R.drawable.background_black);
            Toast.makeText(this, "Escolha uma arma da lista.",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (selecionada_escopeta.equals("Striker")) {
            imagemEscopeta.setImageResource(R.drawable.striker_default);
            statusEscopeta.setImageResource(R.drawable.striker_build);
            escopetaEscolhida.setText("A Striker é uma escopeta semi-automática com boa precisão.\n" +
                    "É uma escopeta que pode ser utilizada em curtas distâncias, apesar de não ser recomendada em nenhuma situação ."
            );
        }

        if (selecionada_escopeta.equals("Echo")) {
            imagemEscopeta.setImageResource(R.drawable.echo_default);
            statusEscopeta.setImageResource(R.drawable.echo_build);
            escopetaEscolhida.setText("A Echo é uma escopeta semi-automática com bom dano e baixo recuo.\n" +
                    "Pode ser utilizada em curtas distâncias, mas não é recomendável para outras situações."
            );
        }

        if (selecionada_escopeta.equals("HS0405")) {
            imagemEscopeta.setImageResource(R.drawable.hs0405_default);
            statusEscopeta.setImageResource(R.drawable.hs0405_build);
            escopetaEscolhida.setText("A HS0405 é uma escopeta pump-action com um ótimo dano, porém com baixa taxa de tiro.\n" +
                    "É excelente para curtas distâncias, e boa em médias distâncias graças ao seu dano alto."
            );
        }

    }


}