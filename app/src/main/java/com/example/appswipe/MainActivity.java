package com.example.appswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle;
import android.os.Handler;

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
        tvSwipe.setText("\n\nPerguntas e Respostas!\n\nCima para Baixo = SIM\n Baixo para Cima = NÃO");
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
            tvNumero.setText("Pergunta. 1 - Descobrimento do Brasil");
            tvSwipe.setText("Brasil foi descoberto em 1500 por Pedro Alvares Cabral?");
            if (pergunta1 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                if (respostas == 1 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta1 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                pergunta1 = true;
            }
        }

        if (num == 2){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 2 - 1º Guerra Muncial");
            tvSwipe.setText("Foi uma guerra global centrada na Africa no ano de 1914 á 1918");
            if (pergunta2 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                pergunta2 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                if (respostas == 0 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta2 = true;
            }

        }
        if (num == 3){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 3 - 1º Guerra Muncial");
            tvSwipe.setText("Foi uma guerra global centrada na Europa no ano de 1914 á 1918");
            if (pergunta3 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                if (respostas == 1 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta3 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                pergunta3 = true;
            }

        }
        if (num == 4){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 4 - 2º Guerra Muncial");
            tvSwipe.setText("Foi um conflito militar global que durou de 1939 a 1947");
            if (pergunta4 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                pergunta4 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                if (respostas == 0 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta4 = true;
            }
        }
        if (num == 5){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 5 - Guerra do Golfo");
            tvSwipe.setText("Teve duração 2 de agosto de 1990 até 28 de fevereiro de 1991");
            if (pergunta5 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                if (respostas == 1 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta5 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
                pergunta5 = true;
            }
        }
        if (num == 6){
            tvRespondida.setText("");
            tvNumero.setText("Pergunta. 6 - Guerra Fria");
            tvSwipe.setText("É a designação atribuída ao período histórico de disputas estratégicas e conflitos indiretos entre os Estados Unidos e a União Soviética - Período: 1947 – 1991");
            if (pergunta6 == true && valida == true){
                tvRespondida.setText("RESPONDIDA");
            }
            if (respostas == 1){
                tvSwipe.setText("SIM");
                if (respostas == 1 && valida != true) RespostasCertas = RespostasCertas +1;
                pergunta6 = true;
            }else if(respostas == 0){
                tvSwipe.setText("NÃO");
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

    }


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
                num = num + 1;
                perguntas( num );
            }


            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
               // tvSwipe.setText("Para Cima!");
                respostas = 0;
                perguntas( respostas );
                num = num + 1;
                perguntas( num );
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
