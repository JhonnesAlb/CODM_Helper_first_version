package com.example.codm_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void home1(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void acessoriosAR (View view){
        TextView arEscolhida = findViewById(R.id.tv_GunProfAR);
        Spinner droplist1 = (Spinner) findViewById(R.id.spinnerAR);
        String selecionada_ar = String.valueOf(droplist1.getSelectedItem());

        ImageView imagemAR = (ImageView) findViewById(R.id.iv_IconGunAR);
        ImageView statusAR = (ImageView) findViewById(R.id.iv_GunStatsAR);

        if (selecionada_ar.equals("Escolha sua arma")) {
            arEscolhida.setText(" ");
            imagemAR.setImageResource(R.drawable.background_black);
            statusAR.setImageResource(R.drawable.background_black);
            Toast.makeText(this, "Escolha uma arma da lista.",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (selecionada_ar.equals("M4")) {
            imagemAR.setImageResource(R.drawable.m4_default);
            statusAR.setImageResource(R.drawable.m4_build);
            arEscolhida.setText("A M4 é a arma desbloqueada nível 1 do jogo.\n" +
                    "É uma poderosa arma, com uma boa taxa de tiro e uma precisão invejável, muitos jogadores usam essa arma por seu recuo fácil de controlar \n" +
                    "com apenas um ou dois acessórios equipados."
                    );
        }

        if (selecionada_ar.equals("AK-47")) {
            imagemAR.setImageResource(R.drawable.ak47_default);
            statusAR.setImageResource(R.drawable.ak47_build);
            arEscolhida.setText("O rifle automático AK-47 é uma arma com dano alto, porém com um recuo grande.\n" +
                    "É recomendada para jogadores mais experientes e que sabem controlar o recuo corretamente."
            );
        }

        if (selecionada_ar.equals("AK-117")) {
            imagemAR.setImageResource(R.drawable.ak117_default);
            statusAR.setImageResource(R.drawable.ak117_build);
            arEscolhida.setText("A AK-117 é uma arma com alta taxa de tiro, boa precião e bom dano.\n" +
                    "É uma ótima arma para curtas e médias distâncias."
            );
        }

    }


}