package com.example.deyvi.loterama;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class ModeradorActivity extends AppCompatActivity implements View.OnClickListener{
    //lissta de prueba donde  cambiaremos nombres
    private String[] nombres ={"Kenia","Paola","Miriam"};
    private Button      btnChange;
    private TextView    tvName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moderador);

        btnChange = (Button)findViewById(R.id.btnChange);
        tvName  = (TextView)findViewById(R.id.tvName);
        btnChange.setOnClickListener(this);
        tvName.setText(nombres[0]);
    }




    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnChange:
                changeName();
                break;
        }
    }

    private void changeName() {
        int i = 0;
        tvName.setText(nombres[i + 1]);
    }
}


