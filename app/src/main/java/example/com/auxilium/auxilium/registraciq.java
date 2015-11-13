package example.com.auxilium.auxilium;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;


public class registraciq extends Activity implements View.OnClickListener {
    public ImageView kandidat;
    public ImageView firma;
    public ImageView back;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.registraciq);

        kandidat=(ImageView)findViewById(R.id.kandidat);
        kandidat.setOnClickListener(this);

        firma=(ImageView)findViewById(R.id.firma);
        firma.setOnClickListener(this);


        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);

   }


    public void onClick(View v) {

        if (v.getId() == kandidat.getId()) {
            startActivity(new Intent(this, registraciq_kandidat.class));
            finish();
        }
        if (v.getId() == firma.getId()) {
            startActivity(new Intent(this, registraciq_firma.class));
            finish();
        }
        if (v.getId() == back.getId()) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }
    public void onBackPressed()
    {
    }
}

