package example.com.auxilium.auxilium;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;


public class registraciq_kandidat extends Activity implements View.OnClickListener {
    public Spinner spinner;
    public Spinner spinner2;
    public RadioButton radioButton;
    public RadioButton radioButton2;
    public ImageView save;
    public ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.registraciq_kandidat);

        radioButton=(RadioButton)findViewById(R.id.radioButton);
        radioButton.setOnClickListener(this);

        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        radioButton2.setOnClickListener(this);

        save=(ImageView)findViewById(R.id.save);
        save.setOnClickListener(this);

        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);



        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        String[] items = new String[]{"Начално", "Средно", "Висше"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        spinner.setAdapter(adapter);

        Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        String[] items2 = new String[]{"Парализа на долни крайници", "Глухота",};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        spinner2.setAdapter(adapter2);

    }


    public void onClick(View v) {
        if (v.getId() == radioButton.getId()) {
            radioButton.setChecked(true);
            radioButton2.setChecked(false);
        }

        if (v.getId() == radioButton2.getId()) {
            radioButton2.setChecked(true);
            radioButton.setChecked(false);
        }
        if (v.getId() == save.getId()) {
            Toast.makeText(getApplicationContext(), "Успешно запазихте вашите данни!", Toast.LENGTH_LONG).show();

        }
        if (v.getId() == back.getId()) {
            startActivity(new Intent(this, registraciq.class));
            finish();

        }
        }


    }

