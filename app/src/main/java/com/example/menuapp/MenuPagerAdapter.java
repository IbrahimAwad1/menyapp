package com.example.menuapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

    public class MenuPagerAdapter extends FragmentPagerAdapter {

        public MenuPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int arg0) {
            // TODO Auto-generated method stub
            switch (arg0) {
                case 0:
                    return new ForrattFragment();
                case 1:
                    return new HuvudrattFragment();
                case 2:
                    return new EfterrattFragment();
                default:
                    break;
            }
            return null;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return 3;
        }
    }
