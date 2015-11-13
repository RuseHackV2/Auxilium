package example.com.auxilium.auxilium;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;


public class profill_start extends Activity implements View.OnClickListener {
    public ImageView kandidati;
    public ImageView opisanie;
    public ImageView logout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.profil_start);

        kandidati=(ImageView)findViewById(R.id.kandidati);
        kandidati.setOnClickListener(this);

        opisanie=(ImageView)findViewById(R.id.opisanie);
        opisanie.setOnClickListener(this);


        logout=(ImageView)findViewById(R.id.logout);
        logout.setOnClickListener(this);

   }


    public void onClick(View v) {

        if (v.getId() == kandidati.getId()) {
            startActivity(new Intent(this, kandidati_login.class));
            finish();
        }
        if (v.getId() == opisanie.getId()) {
            startActivity(new Intent(this, registraciq_startup.class));
            finish();
        }
        if (v.getId() == logout.getId()) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }

}

