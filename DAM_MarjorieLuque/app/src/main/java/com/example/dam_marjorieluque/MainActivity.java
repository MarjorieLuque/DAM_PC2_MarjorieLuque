package com.example.dam_marjorieluque;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Aquí debe ir setContentView()

        // Ahora puedes acceder a las vistas después de haber establecido el layout
        Button btn1 = findViewById(R.id.btnEnviar);
        btn1.setOnClickListener(view -> Toast.makeText(this, "Se envió sus datos", Toast.LENGTH_SHORT).show());
    }
}
