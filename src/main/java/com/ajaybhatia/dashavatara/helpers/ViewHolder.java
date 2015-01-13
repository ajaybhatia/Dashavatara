package com.ajaybhatia.dashavatara.helpers;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ajaybhatia.dashavatara.R;

public class ViewHolder {

    private ImageView imageView;
    private TextView titleTextView;
    private TextView descriptionTextView;

    public ViewHolder(View view) {
        imageView = (ImageView) view.findViewById(R.id.imageView);
        titleTextView = (TextView) view.findViewById(R.id.nameTextView);
        descriptionTextView = (TextView) view.findViewById(R.id.descriptionTextView);
    }

    public ImageView getImageView() {
        return imageView;
    }

    public TextView getTitleTextView() {
        return titleTextView;
    }

    public TextView getDescriptionTextView() {
        return descriptionTextView;
    }
}
