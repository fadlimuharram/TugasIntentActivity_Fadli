package com.adminblogpadli.tugasintentactivity_fadli;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by azurescarlet on 9/5/17.
 */

public class LayoutTiga extends Activity{
    private  int posisi;
    private EditText edNama;
    private EditText ednpm;
    private EditText edalamat;
    private EditText ednotlpn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ketiga);

        Intent in = getIntent();
        String nama = in.getExtras().getString("Nama");
        String npm = in.getExtras().getString("NPM");
        String alamat = in.getExtras().getString("Alamat");
        String notlpn = in.getExtras().getString("notlpn");
        this.posisi = in.getExtras().getInt("posisi");

        this.edNama = (EditText)findViewById(R.id.editTextnama);
        this.ednpm = (EditText)findViewById(R.id.editTextnpm);
        this.edalamat = (EditText)findViewById(R.id.editTextalamat);
        this.ednotlpn = (EditText)findViewById(R.id.editTextnotlpn);

        this.edNama.setText(nama);
        this.ednpm.setText(npm);
        this.edalamat.setText(alamat);
        this.ednotlpn.setText(notlpn);
    }

    public void kembalikehome(View view) {
        Intent kembalihome = new Intent(this,MainActivity.class);
        kembalihome.putExtra("Nama",this.edNama.getText().toString());
        kembalihome.putExtra("NPM",this.ednpm.getText().toString());
        kembalihome.putExtra("Alamat",this.edalamat.getText().toString());
        kembalihome.putExtra("notlpn",this.ednotlpn.getText().toString());
        kembalihome.putExtra("posisi",this.posisi);
        startActivity(kembalihome);
    }
}
