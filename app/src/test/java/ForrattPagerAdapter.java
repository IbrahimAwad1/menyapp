import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.menuapp.ForrattFragment;

public class ForrattPagerAdapter extends FragmentPagerAdapter {
    private String[] forrattNamnLista;
    private String[] forrattBeskrivningLista;

    public ForrattPagerAdapter(FragmentManager fm, String[] forrattNamnLista, String[] forrattBeskrivningLista) {
        super(fm);
        this.forrattNamnLista = forrattNamnLista;
        this.forrattBeskrivningLista = forrattBeskrivningLista;
    }

    @Override
    public Fragment getItem(int position) {
        ForrattFragment fragment = new ForrattFragment();
        Bundle args = new Bundle();
        args.putString("matrattNamn", forrattNamnLista[position]);
        args.putString("matrattBeskrivning", forrattBeskrivningLista[position]);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public int getCount() {
        // Returnera antalet förrätter baserat på längden av listorna
        return forrattNamnLista.length;
    }
}

