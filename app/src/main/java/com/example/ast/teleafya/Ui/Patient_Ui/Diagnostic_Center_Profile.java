package com.example.ast.teleafya.Ui.Patient_Ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ast.teleafya.R;
import com.example.ast.teleafya.Ui.Adapters.Patient_LoginPager;

import java.util.ArrayList;

/**
 * Created by AST on 10/27/2017.
 */

public class Diagnostic_Center_Profile extends android.support.v4.app.Fragment {
    public ViewPager viewPager;
    public TabLayout tabLayout;
    public ArrayList<Fragment> arrayList;
    public TestTab_DiagLab_Profile testTab_diagLab_profile;
    public ContactTab_DiagLab_Profile contactTab_diagLab_profile;
    public Patient_LoginPager patientLoginPager;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.diagnostic_lab_profile,null);

        initView(view);


        return view;
    }

    private void initView(View view) {

        viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        tabLayout = (TabLayout) view.findViewById(R.id.tab_layout);
        arrayList = new ArrayList<>();
        testTab_diagLab_profile = new TestTab_DiagLab_Profile();
        contactTab_diagLab_profile = new ContactTab_DiagLab_Profile();

        arrayList.add(testTab_diagLab_profile);
        arrayList.add(contactTab_diagLab_profile);

        tabLayout.addTab(tabLayout.newTab().setText("TEST"));
        tabLayout.addTab(tabLayout.newTab().setText("CONTACT INFO"));

        patientLoginPager = new Patient_LoginPager(getActivity().getSupportFragmentManager(), arrayList);
        //is line se tablayout k neche jo shade araaha hai woh change hoga pageviewer k mutabik
        viewPager.setAdapter(patientLoginPager);
        // viewPager.setOffscreenPageLimit(0);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
