package org.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloActivity extends Activity {
    private int count = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_layout);

        final TextView mainText = (TextView)findViewById(R.id.main_text);
        Button okButton = (Button)findViewById(R.id.ok_button);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainText.setText("" + (++count));
            }
        });
        mainText.setText("abc");
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}