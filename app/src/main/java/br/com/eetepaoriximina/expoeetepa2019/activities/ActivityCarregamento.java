package br.com.eetepaoriximina.expoeetepa2019.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import br.com.eetepaoriximina.expoeetepa2019.R;

public class ActivityCarregamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carregamento);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abriTelaInicialLogin();
            }
        }, 3000);
    }

    public void abriTelaInicialLogin(){
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
