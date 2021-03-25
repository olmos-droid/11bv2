package com.example.a11brecyclejsnurl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    public static final String TAG = "TAG";

    TextView name, relationship, interestedIn, country, gender, placeOfBirth, zodiacSign, ethnicity, hairColor, eyeColor, prepucio, hobbies;
    ImageView foto2;
    TextView profileVisits, dot, height, weight;
    CheckBox facialhair, tattoos, piercing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = findViewById(R.id.textViewname2);
        name.setText(getIntent().getStringExtra("Nombre"));

        relationship = findViewById(R.id.textViewRelationship2);
        relationship.setText(getIntent().getStringExtra("Estatus"));

        interestedIn = findViewById(R.id.textViewinterestedIn2);
        interestedIn.setText(getIntent().getStringExtra("interestedIn"));
        country = findViewById(R.id.textViewCountry2);
        country.setText(getIntent().getStringExtra("Ciudad"));
        gender = findViewById(R.id.textViewGender2);
        gender.setText(getIntent().getStringExtra("Sexo"));
        placeOfBirth = findViewById(R.id.textViewplaceOfBirth2);
        placeOfBirth.setText(getIntent().getStringExtra("LugarNacimiento"));

        ethnicity = findViewById(R.id.textViewEthnicity2);
        ethnicity.setText(getIntent().getStringExtra("Etnia"));
        hairColor = findViewById(R.id.textViewHairColor2);
        hairColor.setText(getIntent().getStringExtra("Pelo"));
        eyeColor = findViewById(R.id.textViewEyeColor2);
        eyeColor.setText(getIntent().getStringExtra("Ojos"));
        prepucio = findViewById(R.id.textViewPrepucio2);
        prepucio.setText(getIntent().getStringExtra("Prepucio"));
        hobbies = findViewById(R.id.textViewHobby2);
        hobbies.setText(getIntent().getStringExtra("Intereses"));
        foto2 = findViewById(R.id.imageViewFoto2);
        profileVisits = findViewById(R.id.textViewProfileVisits2);
        profileVisits.setText(String.valueOf(getIntent().getIntExtra("Visitas",0)));

        height = findViewById(R.id.textViewHeight2);
        height.setText(getIntent().getIntExtra("Altura", 0) +"cm");
        weight = findViewById(R.id.textViewWeight2);
        weight.setText(getIntent().getIntExtra("Peso", 0) +"Kg");
        facialhair = findViewById(R.id.checkBoxFacialhair);
        facialhair.setChecked(getIntent().getBooleanExtra("VelloFacial",false));
        tattoos = findViewById(R.id.checkBoxTattoos);
        tattoos.setChecked(getIntent().getBooleanExtra("Tatuajes",false));
        piercing = findViewById(R.id.checkBoxPiercing);
        piercing.setChecked(getIntent().getBooleanExtra("Perforaciones",false));

        String url = getIntent().getStringExtra("foto2");

        Picasso.get().load(url)
                .fit()
                .centerCrop()
                .into(foto2);



    }
}
