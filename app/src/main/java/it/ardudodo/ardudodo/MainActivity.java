package it.ardudodo.ardudodo;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by andrea on 25/01/17.
 */

public class MainActivity extends Activity{

    public static final String USERNAME_KEY = "username";

    TextView welcomeTextView;
    Button changeTextBtn;
    EditText changeTextEdit;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeTextView = (TextView) findViewById(R.id.welcome_textview);
        changeTextBtn = (Button) findViewById(R.id.change_button);
        changeTextEdit = (EditText) findViewById(R.id.change_edit_text);


        changeTextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                    //welcomeTextView.setText(changeTextEdit.getText());
                username = changeTextEdit.getText().toString();
                Intent intent = new Intent(getBaseContext(),SecondActivity.class);
                intent.putExtra(USERNAME_KEY,username);
                startActivity(intent);
            }
        });
    }


}
