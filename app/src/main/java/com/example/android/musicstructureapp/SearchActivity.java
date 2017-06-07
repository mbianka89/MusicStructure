package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;


public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Find the View that shows the songs category in the Search Activity
        ImageView songsButton = (ImageView) findViewById(R.id.songs_button);

        // Set a click listener on that View
        songsButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the songs button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent SongsIntent = new Intent(SearchActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(SongsIntent);
            }
        });

        // Find the View that shows the playlists category in the Search Activity
        ImageView playlistsButton = (ImageView) findViewById(R.id.playlists_button);

        // Set a click listener on that View
        playlistsButton.setOnClickListener(new View.OnClickListener()

        {
            // The code in this method will be executed when the songs button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent PlaylistsIntent = new Intent(SearchActivity.this, PlaylistsActivity.class);

                // Start the new activity
                startActivity(PlaylistsIntent);
            }
        });
    }
}