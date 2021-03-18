package com.devianggraini.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtnama;
    TextView txtgl;
    TextView txtalamat;
    TextView txthoby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnama = (TextView) findViewById(R.id.txtnama);
        txtnama.setText("Nama : " + "Devi Anggraini");
        txtgl = (TextView) findViewById(R.id.txtgl);
        txtgl.setText("TTL : " + "Candimas, 20 Desember 1999");
        txtalamat = (TextView) findViewById(R.id.txtalamat);
        txtalamat.setText("Alamat : " + "Candimas, Karang Sari");
        txthoby = (TextView) findViewById(R.id.txthoby);
        txthoby.setText("Hobby : " + "Memasak, Olahraga");
    }
}