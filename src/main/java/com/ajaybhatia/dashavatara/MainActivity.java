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

package com.ajaybhatia.dashavatara;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.ajaybhatia.dashavatara.fragments.ListFragment;


public class MainActivity extends ActionBarActivity implements ListFragment.Communicator {

    private ListFragment listFragment;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        listFragment = (ListFragment) manager.findFragmentById(R.id.listfragment);
        listFragment.setCommunicator(this);
    }

    @Override
    public void response(int position) {
        Intent intent = new Intent(this, DescriptionActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}
