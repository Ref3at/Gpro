package com.refaat.gpro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by PC on 26/07/2015.
 */
public class Sign_up extends Activity {
    String n1;
    String n2;
    String m;
    String locn;

    EditText fn;
    EditText sn ;
    EditText mal ;
    EditText loc;

    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

         fn = (EditText) findViewById(R.id.f_Name);
        sn = (EditText) findViewById(R.id.sec_Name);
         mal = (EditText) findViewById(R.id.mail);
         loc = (EditText) findViewById(R.id.loca);
        rg = (RadioGroup) findViewById(R.id.gendre);

    }

    public void getparm(View view){

        n1 = fn.getText().toString();
        n2  = sn.getText().toString();
        m = mal.getText().toString();
        locn = loc.getText().toString();

        Toast.makeText(this,n1,Toast.LENGTH_LONG).show();
        Toast.makeText(this,n2,Toast.LENGTH_LONG).show();
        Toast.makeText(this,m,Toast.LENGTH_LONG).show();
        Toast.makeText(this,locn,Toast.LENGTH_LONG).show();

        getGendre();


        Intent i = new Intent(Sign_up.this,Profile.class);
        i.putExtra("firstname", n1);
        i.putExtra("secondname",n2);
        i.putExtra("maill", m);
        i.putExtra("locc", locn);
        Sign_up.this.startActivity(i);



    }

    public void getGendre(){
        int gend = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(gend);
        String xx = rb.getText().toString();

        Toast.makeText(this,xx,Toast.LENGTH_LONG).show();

    }

}
