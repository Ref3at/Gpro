package com.refaat.gpro;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button S_in;
    private Button S_up;
    private Button N_t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        S_in = (Button) findViewById(R.id.s_in);
        S_up = (Button) findViewById(R.id.s_up);
        N_t = (Button) findViewById(R.id.n_t);

    }

    public void sing(View view){
        Intent i = new Intent(MainActivity.this,Sign_in.class);
        MainActivity.this.startActivity(i);
    }

    public void singUp(View view){
        Intent ii = new Intent(MainActivity.this,Sign_up.class);
        MainActivity.this.startActivity(ii);
    }

    public void not(View view){
        Intent iii = new Intent(MainActivity.this,Welcome.class);
        MainActivity.this.startActivity(iii);
    }


}
