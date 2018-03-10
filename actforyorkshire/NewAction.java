package danielcoates27.com.actforyorkshire;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class NewAction extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_action);

        Button upload = (Button) findViewById(R.id.upload);
        Button done = (Button) findViewById(R.id.done);

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
