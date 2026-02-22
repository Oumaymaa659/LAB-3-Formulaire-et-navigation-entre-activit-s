package com.example.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private EditText nom;
    private EditText phone;
    private EditText adresse;
    private EditText email;
    private Spinner villes;
    private Button bn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nom = findViewById(R.id.nom);
        phone = findViewById(R.id.phone);
        villes = findViewById(R.id.villes);
        adresse = findViewById(R.id.adresse);
        email = findViewById(R.id.email);
        bn = findViewById(R.id.Envoyer);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ville = villes.getSelectedItem().toString();
                String nomStr = nom.getText().toString();
                String phoneStr = phone.getText().toString();
                String emailStr = email.getText().toString();
                String adresseStr = adresse.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("NOM", nomStr);
                intent.putExtra("PHONE", phoneStr);
                intent.putExtra("EMAIL", emailStr);
                intent.putExtra("ADRESSE", adresseStr);
                intent.putExtra("VILLE", ville);

                startActivity(intent);
            }
        });
    }
}