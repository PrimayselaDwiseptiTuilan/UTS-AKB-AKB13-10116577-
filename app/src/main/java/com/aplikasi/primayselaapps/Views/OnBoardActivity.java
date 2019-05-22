package com.aplikasi.primayselaapps.Views;
/**
 * Nim : 10116577
 * Nama : Primaysela Dwisepti Tuilan
 * Kelas : AKB-IF13
 * UTS
 * Tanggal Pengerjaan : 16 Mei 2019
 */
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aplikasi.primayselaapps.Presenter.OnBoardActivityAdapter;
import com.aplikasi.primayselaapps.R;

public class OnBoardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        ViewPager viewPager=(ViewPager) findViewById(R.id.pagerOnBoard);
        OnBoardActivityAdapter onBoardActivityAdapter=new OnBoardActivityAdapter(getSupportFragmentManager());
        viewPager.setAdapter(onBoardActivityAdapter);
//        TabLayout tabLayout = (TabLayout) viewFragment.findViewById(R.id.tablayout);
//        tabLayout.setupWithViewPager(viewPager);
    }


}
