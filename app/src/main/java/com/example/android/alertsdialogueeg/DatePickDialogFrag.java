package com.example.android.alertsdialogueeg;


import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickDialogFrag extends DialogFragment {


    public DatePickDialogFrag() {
        // Required empty public constructor
    }

    //@TargetApi(Build.VERSION_CODES.N)
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;

        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int year = calendar.get(java.util.Calendar.YEAR);
        int month = calendar.get(java.util.Calendar.MONTH);
        int date = calendar.get(java.util.Calendar.DATE);

        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Toast.makeText(getActivity(), "year - " +year, Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(), "month - " +month, Toast.LENGTH_SHORT).show();
                Toast.makeText(getActivity(), "date - " +dayOfMonth, Toast.LENGTH_SHORT).show();
            }
        }, year, month, date);
        d = datePickerDialog;
        return d;
    }
}
