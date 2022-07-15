package com.example.codm_helper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void home2(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void acessoriosSMG (View view){
        TextView smgEscolhida = findViewById(R.id.tv_GunProfSMG);
        Spinner droplist_smg = (Spinner) findViewById(R.id.spinnerSMG);
        String selecionada_smg = String.valueOf(droplist_smg.getSelectedItem());

        ImageView imagemSMG = (ImageView) findViewById(R.id.iv_IconGunSMG);
        ImageView statusSMG = (ImageView) findViewById(R.id.iv_GunStatsSMG);

        if (selecionada_smg.equals("Escolha sua arma")) {
            smgEscolhida.setText(" ");
            imagemSMG.setImageResource(R.drawable.background_black);
            statusSMG.setImageResource(R.drawable.background_black);
            Toast.makeText(this, "Escolha uma arma da lista.",
                    Toast.LENGTH_LONG).show();
            return;
        }

        if (selecionada_smg.equals("Fennec")) {
            imagemSMG.setImageResource(R.drawable.fennec_default);
            statusSMG.setImageResource(R.drawable.fennec_build);
            smgEscolhida.setText("A Fennec é uma arma com altíssima taxa de tiro e dano razoável, porém é um pouco difícil de controlar.\n" +
                    "É uma arma para curtas distâncias, e graças a sua alta mobilidade é fácil de se aproximar dos oponentes ."
            );
        }

        if (selecionada_smg.equals("QQ9")) {
            imagemSMG.setImageResource(R.drawable.qq9_default);
            statusSMG.setImageResource(R.drawable.qq9_build);
            smgEscolhida.setText("A QQ9 é uma arma com alta taxa de tiro, alto dano e boa precisão.\n" +
                    "É uma das melhores armas para curtas e médias distâncias."
            );
        }

        if (selecionada_smg.equals("RUS-79U")) {
            imagemSMG.setImageResource(R.drawable.rus_default);
            statusSMG.setImageResource(R.drawable.rus_build);
            smgEscolhida.setText("A RUS-79U é uma arma com uma boa taxa de tiro e dano alto.\n" +
                    "É uma arma boa para iniciantes já que pode ser usada em diversas situações."
            );
        }

    }


}