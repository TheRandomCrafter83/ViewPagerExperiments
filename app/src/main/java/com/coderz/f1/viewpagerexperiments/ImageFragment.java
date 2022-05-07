package com.coderz.f1.viewpagerexperiments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.coderz.f1.viewpagerexperiments.databinding.ImageFragmentBinding;

public class ImageFragment extends Fragment {
    ImageFragmentBinding binding;

    public String title = "ImageFragment";

    public ImageFragment() {
        // Required empty public constructor
    }

    public static ImageFragment newInstance(String title) {
        ImageFragment fragment = new ImageFragment();
        fragment.title = title;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = ImageFragmentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}