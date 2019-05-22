package com.aplikasi.primayselaapps.Presenter;
/**
 * Nim : 10116577
 * Nama : Primaysela Dwisepti Tuilan
 * Kelas : AKB-IF13
 * UTS
 * Tanggal Pengerjaan : 16 Mei 2019
 */
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aplikasi.primayselaapps.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FriendListViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.txtFriendListName)
    TextView txtFriendListName;
    @BindView(R.id.txtFriendListAge) TextView txtFriendListAge;
    @BindView(R.id.imgFriendList)
    ImageView imgFriendList;
    private ArrayList<String> friendListModel=new ArrayList<>();

    public FriendListViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public void setItem(ArrayList<String> item){//penerima value dari adapter
        friendListModel=item;
    }


}
