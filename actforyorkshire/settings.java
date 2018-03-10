package danielcoates27.com.actforyorkshire;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Switch;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button newPerson = (Button) findViewById(R.id.uploadPerson);
        Button newAction = (Button) findViewById(R.id.uploadAction);
        Button newNoun = (Button) findViewById(R.id.uploadNoun);
        Switch darkmode = (Switch) findViewById(R.id.darkMode);
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.rel);
        Boolean switchState = darkmode.isChecked();
        /*if (switchState == false){

            layout.setBackgroundColor(Color.parseColor("#5d6777"));
        }
        else{
            layout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }*/

        newPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent person = new Intent(settings.this, NewPerson.class);
                settings.this.startActivity(person);
            }
        });

        newAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent action = new Intent(settings.this, NewAction.class);
                settings.this.startActivity(action);
            }
        });

        newNoun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent noun = new Intent(settings.this, NewNoun.class);
                settings.this.startActivity(noun);
            }
        });






        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

}
