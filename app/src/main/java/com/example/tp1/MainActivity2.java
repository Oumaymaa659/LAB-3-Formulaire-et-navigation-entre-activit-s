package com.example.tp1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtNom, txtPhone, txtEmail, txtAdresse, txtVille;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        txtNom = findViewById(R.id.txtNom);
        txtPhone = findViewById(R.id.txtPhone);
        txtEmail = findViewById(R.id.txtEmail);
        txtAdresse = findViewById(R.id.txtAdresse);
        txtVille = findViewById(R.id.txtVille);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            txtNom.setText("Nom: " + extras.getString("NOM"));
            txtPhone.setText("Téléphone: " + extras.getString("PHONE"));
            txtEmail.setText("Email: " + extras.getString("EMAIL"));
            txtAdresse.setText("Adresse: " + extras.getString("ADRESSE"));
            txtVille.setText("Ville: " + extras.getString("VILLE"));
        }
    }
}