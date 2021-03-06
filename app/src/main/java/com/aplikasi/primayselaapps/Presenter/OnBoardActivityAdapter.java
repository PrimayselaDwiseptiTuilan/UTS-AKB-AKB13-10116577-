package com.aplikasi.primayselaapps.Presenter;
/**
 * Nim : 10116577
 * Nama : Primaysela Dwisepti Tuilan
 * Kelas : AKB-IF13
 * UTS
 * Tanggal Pengerjaan : 16 Mei 2019
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.aplikasi.primayselaapps.Views.SubOnBoard.OnBoard1;
import com.aplikasi.primayselaapps.Views.SubOnBoard.OnBoard2;
import com.aplikasi.primayselaapps.Views.SubOnBoard.OnBoard3;

public class OnBoardActivityAdapter extends FragmentStatePagerAdapter {
    public OnBoardActivityAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                OnBoard1 onBoard1=new OnBoard1();
                return onBoard1;
            case 1:
                OnBoard2 onBoard2=new OnBoard2();
                return onBoard2;
            case 2:
                OnBoard3 onBoard3=new OnBoard3();
                return onBoard3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int i){
        switch (i){
            case 0:
                return "onboard1";
            case 1:
                return "onboard2";
            case 2:
                return "onboard3";
        }
        return null;
    }
}
