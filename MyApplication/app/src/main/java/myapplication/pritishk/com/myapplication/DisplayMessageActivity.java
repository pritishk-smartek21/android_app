package myapplication.pritishk.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();


        Bundle message = intent.getExtras();
        TextView textView = new TextView(this);
        TextView table = new TextView(this);
        textView.setTextSize(40);
      //  textView.setText("Hello "+message.get("EXTRA_MESSAGE").toString()+"! and counter: "+message.get("COUNTER_MESSAGE").toString());
        int counter = Integer.parseInt(message.get("COUNTER_MESSAGE").toString());
        for(int i = 1; i < 11; i++){
            table.append((message.get("COUNTER_MESSAGE").toString()+" * "+i+" = "+ counter*i+"\n"));
        }

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);
        layout.addView(table);

    }
}

