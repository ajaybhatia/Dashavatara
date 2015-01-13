/*
 * Copyright © 2015 Ajay Bhatia <prof.ajaybhatia@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

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
