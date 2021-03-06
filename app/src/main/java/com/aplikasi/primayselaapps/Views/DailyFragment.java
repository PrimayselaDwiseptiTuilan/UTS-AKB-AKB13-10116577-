package com.aplikasi.primayselaapps.Views;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aplikasi.primayselaapps.Presenter.DailyActivityAdapter;
import com.aplikasi.primayselaapps.Presenter.FriendListAdapter;
import com.aplikasi.primayselaapps.Models.FriendListModel;
import com.aplikasi.primayselaapps.Models.DailyActivityModel;
import com.aplikasi.primayselaapps.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * Nim : 10116577
 * Nama : Primaysela Dwisepti Tuilan
 * Kelas : AKB-IF13
 * UTS
 * Tanggal Pengerjaan : 16 Mei 2019
 */

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DailyFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    @BindView(R.id.rvDaily)
    RecyclerView rvDaily;
    List<DailyActivityModel> dailyActivityModelList;
    //FriendList Init
    @BindView(R.id.rvFriendList)
    RecyclerView rvFriendList;
    List<FriendListModel> friendListModelList;
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public DailyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFragment=inflater.inflate(R.layout.fragment_daily, container, false);
        ButterKnife.bind(this,viewFragment);
        //Proses RV Daily
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        initDataDaily();
        rvDaily.setLayoutManager(linearLayoutManager);
        rvDaily.setHasFixedSize(true);
        DailyActivityAdapter dailyActivityAdapter =new DailyActivityAdapter(getContext(), dailyActivityModelList);
        rvDaily.setAdapter(dailyActivityAdapter);
        //Proses RV Daily END
        //Proses RV Friend
        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        initDataFriend();
        rvFriendList.setLayoutManager(linearLayoutManager2);
        rvFriendList.setHasFixedSize(true);
        FriendListAdapter friendListAdapter=new FriendListAdapter(getContext(),friendListModelList);
        rvFriendList.setAdapter(friendListAdapter);
        //Proses RV Friend END
        return viewFragment;
    }

    private void initDataFriend() {
        friendListModelList =new ArrayList<>();
        friendListModelList.add(new FriendListModel("Ari A","19 Tahun", R.drawable.ariabdul));
        friendListModelList.add(new FriendListModel("Army Y","18 Tahun", R.drawable.army));
        friendListModelList.add(new FriendListModel("Chandra S","13 Tahun", R.drawable.chandra));

    }

    private void initDataDaily() {
        dailyActivityModelList = new ArrayList<>();
        dailyActivityModelList.add(new DailyActivityModel("Ari Abdul Majid","10116322"));
        dailyActivityModelList.add(new DailyActivityModel("Putra Army YST","10116331"));
        dailyActivityModelList.add(new DailyActivityModel("Chandra Septian","10116333"));
        dailyActivityModelList.add(new DailyActivityModel("Boby Maulana S","10116334"));
        dailyActivityModelList.add(new DailyActivityModel("Muhammad Ilyas","101163339"));
        dailyActivityModelList.add(new DailyActivityModel("MA'SUM Abdul M","10116342"));
        dailyActivityModelList.add(new DailyActivityModel("Lukmannudin","10116347"));
        dailyActivityModelList.add(new DailyActivityModel("Diki Supriadi","10116352"));
        dailyActivityModelList.add(new DailyActivityModel("Dzulfikar MAS","10116358"));
        dailyActivityModelList.add(new DailyActivityModel("Aditia Renaldi","10116359"));
        dailyActivityModelList.add(new DailyActivityModel("Fikri Ahmad R","10116362"));
        dailyActivityModelList.add(new DailyActivityModel("Luthfi Alfarisi","10116365"));
        dailyActivityModelList.add(new DailyActivityModel("Muhammad Habib NF","10116369"));
        dailyActivityModelList.add(new DailyActivityModel("Alexander Manuel S","10116370"));



    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
