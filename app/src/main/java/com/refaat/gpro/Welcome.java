package com.refaat.gpro;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by PC on 26/07/2015.
 */
public class Welcome extends Activity {

    Button bt;
    EditText gt;
    TextView st;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);



        st = (TextView) findViewById(R.id.stt);
        gt = (EditText) findViewById(R.id.gtt);
        bt = (Button) findViewById(R.id.btt);


    }

    public void cliko (View view)
    {
        String h = gt.getText().toString();
        st.setText(h);
    }



    @Override
    public void onBackPressed ()
    {
        Toast.makeText(this," ",Toast.LENGTH_LONG).show();
        finish();
    }





}
