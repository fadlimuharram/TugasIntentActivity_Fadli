package com.adminblogpadli.tugasintentactivity_fadli;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by azurescarlet on 9/5/17.
 */

public class Layoutdua extends Activity{

    private String nama,npm,alamat,notlpn;
    private int posisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_kedua);

        Intent in = getIntent();
        this.nama = in.getExtras().getString("Nama");
        this.npm = in.getExtras().getString("NPM");
        this.alamat = in.getExtras().getString("Alamat");
        this.notlpn = in.getExtras().getString("notlpn");
        this.posisi = in.getExtras().getInt("posisi");

        TextView namatextview = (TextView)findViewById(R.id.namanya);
        TextView npmtextview = (TextView)findViewById(R.id.npmnya);
        TextView alamattextview = (TextView)findViewById(R.id.alamatnnya);
        TextView notlpntextview = (TextView)findViewById(R.id.notlpnnya);

        namatextview.setText(this.nama);
        npmtextview.setText(this.npm);
        alamattextview.setText(this.alamat);
        notlpntextview.setText(this.notlpn);
    }

    public void KlikKeLayoutTiga(View view) {
        Intent layouttiga = new Intent(this,LayoutTiga.class);
        layouttiga.putExtra("Nama",this.nama);
        layouttiga.putExtra("NPM",this.npm);
        layouttiga.putExtra("Alamat",this.alamat);
        layouttiga.putExtra("notlpn",this.notlpn);
        layouttiga.putExtra("posisi",this.posisi);
        startActivity(layouttiga);
    }
}
