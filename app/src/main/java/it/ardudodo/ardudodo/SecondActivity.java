package it.ardudodo.ardudodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.test.suitebuilder.TestMethod;
import android.widget.TextView;

public class SecondActivity extends Activity {

    private static final String USERNAME_KEY = "username";

    TextView name_textview;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name_textview = (TextView) findViewById(R.id.name_textview);
        intent = getIntent();
        name_textview.setText(intent.getStringExtra(USERNAME_KEY));
    }
}
