package com.example.codm_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void home3(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void acessoriosLMG (View view) {
        TextView lmgEscolhida = findViewById(R.id.tv_GunProfLMG);
        Spinner droplist_lmg = (Spinner) findViewById(R.id.spinnerLMG);
        String selecionada_lmg = String.valueOf(droplist_lmg.getSelectedItem());

        ImageView imagemLMG = (ImageView) findViewById(R.id.iv_IconGunLMG);
        ImageView statusLMG = (ImageView) findViewById(R.id.iv_GunStatsLMG);

        if (selecionada_lmg.equals("Escolha sua arma")) {
            lmgEscolhida.setText(" ");
            imagemLMG.setImageResource(R.drawable.background_black);
            statusLMG.setImageResource(R.drawable.background_black);
            Toast.makeText(this, "Escolha uma arma da lista.",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (selecionada_lmg.equals("M4LMG")) {
            imagemLMG.setImageResource(R.drawable.m4lmg_default);
            statusLMG.setImageResource(R.drawable.m4lmg_build);
            lmgEscolhida.setText("A M4LMG é uma LMG com bom dano, cadência e precisão.\n" +
                    "Pode ser usada especialmente em médias e longas distâncias."
            );
        }

        if (selecionada_lmg.equals("RPD")) {
            imagemLMG.setImageResource(R.drawable.rpd_default);
            statusLMG.setImageResource(R.drawable.rpd_build);
            lmgEscolhida.setText("A RPD é uma LMG com bom dano e cadência.\n" +
                    "Se destaca por conta de seu acessório único que dispensa a necessidade de recarregar."
            );
        }

        if (selecionada_lmg.equals("Holger 26")) {
            imagemLMG.setImageResource(R.drawable.holger26_default);
            statusLMG.setImageResource(R.drawable.holger26_build);
            lmgEscolhida.setText("A Holger 26 é uma arma com boa mobilidade e recuo fácil de controlar.\n" +
                    "Graças ao seu grande dano de tiro na cabeça é capaz de matar um inimigo com apenas 3 tiros em curtas distâncias."
            );
        }

    }

}