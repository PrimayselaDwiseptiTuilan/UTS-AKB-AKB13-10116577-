package com.aplikasi.primayselaapps.Presenter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aplikasi.primayselaapps.Models.DailyActivityModel;
import com.aplikasi.primayselaapps.R;

import java.util.List;
/**
 * Nim : 10116577
 * Nama : Primaysela Dwisepti Tuilan
 * Kelas : AKB-IF13
 *UTS
 *Tanggal Pengerjaan : 16 Mei 2019
 */
public class DailyActivityAdapter extends RecyclerView.Adapter<DailyActivityViewHolder> {
    private Context context;
    List<DailyActivityModel> dailyActivityModelList;
    public DailyActivityAdapter(Context context, List<DailyActivityModel> dailyActivityModelList){
        this.context=context;
        this.dailyActivityModelList = dailyActivityModelList;

    }
    @NonNull
    @Override
    public DailyActivityViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_daily,viewGroup,false);
        return new DailyActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DailyActivityViewHolder dailyActivityViewHolder, int i) {
        DailyActivityModel dailyActivityModel = dailyActivityModelList.get(i);
        dailyActivityViewHolder.txtDailyDescription.setText(dailyActivityModel.getDescription());
        dailyActivityViewHolder.txtDailyTitle.setText(dailyActivityModel.getTitle());
    }

    @Override
    public int getItemCount() {
        return dailyActivityModelList.size();
    }
}
