package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.foodorder.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        int image= getIntent().getIntExtra("image",0);
        int price= Integer.parseInt(getIntent().getStringExtra("price"));
        String name=getIntent().getStringExtra("name");
        String description=getIntent().getStringExtra("desc");

        binding.detailImageId.setImageResource(image);
        binding.priceLevel.setText(String.format("%d",price));
        binding.nameBoxID.setText(name);
        binding.detailDescriptionID.setText(description);
    }
}