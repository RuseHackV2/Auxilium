package example.com.auxilium.auxilium;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;


public class kandidati_nologin extends Activity implements View.OnClickListener {
    public ImageView ivan_petrov;
    public ImageView georgi_ivanov;
    public ImageView mariq_ivanova;
    public ImageView filter;
    public ImageView back;
    public ImageView undo;
    public RadioButton radioButton;
    public RadioButton radioButton2;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            setContentView(R.layout.kandidati_nologin);

        filter=(ImageView)findViewById(R.id.imageView9);
        filter.setOnClickListener(this);
        ivan_petrov=(ImageView)findViewById(R.id.imageView10);
        ivan_petrov.setOnClickListener(this);
        georgi_ivanov=(ImageView)findViewById(R.id.imageView11);
        mariq_ivanova=(ImageView)findViewById(R.id.imageView12);
        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);

        undo=(ImageView)findViewById(R.id.imageView17);
        undo.setOnClickListener(this);

        radioButton=(RadioButton)findViewById(R.id.radioButton);
        radioButton.setOnClickListener(this);

        radioButton2=(RadioButton)findViewById(R.id.radioButton2);
        radioButton2.setOnClickListener(this);

        radioButton.setVisibility(View.INVISIBLE);
        radioButton2.setVisibility(View.INVISIBLE);


       }


        public void onClick(View v) {
            if(v.getId()==filter.getId())
            {
                radioButton.setVisibility(View.VISIBLE);
                radioButton2.setVisibility(View.VISIBLE);

            }

            if (v.getId() == radioButton.getId()) {
                radioButton.setChecked(true);
                radioButton2.setChecked(false);
                ivan_petrov.setVisibility(View.VISIBLE);
                georgi_ivanov.setVisibility(View.VISIBLE);
                mariq_ivanova.setVisibility(View.INVISIBLE);


            }

            if (v.getId() == radioButton2.getId()) {
                radioButton2.setChecked(true);
                radioButton.setChecked(false);
                ivan_petrov.setVisibility(View.INVISIBLE);
                georgi_ivanov.setVisibility(View.INVISIBLE);
                mariq_ivanova.setVisibility(View.VISIBLE);

            }

            if (v.getId() == ivan_petrov.getId()) {
                startActivity(new Intent(this, registraciq_ivan_nologin.class));
                finish();
            }
            if (v.getId() == back.getId()) {
                startActivity(new Intent(this, MainActivity.class));
                finish();
            }
            if (v.getId() == undo.getId()) {
                radioButton2.setChecked(false);
                radioButton.setChecked(false);
                ivan_petrov.setVisibility(View.VISIBLE);
                georgi_ivanov.setVisibility(View.VISIBLE);
                mariq_ivanova.setVisibility(View.VISIBLE);
            }
        }
        public void onBackPressed()
        {
        }
}

