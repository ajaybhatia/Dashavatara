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

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.ajaybhatia.dashavatara.R;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Avatar> list;

    public MyAdapter(Context context) {
        list = new ArrayList<Avatar>();
        this.context = context;

        Resources resources = context.getResources();
        final String[] titles = resources.getStringArray(R.array.titles);
        final String[] description = resources.getStringArray(R.array.short_descriptions);
        final int[] images = {
            R.drawable.avatar01,
            R.drawable.avatar02,
            R.drawable.avatar03,
            R.drawable.avatar04,
            R.drawable.avatar05,
            R.drawable.avatar06,
            R.drawable.avatar07,
            R.drawable.avatar08,
            R.drawable.avatar09,
            R.drawable.avatar10
        };

        for (int i = 0; i < titles.length; i++)
            list.add(new Avatar(images[i], titles[i], description[i]));
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder viewHolder = null;

        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.row_item, parent, false);

            viewHolder = new ViewHolder(row);
            row.setTag(viewHolder);
        } else
            viewHolder = (ViewHolder) row.getTag();

        Avatar avatar = list.get(position);

        viewHolder.getImageView().setImageResource(avatar.getImage());
        viewHolder.getTitleTextView().setText(avatar.getTitle());
        viewHolder.getDescriptionTextView().setText(avatar.getDescription());

        return row;
    }
}
