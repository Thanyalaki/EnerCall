package nook.snru.ac.th.enercall.fragment;


import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import nook.snru.ac.th.enercall.R;
import nook.snru.ac.th.enercall.utility.HospitalAdapter;

/**
 * Created by Admin on 22/2/2561.
 */

public class HospilalFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create ListView
        ListView listView = getView().findViewById(R.id.listViewHopotal);

       int[] ints = new int[]{R.drawable.station1,R.drawable.station2,
               R.drawable.station3,R.drawable.station4,R.drawable.station1
               ,R.drawable.station2,R.drawable.station3,R.drawable.station4};

        String[] titleStrings = new String[]{"Hopital l","Hospital 2","Hopital 3","Hopital 4",
                "Hopital 5","Hopital 6","Hopital 7","Hopital 8",};

         String [] phoneStrings = new String[]{"1111","1112","1113","1114","1115"
                 ,"1116","1117","1118"};

         HospitalAdapter hospitalAdapter =new HospitalAdapter(getActivity(),ints, titleStrings, phoneStrings);
         listView.setAdapter(hospitalAdapter);


    }//Main Method



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hospital, container, false);
        return view;
    }
}  // Main Class

