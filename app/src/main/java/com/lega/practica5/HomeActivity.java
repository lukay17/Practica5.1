package com.lega.practica5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.lega.practica5.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private int REQUEST_CODE_OBJECT_ACTIVITY=100;
    private String welcome = "";
    private String name = "";
    private String surname = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setTitle("Home");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.home);

        loadComponents();

        if(getIntent().getExtras() != null){
            name = getIntent().getExtras().getString("name", "No hay Nombre");
            surname = getIntent().getExtras().getString("surname", "No hay Apellido");
            Log.e("lega",name);
            Log.e("lega",surname);
            welcome = "Hi, " + name + " " + surname;
            binding.AHUser.setText(welcome);
        }
    }

    private void loadComponents() {
        binding.AHTitle.setText(R.string.home_title);

        binding.AHCardImage.setImageResource(R.drawable.calendar);

        binding.AHCardTitle1.setText(R.string.title1);

        binding.AHCardSubtitle1.setText(R.string.subtitle1);

        binding.AHCardImage2.setImageResource(R.drawable.tree);

        binding.AHCardTitle2.setText(R.string.title2);

        binding.AHCardSubtitle2.setText(R.string.subtitle2);
    }

}