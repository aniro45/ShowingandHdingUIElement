package com.example.admin.showingandhdinguielement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    public void showClicked(View view){

        textView = (TextView) findViewById(R.id.textViewId);

        textView.setVisibility(View.VISIBLE);

    }

    public void hideClicked(View view){
        textView = (TextView) findViewById(R.id.textViewId);

        textView.setVisibility(View.INVISIBLE);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
