package com.adminblogpadli.tugasintentactivity_fadli;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by azurescarlet on 8/5/17.
 */

public class MyAdapter extends ArrayAdapter<DataMahasiswa> {

    private ArrayList<DataMahasiswa> mhs;

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View theview = convertView;
        if (theview == null) {
            LayoutInflater theinflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            theview = theinflater.inflate(R.layout.row_layout,null);
        }

        DataMahasiswa dtmhs = mhs.get(position);

        if (dtmhs != null){
            TextView thetextview = (TextView) theview.findViewById(R.id.textviewmhs);
            thetextview.setText(dtmhs.getNama());

            ImageView theimg = (ImageView) theview.findViewById(R.id.icondefnya);

            theimg.setImageResource(R.drawable.defico);
        }

        return theview;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }


    public MyAdapter(Context context, ArrayList<DataMahasiswa>Values) {
        super(context,R.layout.row_layout, Values);
        this.mhs = Values;
    }

}
