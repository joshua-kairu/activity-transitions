package com.jlt.activitytransitions;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Activity Transitions
 *
 * A simple tutorial app to highlight the new Android transitions between activities
 * <p/>
 * Copyright (C) 2016 Kairu Joshua Wambugu
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */

// begin class GridAdapter
// adapter for the grid view in the main activity
public class GridAdapter extends BaseAdapter {

    /** CONSTANTS */

    /** VARIABLES */

    /* Activities */

    private Activity hostActivity; // the activity hosting this grid

    /** CONSTRUCTOR */

    // constructor
    public GridAdapter( Activity hostActivity ) { this.hostActivity = hostActivity; }

    /** METHODS */

    /** Getters and Setters */

    /** Overrides */

    @Override
    // getCount
    public int getCount() { return 20; }

    @Override
    // getItem
    public Object getItem( int position ) { return null; }

    @Override
    // getItemId
    public long getItemId( int position ) { return position; }

    @Override
    // begin getView
    public View getView( int position, View convertView, ViewGroup parent ) {

        // 0. if the old view (the old text view) null
        // 0a. reinitialize it to have the grid item (text) view
        // 1. set the (text) view in the grid to show A
        // 2. return the (text) view

        // 0. if the old view (the old text view) null

        // 0a. reinitialize it to have the grid item (text) view

        if ( convertView == null ) { convertView = hostActivity.getLayoutInflater().inflate( R.layout.grid_item, parent, false ); }

        // 1. set the (text) view in the grid to show A

        ( ( TextView ) convertView ).setText( "Aa" );

        // 2. return the (text) view

        return convertView;

    } // end getView


    /** Other Methods */

} // end class GridAdapter