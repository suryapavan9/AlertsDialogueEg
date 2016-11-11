package com.example.android.alertsdialogueeg;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {

    Button b1,b2,b3,b4;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_first, container, false);

        b1 = (Button) v.findViewById(R.id.button1);
        b2 = (Button) v.findViewById(R.id.button2);
        b3 = (Button) v.findViewById(R.id.button3);
        b4 = (Button) v.findViewById(R.id.button4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button1:
                AlertDialogFrag alertDialogFrag = new AlertDialogFrag();
                alertDialogFrag.show(getActivity().getSupportFragmentManager(),null);
                break;
            case R.id.button2:
                ProgressDialogFrag progressDialogFrag = new ProgressDialogFrag();
                progressDialogFrag.show(getActivity().getSupportFragmentManager(),null);
                break;
            case R.id.button3:
                DatePickDialogFrag datePickDialogFrag = new DatePickDialogFrag();
                datePickDialogFrag.show(getActivity().getSupportFragmentManager(),null);
                break;
            case R.id.button4:
                TimePickDialogFrag timePickDialogFrag = new TimePickDialogFrag();
                timePickDialogFrag.show(getActivity().getSupportFragmentManager(),null);
                break;
        }
    }
}
