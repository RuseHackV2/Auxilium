package example.com.auxilium.auxilium;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;


public class MainActivity extends Activity implements View.OnClickListener{
    public ImageView login;
    public ImageView reg;
    public ImageView kandidati;
    public EditText potrebitel;
    public EditText parola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        kandidati=(ImageView)findViewById(R.id.kandidati);
        kandidati.setOnClickListener(this);

        login=(ImageView)findViewById(R.id.login);
        login.setOnClickListener(this);

        reg=(ImageView)findViewById(R.id.reg);
        reg.setOnClickListener(this);

        potrebitel=(EditText)findViewById(R.id.potrebitel);

        parola=(EditText)findViewById(R.id.password);



    }

    public void onClick(View v) {
        if (potrebitel.getText().toString().equals("Ivanpetrov@abv.bg")) {
            if (v.getId() == login.getId()) {
                startActivity(new Intent(this, profill_ivan.class));
                finish();
            }
        }
            if (potrebitel.getText().toString().equals("Startup@abv.bg")) {
                if (v.getId() == login.getId()) {
                    startActivity(new Intent(this, profill_start.class));
                    finish();
                }

            }

        if (potrebitel.getText().toString().equals("3")) {
            if (v.getId() == login.getId()) {
                startActivity(new Intent(this, map.class));
                finish();
            }
        }


            if (v.getId() == reg.getId()) {
                startActivity(new Intent(this, registraciq.class));
                finish();
            }
        if (v.getId() == kandidati.getId()) {
            startActivity(new Intent(this, kandidati_nologin.class));
            finish();
        }




    }
    public void onBackPressed()
    {
        finish ();
    }
    }

