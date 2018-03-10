package danielcoates27.com.actforyorkshire;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class NewNoun extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_noun);

        Button done = (Button) findViewById(R.id.done);
        Button upload = (Button) findViewById(R.id.upload);
        EditText nounName = (EditText) findViewById(R.id.nounName);
        ImageView nounimage = (ImageView) findViewById(R.id.nounimage);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }

}
