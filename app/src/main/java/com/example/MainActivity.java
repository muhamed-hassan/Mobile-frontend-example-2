package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edit_view);

        Button helloButton = (Button) findViewById(R.id.hello_button);
        helloButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();
                goToWelcomeScreen(name);
            }
        });
    }

    public void goToWelcomeScreen(String name) {
        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtra("user", name);
        startActivity(intent);
    }
}
