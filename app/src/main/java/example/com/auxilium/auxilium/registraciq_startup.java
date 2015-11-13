package example.com.auxilium.auxilium;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;


public class registraciq_startup extends Activity implements View.OnClickListener {
    public ImageView save;
    public ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.registraciq_startup);

        save=(ImageView)findViewById(R.id.save);
        save.setOnClickListener(this);

        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);
    }


    public void onClick(View v) {

        if (v.getId() == save.getId()) {
            Toast.makeText(getApplicationContext(), "Успешно запазихте вашите данни!", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, profill_start.class));
            finish();
        }
        if (v.getId() == back.getId()) {
            startActivity(new Intent(this, profill_start.class));
            finish();

        }
    }

}

