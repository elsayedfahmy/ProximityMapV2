package in.wptrafficanalyzer.proximitymapv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jo on 12/6/2016.
 */
public class Start_activitty extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        Button bt= (Button) findViewById(R.id.BT_Start);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Start_activitty.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}