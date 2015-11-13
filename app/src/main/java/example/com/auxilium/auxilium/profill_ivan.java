package example.com.auxilium.auxilium;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;


public class profill_ivan extends Activity implements View.OnClickListener {
    public ImageView lichni_danni;
    public ImageView logout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.profil_ivan);


        lichni_danni=(ImageView)findViewById(R.id.lichni_danni);
        lichni_danni.setOnClickListener(this);


        logout=(ImageView)findViewById(R.id.logout);
        logout.setOnClickListener(this);

   }


    public void onClick(View v) {


        if (v.getId() == lichni_danni.getId()) {
            startActivity(new Intent(this, registraciq_ivan.class));
            finish();
        }
        if (v.getId() == logout.getId()) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }

}

