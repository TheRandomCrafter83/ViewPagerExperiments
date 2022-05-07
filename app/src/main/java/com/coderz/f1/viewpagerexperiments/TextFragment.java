package com.coderz.f1.viewpagerexperiments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.coderz.f1.viewpagerexperiments.databinding.TextFragmentBinding;

public class TextFragment extends Fragment {
    TextFragmentBinding binding;
    public String title = "TextFragment";


    public TextFragment() {
        // Required empty public constructor
    }

    public static TextFragment newInstance(String title) {
        TextFragment fragment = new TextFragment();
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
        binding = TextFragmentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}