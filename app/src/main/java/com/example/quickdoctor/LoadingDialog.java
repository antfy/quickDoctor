package com.example.quickdoctor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.widget.TextView;

class LoadingDialog {

    Context context;
    Dialog dialog;

    public LoadingDialog (Context context) {
        this.context = context;
    }

    public void ShowDialog(String title) {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        TextView titleTextView = dialog.findViewById(R.id.txtLoad);
        titleTextView.setText(title);
        dialog.create();
        dialog.show();
    }

    public void HideDialog() {
        dialog.dismiss();
    }
}
