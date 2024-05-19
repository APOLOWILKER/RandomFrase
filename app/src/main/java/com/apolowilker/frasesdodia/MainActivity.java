package com.apolowilker.frasesdodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void gerarFraseAleatoria(View view){


        String[] frases = {
                "Somos capazes de fazer muito mais do que imaginamos!",
                "Nós somos como o clima: feitos de dias de chuva e de sol!",
                "Os dias difíceis são a forma mais rápida de aprendermos a apreciar os bons.",
                "A persistência é o caminho do êxito.",
                "A vitalidade é demonstrada não apenas pela persistência, mas pela capacidade de começar de novo."
        };

        int numeroAleatorio = new Random().nextInt(frases.length);

        TextView textFrase = findViewById(R.id.textFrase); // R de resource = recurso
        textFrase.setText(frases[numeroAleatorio]);

//        frases[numeroAleatorio]

    }

}