package com.example.codm_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FifthActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }

    public void home4(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void acessoriosSniper (View view) {
        TextView sniperEscolhida = findViewById(R.id.tv_GunProfSniper);
        Spinner droplist_sniper = (Spinner) findViewById(R.id.spinnerSniper);
        String selecionada_sniper = String.valueOf(droplist_sniper.getSelectedItem());

        ImageView imagemSniper = (ImageView) findViewById(R.id.iv_IconGunSniper);
        ImageView statusSniper = (ImageView) findViewById(R.id.iv_GunStatsSniper);

        if (selecionada_sniper.equals("Escolha sua arma")) {
            sniperEscolhida.setText(" ");
            imagemSniper.setImageResource(R.drawable.background_black);
            statusSniper.setImageResource(R.drawable.background_black);
            Toast.makeText(this, "Escolha uma arma da lista.",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (selecionada_sniper.equals("DL Q33")) {
            imagemSniper.setImageResource(R.drawable.dlq33_default);
            statusSniper.setImageResource(R.drawable.dlq33_build);
            sniperEscolhida.setText("A DL Q33 tem um ótimo dano, excelente precisão e um ótimo alcance.\n" +
                    "É uma das melhores snipers do jogo desde o lançamento, e sempre se mantém consistente."
            );
        }

        if (selecionada_sniper.equals("Locus")) {
            imagemSniper.setImageResource(R.drawable.locus_default);
            statusSniper.setImageResource(R.drawable.locus_build);
            sniperEscolhida.setText("A Locus é uma sniper com ótima precisão e ótimo dano.\n" +
                    "É atualmente uma das melhores snipers do jogo já que é confiável em diversas situações."
            );
        }

        if (selecionada_sniper.equals("SVD")) {
            imagemSniper.setImageResource(R.drawable.svd_default);
            statusSniper.setImageResource(R.drawable.svd_build);
            sniperEscolhida.setText("A SVD é uma sniper com dano muito alto na parte superior do corpo, boa estabilidade e alta taxa de tiro.\n" +
                    "É uma sniper boa para curtas e médias distâncias, já que pode eliminar um inimigo com 1 tiro na parte superior do corpo em até 30m de distância."
            );
        }

    }


}