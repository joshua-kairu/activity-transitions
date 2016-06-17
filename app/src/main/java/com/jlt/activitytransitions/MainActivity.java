package com.jlt.activitytransitions;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

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

// begin activity MainActivity
public class MainActivity extends Activity {

    /** CONSTANTS */

    /** VARIABLES */

    /* Grid Views */

    @Bind( R.id.am_gv )
    GridView gridView; // the grid view that will be in this activity

    /** METHODS */

    /** Getters and Setters */

    /**
     * Overrides
     */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super things
        // 1. use the main activity layout
        // 2. bind views
        // 3. use the grid adapter
        // 4. when a grid item is clicked
        // 4a. transition to the details activity

        // 0. super things

        super.onCreate( savedInstanceState );

        // 1. use the main activity layout

        setContentView( R.layout.activity_main );

        // 2. bind views

        ButterKnife.bind( this );

        // 3. use the grid adapter

        gridView.setAdapter( new GridAdapter( this ) );

        // 4. when a grid item is clicked

        // 4a. transition to the details activity

    } // end onCreate

    /**
     * Other Methods
     */

    @OnItemClick( R.id.am_gv )
    // begin onGridItemClick
    void onGridItemClick( AdapterView< ? > parent, View clickedView, int position, long id ) {

        // 0. initialize a bundle that will be used to start a transition to the details
        // 1. start the details activity

        // 0. initialize a bundle that will be used to start a transition to the details

        Bundle transitionStarterBundle = ActivityOptions.makeSceneTransitionAnimation( MainActivity.this ).toBundle();

        // 1. start the details activity

        startActivity( new Intent( MainActivity.this, DetailsActivity.class ), transitionStarterBundle );

    } // end onGridItemClick

} // end activity MainActivity