package com.example.appswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout tela;
    private TextView tvSwipe;
    int num = 0;
    int resS = 0;
    int resN = 0;
    int RespostasCertas = 0;



    private int perguntas(int pergunta){

        int numero = pergunta;

    //    int respo = resposta;

        if (num == 1){
            tvSwipe.setText("Você é Homem");
            if (resS == 1){
                tvSwipe.setText("SIM");
                resN = resN + 1;
                RespostasCertas = 1;
            }else if(resN == 1){
                tvSwipe.setText("NÂO");
                resS = resS + 1;
            }

        }
        if (num == 2){
            tvSwipe.setText("Você é Mulher");
            if (resS == 2){
                tvSwipe.setText("SIM");
                resN = resN + 1;
            }else if(resN == 2){
                tvSwipe.setText("NÂO");
                resS = resS + 1;
                RespostasCertas = 2;
            }

        }
        if (num == 3){
            tvSwipe.setText("Tem Mais de 20 Anos");
            if (resS == 3){
                tvSwipe.setText("SIM");
                resN = resN + 1;
                RespostasCertas = 3;
            }else if(resN == 3){
                tvSwipe.setText("NÂO");
                resS = resS + 1;
            }

        }
        if (num == 4){
            tvSwipe.setText("Stevem é MachoPaCaralho");
            if (resS == 4){
                tvSwipe.setText("SIM");
            //    resN = resN + 1;
            }else if(resN == 4){
                tvSwipe.setText("NÂO");
            //    resS = resS + 1;
                RespostasCertas = 4;
            }
        }
        if (num == 5){
            tvSwipe.setText("Você tem Moto");
            if (resS == 5){
                tvSwipe.setText("SIM");
                resN = resN + 1;
                RespostasCertas = 5;
            }else if(resN == 5){
                tvSwipe.setText("NÂO");
                resS = resS + 1;
            }
        }

        if (resN > 5 || resS > 5){
            resS = 0;
            resN = 0;
        }
        if (num >= 5){
            num = 0;
        }
        if (num == -1){
            num = 5;
        }

        return numero;

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSwipe = findViewById(R.id.tvSwipe);
        tela = findViewById(R.id.tela);





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
