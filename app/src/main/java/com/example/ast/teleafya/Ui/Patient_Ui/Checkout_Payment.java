package com.example.ast.teleafya.Ui.Patient_Ui;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.ast.teleafya.R;

import java.util.zip.Inflater;

/**
 * Created by Kashif on 11/22/2017.
 */

public class Checkout_Payment extends android.support.v4.app.Fragment {

    Button btn1;
    public Dialog book_dialog;
    LinearLayout linearLayout;
    CardView cardView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.order_medicine_checkout , null);

        btn1 = (Button)view.findViewById(R.id.Order_Checkout);


        linearLayout = (LinearLayout)view.findViewById(R.id.LinearDebit);


        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                getActivity().getSupportFragmentManager().beginTransaction().add(android.R.id.content ,new Checkout_Payment_New()).commit();


            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View completeView = getActivity().getLayoutInflater().inflate(R.layout.order_medicine_paynow, null);

                book_dialog = new Dialog(getActivity());
                book_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                book_dialog.setContentView(completeView);
                book_dialog.setCancelable(true);
                book_dialog.show();
            }
        });

        return view;
    }
}
