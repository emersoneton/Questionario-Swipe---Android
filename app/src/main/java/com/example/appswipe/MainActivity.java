package com.example.appswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout tela;
    private TextView tvSwipe;
    int num = 0;


    private int perguntas(int pergunta){

        int numero = pergunta;


        if (num == 1){
            tvSwipe.setText("Você é Homem");
        }
        if (num == 2){
            tvSwipe.setText("Você é Mulher");
        }
        if (num == 3){
            tvSwipe.setText("Tem Mais de 20 Anos");
        }
        if (num == 4){
            tvSwipe.setText("Stevem é MachoPaCaralho");
        }
        if (num == 5){
            tvSwipe.setText("Você tem Moto");
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

            }


            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
               // tvSwipe.setText("Para Cima!");

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
