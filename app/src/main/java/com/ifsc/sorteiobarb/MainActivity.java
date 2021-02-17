package com.ifsc.sorteiobarb;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    EditText edInicial, edFinal;
    TextView textView, ursinho;
    String frases[] = {
            "uhuu voce conseguiu!!! ʕ •ₒ• ʔ୨",
            "que número bacana!!! (≧∇≦)/",
            "o número de beijinhos para você! (*^3^)/~☆",
            "Sorteando demais! (✿◠‿◠)",
            "o tanto de minutos no soco ʕง•ᴥ•ʔง",
            "Miauu!!! (=^-ω-^=)",
            "AE PO**A! (╯°□°）╯︵ ┻━┻"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edInicial = findViewById(R.id.editTextValorInicial);
        edFinal = findViewById(R.id.editTextValorFinal);
        textView=findViewById(R.id.textViewValorSorteado);
        ursinho=findViewById(R.id.ursinho);
        //sorteioNumero(new View(getApplicationContext()));
    }

    public void sorteioNumero(View view) {
        int vInicial=0 ,vFinal=0;
        vInicial=Integer.parseInt(edInicial.getText().toString());
        vFinal=Integer.parseInt(edFinal.getText().toString());

        int numeroSorteado = (new Random().nextInt((vFinal - vInicial)+1))+vInicial;
        Log.d("ValorRandom", Integer.toString(numeroSorteado));

        textView.setText("*✧*:･ﾟ    " + (Integer.toString(numeroSorteado)) + "    ~✧*:･ﾟ*");
        //textView.setText("miau"); "*✧*:･ﾟ " + "454545" + " ~✧*:･ﾟ*"

        int r = new Random().nextInt(frases.length);
        ursinho.setText(frases[r]);
    }

}
