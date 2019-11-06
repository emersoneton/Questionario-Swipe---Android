package com.example.appswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout tela;
    private TextView tvSwipe;
    private TextView tvNumero;
    private Button btnReinicia;
    int num = 0;
    int resS = 0;
    int resN = 0;
    int RespostasCertas = 0;




    private int perguntas(int pergunta){

        int numero = pergunta;


        if (num == 1){
            tvNumero.setText("Pergunta. 1");
            tvSwipe.setText("Você é Homem?");
            if (resS == 1){
                tvSwipe.setText("SIM");
                resN = resN + 1;
                RespostasCertas = RespostasCertas +1;
            }else if(resN == 1){
                tvSwipe.setText("NÂO");
                resS = resS + 1;
            }

        }
        if (num == 2){
            tvNumero.setText("Pergunta. 2");
            tvSwipe.setText("Você é Mulher?");
            if (resS == 2){
                tvSwipe.setText("SIM");
                resN = resN + 1;
            }else if(resN == 2){
                tvSwipe.setText("NÂO");
                resS = resS + 1;
                RespostasCertas = RespostasCertas +1;
            }

        }
        if (num == 3){
            tvNumero.setText("Pergunta. 3");
            tvSwipe.setText("Tem Mais de 20 Anos?");
            if (resS == 3){
                tvSwipe.setText("SIM");
                resN = resN + 1;
                RespostasCertas = RespostasCertas +1;
            }else if(resN == 3){
                tvSwipe.setText("NÂO");
                resS = resS + 1;
            }

        }
        if (num == 4){
            tvNumero.setText("Pergunta. 4");
            tvSwipe.setText("Você tem um colega chamado Stevem?");
            if (resS == 4){
                tvSwipe.setText("SIM");
                resN = resN + 1;
            }else if(resN == 4){
                tvSwipe.setText("NÂO");
                resS = resS + 1;
                RespostasCertas = RespostasCertas +1;
            }
        }
        if (num == 5){
            tvNumero.setText("Pergunta. 5");
            tvSwipe.setText("Você tem Moto?");

            if (resS == 5){
                tvSwipe.setText("SIM");
                resN = resN + 1;
                RespostasCertas = RespostasCertas +1;
            }else if(resN == 5){
                tvSwipe.setText("NÂO");
                resS = resS + 1;
            }
        }
        if (num == 6){
            tvNumero.setText("Pergunta. 6");
            tvSwipe.setText("Você tem Moto XJ?");

            if (resS == 6){
                tvSwipe.setText("SIM");
                resN = resN + 1;
                RespostasCertas = RespostasCertas +1;
            }else if(resN == 6){
                tvSwipe.setText("NÂO");
                resS = resS + 1;
            }

        }

        if (num == 7){
            tvNumero.setText("RESPOSTAS");
            if (RespostasCertas <=2 ){
                String Respostas = String.valueOf(RespostasCertas);
                tvSwipe.setText("Você acertou: *"+Respostas+"* de 6 Perguntas - Você pode melhorar!");
            }
            if (RespostasCertas == 3 ){
                String Respostas = String.valueOf(RespostasCertas);
                tvSwipe.setText("Você acertou: *"+Respostas+"* de 6 Perguntas - Foi Razoavelmente BEM!");
            }
            if (RespostasCertas == 4 ){
                String Respostas = String.valueOf(RespostasCertas);
                tvSwipe.setText("Você acertou: *"+Respostas+"* de 6 Perguntas - Esta BOM!");
            }
            if (RespostasCertas == 5 ){
                String Respostas = String.valueOf(RespostasCertas);
                tvSwipe.setText("Você acertou: *"+Respostas+"* de 6 Perguntas - Excelente Quase Gabaritou!");
            }
            if (RespostasCertas > 5 ){
                String Respostas = String.valueOf(RespostasCertas);
                tvSwipe.setText("Você acertou: *"+Respostas+"* de 6 Perguntas - Excelente *PARABÉNS*");
            }
            btnReinicia.setVisibility(View.VISIBLE);
        }

        if (resN > 6 || resS > 6){
            resS = 0;
            resN = 0;
            RespostasCertas = 0;
        }
        if (num >= 7){

            num = 0;
        }
        if (num == -1){
            num = 6;
        }

        return numero;


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSwipe = findViewById(R.id.tvSwipe);
        tela = findViewById(R.id.tela);
        tvNumero = findViewById(R.id.tvNumero);
        btnReinicia = findViewById(R.id.btnReinicia);






        tela.setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
              //  tvSwipe.setText("Para Baixo!");
                resS = resS + 1;
                perguntas( resS );
            }


            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
               // tvSwipe.setText("Para Cima!");
                resN = resN + 1;
                perguntas( resN );
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
               // tvSwipe.setText("Para Esquerda!");
                num = num + 1;
                perguntas( num );
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
               // tvSwipe.setText("Para Direita!");
                num = num - 1;
                perguntas( num );
            }

        });
    }



}
