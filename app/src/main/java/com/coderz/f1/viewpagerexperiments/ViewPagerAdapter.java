package com.coderz.f1.viewpagerexperiments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {
    private ArrayList<Fragment> fragments = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, ArrayList<Fragment> fragmentsList) {
        super(fragmentManager, lifecycle);
        this.fragments = fragmentsList;
    }

    public void addFragment(Fragment fragment){
        fragments.add(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
//        if(fragments.get(position)instanceof TextFragment){
//            TextFragment fragment = (TextFragment) fragments.get(position);
//            return TextFragment.newInstance(fragment.title);
//        }
//        if(fragments.get(position) instanceof ImageFragment){
//            ImageFragment fragment = (ImageFragment) fragments.get(position);
//            return ImageFragment.newInstance(fragment.title);
//        }
        return fragments.get(position);
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}