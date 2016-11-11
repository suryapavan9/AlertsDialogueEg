package com.example.android.alertsdialogueeg;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickDialogFrag extends DialogFragment implements TimePickerDialog.OnTimeSetListener {


    public TimePickDialogFrag() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        Dialog d = null;
        TimePickerDialog tpd;
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        //create new instance for picker dialog and return it
        tpd = new TimePickerDialog(getActivity(), this,hour,minute, android.text.format.DateFormat.is24HourFormat(getActivity()));
        return tpd;

    }

   // public void showTimePickerDialog(View v)
    {

    }
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(getActivity(), "HOUR " +hourOfDay, Toast.LENGTH_SHORT).show();
        Toast.makeText(getActivity(), "MINUTE" +minute, Toast.LENGTH_SHORT).show();
    }
}
