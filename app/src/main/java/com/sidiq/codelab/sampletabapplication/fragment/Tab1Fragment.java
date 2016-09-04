package com.sidiq.codelab.sampletabapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.sidiq.codelab.sampletabapplication.R;

public class Tab1Fragment extends Fragment {

    private EditText edtPanjang, edtLebar;
    private Button btnHitung;
    private TextView txtLuas;


    public Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        edtPanjang = (EditText)view.findViewById(R.id.edt_panjang);
        /**
         * edtPanjang.setOnEditorActionListener(new TextView.OnEditorActionListener(){

            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent){
                boolean handled = false;
                if (i == EditorInfo.IME_ACTION_NEXT){

                }
                return handled;
            }
        });
         **/
        edtLebar = (EditText)view.findViewById(R.id.edt_lebar);
        btnHitung = (Button)view.findViewById(R.id.btn_hitung);
        txtLuas = (TextView)view.findViewById(R.id.txt_luas);
        return  view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
      super.onActivityCreated(savedInstanceState);
       btnHitung.setOnClickListener(new View.OnClickListener() {
				@Override
        public void onClick(View view) {
          try{


            String lebar = edtLebar.getText().toString().trim();
              String panjang = edtPanjang.getText().toString().trim();


            Double p = Double.parseDouble(panjang);
              Double l = Double.parseDouble(lebar);

			Double luas = p * l;

			txtLuas.setText("Luas : " + luas);
			} catch(NumberFormatException nfe){
			    nfe.printStackTrace();
          }
        }
      });
    }
    public static void cekInputan(){

    }
}
