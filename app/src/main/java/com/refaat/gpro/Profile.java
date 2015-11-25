package com.refaat.gpro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by PC on 10/08/2015.
 */
public class Profile extends Activity{

    TextView T1,T2,T3,T4;

    String nn1,nn2,mm,locc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);


        Intent values = this.getIntent();
        nn1 = (String) values.getExtras().get("firstname");
        nn2 = (String) values.getExtras().get("secondname");
        mm = (String) values.getExtras().get("maill");
        locc = (String) values.getExtras().get("locc");


        T1 = (TextView) findViewById(R.id.tt1);
        T2 = (TextView) findViewById(R.id.tt2);
        T3 = (TextView) findViewById(R.id.tt3);
        T4 = (TextView) findViewById(R.id.tt4);

        T1.setText(nn1);
        T2.setText(nn2);
        T3.setText(mm);
        T4.setText(locc);



    }




}
