package com.example.android.alertsdialogueeg;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlertDialogFrag extends DialogFragment {


    public AlertDialogFrag() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Dialog d = null;

        AlertDialog.Builder ab = new AlertDialog.Builder(getActivity());
        ab.setTitle("My first dialog");
        ab.setIcon(R.mipmap.ic_launcher);   //for setting icon
        ab.setMessage("Welcome to AlertDialogBox");
        ab.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"You Clicked",Toast.LENGTH_SHORT).show();
            }
        });
        ab.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"You Canceled",Toast.LENGTH_SHORT).show();
            }
        });
        d = ab.create();

        return d;
    }
}
