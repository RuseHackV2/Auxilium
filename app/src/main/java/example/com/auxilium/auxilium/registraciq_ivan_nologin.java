package example.com.auxilium.auxilium;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;


public class registraciq_ivan_nologin extends Activity implements View.OnClickListener {
    public EditText potrebitel;
    public EditText EditText1;
    public EditText mesec;
    public EditText den;
    public EditText godini;
    public EditText editText5;
    public ImageView back;
    public ImageView user_plus;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.registraciq_ivan_nologin);

        potrebitel=(EditText)findViewById(R.id.potrebitel);
        potrebitel.setKeyListener(null);
        potrebitel.setEnabled(false);

        EditText1=(EditText)findViewById(R.id.editText1);
        EditText1.setKeyListener(null);
        EditText1.setEnabled(false);

        mesec=(EditText)findViewById(R.id.mesec);
        mesec.setKeyListener(null);
        mesec.setEnabled(false);

        den=(EditText)findViewById(R.id.den);
        den.setKeyListener(null);
        den.setEnabled(false);

        godini=(EditText)findViewById(R.id.godini);
        godini.setKeyListener(null);
        godini.setEnabled(false);

        editText5=(EditText)findViewById(R.id.editText5);
        editText5.setKeyListener(null);
        editText5.setEnabled(false);

        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);

        user_plus=(ImageView)findViewById(R.id.user_plus);
        user_plus.setOnClickListener(this);



    }


    public void onClick(View v) {
        if (v.getId() == back.getId()) {
            startActivity(new Intent(this, kandidati_nologin.class));
            finish();

        }
        if (v.getId() == user_plus.getId()) {
            startActivity(new Intent(this, registraciq.class));
            finish();

        }

    }

}

