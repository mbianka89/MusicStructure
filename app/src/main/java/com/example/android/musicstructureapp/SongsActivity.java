package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the View that shows the search category in the Songs Activity
        ImageView searchButton = (ImageView) findViewById(R.id.search_button);

        // Set a click listener on that View
        searchButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the search button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SearchActivity}
                Intent SearchIntent = new Intent(SongsActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(SearchIntent);
            }
        });

        // Find the View that shows the playlists category in the Songs Activity
        ImageView playlistsButton = (ImageView) findViewById(R.id.playlists_button);

        // Set a click listener on that View
        playlistsButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the songs button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent PlaylistsIntent = new Intent(SongsActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(PlaylistsIntent);
            }
        });
    }
}