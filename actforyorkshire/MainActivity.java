package danielcoates27.com.actforyorkshire;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random rand = new Random();
        final int  personNumber = rand.nextInt(4);
        final int  actionNumber = rand.nextInt(4);
        final int  nounNumber = rand.nextInt(4);

        final String[] personArray = {"The man is","The woman is","The child is","The baby is"};
        final String[] actionArray = {"running","digging","hunting","hugging","talking"};
        final String[] nounArray = {"down the street","a big hole","for ducks","the girl","to some friends"};


        final int[] personImageArray = {R.drawable.man,R.drawable.woman,R.drawable.child,R.drawable.baby};
        final int[] actionImageArray ={R.drawable.running,R.drawable.digging,R.drawable.hunting,R.drawable.hugging,R.drawable.talking};
        final int[] nounImageArray ={R.drawable.street,R.drawable.hole,R.drawable.ducks,R.drawable.girl,R.drawable.friends};

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "If you like this app please rate it and tell me how to improve it.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final Button newbutton = (Button) findViewById(R.id.newbutton);
        final TextView person = (TextView) findViewById(R.id.person);
        final TextView action = (TextView) findViewById(R.id.action);
        final TextView noun = (TextView) findViewById(R.id.noun);
        final ImageView personimage = (ImageView) findViewById(R.id.personimage);
        final ImageView actionimage = (ImageView) findViewById(R.id.actionimage);
        final ImageView  nounimage = (ImageView) findViewById(R.id.nounimage);
        final Button revealbutton = (Button) findViewById(R.id.revealbutton);
        person.setText(personArray[personNumber]);
        action.setText(actionArray[actionNumber]);
        noun.setText(nounArray[nounNumber]);
        personimage.setImageResource(personImageArray[personNumber]);
        actionimage.setImageResource(actionImageArray[actionNumber]);
        nounimage.setImageResource(nounImageArray[nounNumber]);


        newbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    noun.setVisibility(view.INVISIBLE);
                    action.setVisibility(view.INVISIBLE);
                    person.setVisibility(view.INVISIBLE);
                    final int  personNumber = rand.nextInt(4);
                    final int  actionNumber = rand.nextInt(4);
                    final int  nounNumber = rand.nextInt(4);
                    person.setText(personArray[personNumber]);
                    action.setText(actionArray[actionNumber]);
                    noun.setText(nounArray[nounNumber]);
                    personimage.setImageResource(personImageArray[personNumber]);
                    actionimage.setImageResource(actionImageArray[actionNumber]);
                    nounimage.setImageResource(nounImageArray[nounNumber]);
                }
        });

        revealbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noun.setVisibility(view.VISIBLE);
                action.setVisibility(view.VISIBLE);
                person.setVisibility(view.VISIBLE);
            }
        });




    }

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
            Intent intent = new Intent(MainActivity.this, settings.class);
            MainActivity.this.startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
