package com.example.quickdoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

/*
 * LINK: https://www.devmedia.com.br/consumindo-dados-de-um-web-service-com-android/33717
 * LINK: https://www.androidpro.com.br/blog/desenvolvimento-android/webservice/
 * LINK TUTORIAL: https://www.youtube.com/watch?v=_HSXZN3LZQg
 */

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        // ACTIONBAR (NAVIGATION OFF)
        Objects.requireNonNull(getSupportActionBar()).setTitle("PERFIL");
        View decorView = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION + View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOpcoes);



        // AGENDAMENTOS (CALENDÁRIO)
        Button btAgenda = findViewById(R.id.btAgenda);
        btAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_INSERT);
                intent.setData(CalendarContract.Events.CONTENT_URI);
                startActivity(intent);
            }
        });

        // MAIN ACTIVITY (LOGOUT)
        Button btDesconectar = findViewById(R.id.btDesconectar);
        btDesconectar.setOnClickListener(v -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
    }
}

