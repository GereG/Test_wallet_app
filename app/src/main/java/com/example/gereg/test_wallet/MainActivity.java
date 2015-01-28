package com.example.gereg.test_wallet;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button game_activity_button = (Button)findViewById(R.id.game_activity_button);

        View.OnClickListener game_activity_button_listener = new View.OnClickListener() {
            public void onClick(View v) {
                // do something when the button is clicked
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                startActivity(intent);
            }
        };
        game_activity_button.setOnClickListener(game_activity_button_listener);
    }

 /*   private View.OnClickListener game_activity_button_listener = new View.OnClickListener() {
        public void onClick(View v) {
            // do something when the button is clicked
            Intent intent = new Intent(MainActivity.this, GameActivity.class);
            startActivity(intent);
        }
    };
    public void setGame_activity_button_listener(View.OnClickListener game_activity_button_listener) {
        this.game_activity_button_listener = game_activity_button_listener;
    }

    public void setGame_activity_button(Button game_activity_button) {
        this.game_activity_button = game_activity_button;
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
