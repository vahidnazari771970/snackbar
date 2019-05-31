package com.example.vahid.snackbar;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout cdLayout;
    FloatingActionButton Fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cdLayout = findViewById(R.id.cd_layout);
        Fab = findViewById(R.id.fab);

        Fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               final Snackbar snkbr = Snackbar.make(cdLayout, "Sample Snackbar Message",
                        Snackbar.LENGTH_LONG);
                snkbr.setDuration(7000);

                snkbr.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        snkbr.dismiss();

                    }
                });

                snkbr.setActionTextColor(getResources().getColor(R.color.colorPrimaryDark));

                View snkView = snkbr.getView();
                snkView.setBackgroundColor(Color.GRAY);
                TextView txtView = snkView.findViewById(android.support.design.R.id.snackbar_text);
                txtView.setTextColor(Color.GREEN);


                snkbr.show();


            }
        });
    }
}
