package com.adminblogpadli.tugasintentactivity_fadli;

import android.util.Log;

/**
 * Created by azurescarlet on 8/5/17.
 */

public class DataMahasiswa {
    private String nama, npm, alamat, nohp;

    public DataMahasiswa(String nama, String npm,String alamat, String nohp){
        this.nama = nama;
        this.npm = npm;
        this.alamat = alamat;
        this.nohp = nohp;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getNohp() {
        return nohp;
    }

    public String getAlamat() {
        return alamat;
    }
}
