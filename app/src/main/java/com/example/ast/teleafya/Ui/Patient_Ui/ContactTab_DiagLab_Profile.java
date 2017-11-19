package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Recommanded_DiagListAdapter;

import java.util.ArrayList;

/**
 * Created by AST on 10/27/2017.
 */

public class ContactTab_DiagLab_Profile extends android.support.v4.app.Fragment {

    public ListView recomanded_diag_lab;
    public Recommanded_DiagListAdapter recommanded_diagListAdapter;
    public ArrayList<String> arrayList;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.contactlab_diag_profile,null);

        return view;
    }
}
