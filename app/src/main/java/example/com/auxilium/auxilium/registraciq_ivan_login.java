package example.com.auxilium.auxilium;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;


public class registraciq_ivan_login extends Activity implements View.OnClickListener {
    public EditText potrebitel;
    public EditText EditText1;
    public EditText mesec;
    public EditText den;
    public EditText godini;
    public EditText editText5;
    public EditText editText7;
    public EditText editText8;
    public ImageView back;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.registraciq_ivan_login);

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

        editText7=(EditText)findViewById(R.id.editText7);
        editText7.setKeyListener(null);
        editText7.setEnabled(false);

        editText8=(EditText)findViewById(R.id.editText8);
        editText8.setKeyListener(null);
        editText8.setEnabled(false);

        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);



    }


    public void onClick(View v) {
        if (v.getId() == back.getId()) {
            startActivity(new Intent(this, kandidati_login.class));
            finish();

        }

    }

}

