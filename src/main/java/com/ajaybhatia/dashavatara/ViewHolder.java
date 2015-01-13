package com.ajaybhatia.dashavatara;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {

    private ImageView imageView;
    private TextView titleTextView;
    private TextView descriptionTextView;

    public ViewHolder(View view) {
        imageView = (ImageView) view.findViewById(R.id.imageView);
        titleTextView = (TextView) view.findViewById(R.id.nameTextView);
        descriptionTextView = (TextView) view.findViewById(R.id.descriptionTextView);
    }
}
