package com.coderz.f1.viewpagerexperiments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.coderz.f1.viewpagerexperiments.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    ViewPagerAdapter adapter;
    ArrayList<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fragments.add(ImageFragment.newInstance("Image1"));
        fragments.add(TextFragment.newInstance("Text1"));
        fragments.add(ImageFragment.newInstance("Image2"));
        adapter = new ViewPagerAdapter(getSupportFragmentManager(),getLifecycle(),fragments);
        binding.viewPager.setAdapter(adapter);
        new TabLayoutMediator(binding.tabLayout, binding.viewPager, (tab, position) -> {
            if(fragments.get(position) instanceof TextFragment){
                TextFragment fragment = (TextFragment)fragments.get(position);
                tab.setText(fragment.title);
            }
            if(fragments.get(position) instanceof ImageFragment){
                ImageFragment fragment = (ImageFragment)fragments.get(position);
                tab.setText(fragment.title);
            }
        }).attach();

        binding.fab.setOnClickListener(view -> {
            fragments.add(ImageFragment.newInstance("Image" + fragments.size()));
            adapter.notifyDataSetChanged();
        });

    }
}