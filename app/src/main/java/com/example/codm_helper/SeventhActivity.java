package com.example.codm_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
    }

    public void home6(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void acessoriosAtirador (View view) {
        TextView atiradorEscolhida = findViewById(R.id.tv_GunProfAtirador);
        Spinner droplist_atirador = (Spinner) findViewById(R.id.spinnerAtirador);
        String selecionada_atirador = String.valueOf(droplist_atirador.getSelectedItem());

        ImageView imagemAtirador = (ImageView) findViewById(R.id.iv_IconGunAtirador);
        ImageView statusAtirador = (ImageView) findViewById(R.id.iv_GunStatsAtirador);

        if (selecionada_atirador.equals("Escolha sua arma")) {
            atiradorEscolhida.setText(" ");
            imagemAtirador.setImageResource(R.drawable.background_black);
            statusAtirador.setImageResource(R.drawable.background_black);
            Toast.makeText(this, "Escolha uma arma da lista.",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (selecionada_atirador.equals("SP-R 208")) {
            imagemAtirador.setImageResource(R.drawable.spr208_default);
            statusAtirador.setImageResource(R.drawable.spr208_build);
            atiradorEscolhida.setText("É uma arma com dano alto e boa precisão.\n" +
                    "Graças aos acessórios que favorecem sua mobilidade e sua capacidade de eliminar o alvo com 1 tiro na parte superior do corpo, ela se destaca em curtas e médias distâncias."
            );
        }

        if (selecionada_atirador.equals("SKS")) {
            imagemAtirador.setImageResource(R.drawable.sks_default);
            statusAtirador.setImageResource(R.drawable.sks_build);
            atiradorEscolhida.setText("É um fuzil de atirador semi-automático, com bom dano e excelente taxa de tiro.\n" +
                    "È capaz de eliminar o alvo com 2 tiros na parte superior do corpo, o que não é difícil graças a sua alta taxa de tiro."
            );
        }

        if (selecionada_atirador.equals("MK2")) {
            imagemAtirador.setImageResource(R.drawable.mk2_default);
            statusAtirador.setImageResource(R.drawable.mk2_build);
            atiradorEscolhida.setText("è uma arma com dano alto e boa taxa de tiro.\n" +
                    "É uma arma versátil, que pode eliminar o alvo com apenas 1 tiro na parte superior do corpo."
            );
        }

    }


}