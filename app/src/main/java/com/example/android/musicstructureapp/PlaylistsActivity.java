package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        // Find the View that shows the search category in the Playlists Activity
        ImageView searchButton = (ImageView) findViewById(R.id.search_button);

        // Set a click listener on that View
        searchButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the search button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SearchActivity}
                Intent SearchIntent = new Intent(PlaylistsActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(SearchIntent);
            }
        });

        // Find the View that shows the songs category in the Playlists Activity
        ImageView songsButton = (ImageView) findViewById(R.id.songs_button);

        // Set a click listener on that View
        songsButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the songs button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent SongsIntent = new Intent(PlaylistsActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(SongsIntent);
            }
        });
    }
}