package com.example.android.alertsdialogueeg;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProgressDialogFrag extends DialogFragment {


    public ProgressDialogFrag() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;

        ProgressDialog pg = new ProgressDialog(getActivity());
        pg.setTitle("Uploading!");
        pg.setMessage("2 of 5 downloading");
        pg.setProgress(30);
        pg.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        d = pg;
        return d;
    }
}
