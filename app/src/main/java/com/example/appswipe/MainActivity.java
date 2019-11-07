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
    private TextView tvRespondida;
    int respostas = 3;
    int num = 0;
    int RespostasCertas = 0;
    boolean valida = false;
    int respondidas = 0;
    boolean pergunta1 = false;
    boolean pergunta2 = false;
    boolean pergunta3 = false;
    boolean pergunta4 = false;
    boolean pergunta5 = false;
    boolean pergunta6 = false;




    public void reinicia(View view){
        tvRespondida.setText("");
        tvSwipe.setText("Perguntas e Respostas!");
        tvNumero.setText("");
        respostas = 3;
        num = 0;
        RespostasCertas = 0;
        valida = false;
        respondidas = 0;
        pergunta1 = false;
        pergunta2 = false;
        pergunta3 = false;
        pergunta4 = false;
        pergunta5 = false;
        pergunta6 = false;
        btnReinicia.setVisibility(View.INVISIBLE);
    }




    private int perguntas(int pergunta){
        btnReinicia.setVisibility(View.INVISIBLE);
        int numero = pergunta;


        if (num == 1){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 1");
            tvSwipe.setText("Você é Homem?");
            if (pergunta1 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                RespostasCertas = RespostasCertas +1;
                pergunta1 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÂO");
                pergunta1 = true;
            }


        }
        if (num == 2){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 2");
            tvSwipe.setText("Você é Mulher?");
            if (pergunta2 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                pergunta2 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÂO");
                RespostasCertas = RespostasCertas +1;
                pergunta2 = true;
            }

        }
        if (num == 3){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 3");
            tvSwipe.setText("Tem Mais de 20 Anos?");
            if (pergunta3 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                RespostasCertas = RespostasCertas +1;
                pergunta3 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÂO");
                pergunta3 = true;
            }

        }
        if (num == 4){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 4");
            tvSwipe.setText("Você tem um colega chamado Stevem?");
            if (pergunta4 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                pergunta4 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÂO");
                RespostasCertas = RespostasCertas +1;
                pergunta4 = true;
            }
        }
        if (num == 5){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 5");
            tvSwipe.setText("Você tem Moto?");
            if (pergunta5 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                RespostasCertas = RespostasCertas +1;
                pergunta5 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÂO");
                pergunta5 = true;
            }
        }
        if (num == 6){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 6");
            tvSwipe.setText("Você tem Moto XJ?");
            if (pergunta6 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                RespostasCertas = RespostasCertas +1;
                pergunta6 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÂO");
                pergunta6 = true;
            }

        }

        if (num == 7){
            tvRespondida.setText("");
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

            valida = true;
        }


        if (num >= 7){

            num = 0;
        }
        if (num == -1){
            num = 6;
        }

        respostas = 3;
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
        tvRespondida = findViewById(R.id.tvRespondida);







        tela.setOnTouchListener(new OnSwipeTouchListener(this){
            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
              //  tvSwipe.setText("Para Baixo!");
                respostas = 1;
                perguntas( respostas );
            }


            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
               // tvSwipe.setText("Para Cima!");
                respostas = 0;
                perguntas( respostas );
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
