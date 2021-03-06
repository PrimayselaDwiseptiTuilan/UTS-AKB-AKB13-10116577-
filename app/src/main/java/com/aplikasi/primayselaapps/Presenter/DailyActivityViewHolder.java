package com.aplikasi.primayselaapps.Presenter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.aplikasi.primayselaapps.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Nim : 10116577
 * Nama : Primaysela Dwisepti Tuilan
 * Kelas : AKB-IF13
 * UTS
 * Tanggal Pengerjaan : 16 Mei 2019
 */
public class DailyActivityViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txtDailyTitle)
    TextView txtDailyTitle;
    @BindView(R.id.txtDailyDescription)
    TextView txtDailyDescription;
    private ArrayList<String> dailyActivityModel=new ArrayList<>();
    public DailyActivityViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setItem(ArrayList<String> item){//penerima value dari adapter
        dailyActivityModel=item;
    }

}
