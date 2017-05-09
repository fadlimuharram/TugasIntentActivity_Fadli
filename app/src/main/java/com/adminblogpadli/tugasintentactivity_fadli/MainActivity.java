package com.adminblogpadli.tugasintentactivity_fadli;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    protected ArrayList<DataMahasiswa> listmahasiswa = new ArrayList<DataMahasiswa>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listmahasiswa.add(new DataMahasiswa("fadli","153112706450017","Pondok Cabe","0123"));
        listmahasiswa.add(new DataMahasiswa("Misaka","1531","Unknown","0888"));
        listmahasiswa.add(new DataMahasiswa("Mikoto","1532","Alamatnya Gk Tau","056565"));

        final MyAdapter adapternya = new MyAdapter(this, listmahasiswa);
        final ListView mylistview = (ListView) findViewById(R.id.listviewmahasiswa);
        mylistview.setAdapter(adapternya);

        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*listmahasiswa.set(position,new DataMahasiswa("gggggg","1111111"));
                mylistview.setAdapter(adapternya);
                adapternya.notifyDataSetChanged();
                String listdipilih = "Anda memilih " + Integer.toString(position) + " nama : " + parent.getItemAtPosition(position);

                Toast.makeText(MainActivity.this, listdipilih, Toast.LENGTH_SHORT).show();*/
                keLayoutDua(listmahasiswa.get(position).getNama(),
                        listmahasiswa.get(position).getNpm(),
                        listmahasiswa.get(position).getAlamat(),
                        listmahasiswa.get(position).getNohp(),
                        position);
            }
        });

        Bundle in = getIntent().getExtras();
        if (in != null){
            String nama = in.getString("Nama");
            String npm = in.getString("NPM");
            String alamat = in.getString("Alamat");
            String notlpn = in.getString("notlpn");
            int posisi = in.getInt("posisi");
            listmahasiswa.set(posisi,new DataMahasiswa(nama,npm,alamat,notlpn));
            mylistview.setAdapter(adapternya);
            adapternya.notifyDataSetChanged();
        }
    }

    public void keLayoutDua(String nama, String npm, String alamat, String notlpn, int posisi){
        Intent layoutdua = new Intent(this,Layoutdua.class);
        layoutdua.putExtra("Nama",nama);
        layoutdua.putExtra("NPM",npm);
        layoutdua.putExtra("Alamat",alamat);
        layoutdua.putExtra("notlpn",notlpn);
        layoutdua.putExtra("posisi",posisi);
        startActivity(layoutdua);
    }

}
