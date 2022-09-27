package com.if3b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText nomorPendaftaran,namaMahasiswa;
    Button btnDaftar;

    String nomor_Pendaftaran,Nama_mhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomorPendaftaran = findViewById(R.id.nomor_endaftaran);
        namaMahasiswa = findViewById(R.id.nama_mahasiswa);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener()
        { @Override public void onClick(View view)
        {
            nomor_Pendaftaran = nomorPendaftaran.getText().toString();
            Nama_mhs = namaMahasiswa.getText().toString();

            if(nomor_Pendaftaran.trim().equals(""))
            {
                nomorPendaftaran.setError("Harus Di ISg");
            }
            else if(Nama_mhs.trim().equals("")){
                namaMahasiswa.setError("Harus DI ISI !");
            }
            else
            {
                Toast.makeText(MainActivity.this, "Berhasil Login" + Nama_mhs + " Cuy", Toast.LENGTH_SHORT).show();
            }

        }
        });




    }
}