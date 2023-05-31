package ru.mirea.korolev.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.mirea.korolev.lesson8.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}