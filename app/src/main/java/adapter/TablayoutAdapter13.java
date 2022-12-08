package adapter;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import fragment.Fund;
import fragment.Overview;
import fragment.Stock;

public class TablayoutAdapter13 extends FragmentStatePagerAdapter {

int mnooftabs;

    public TablayoutAdapter13(FragmentManager fm, int mnooftabs) {
        super(fm);
        this.mnooftabs = mnooftabs;
    }

    public TablayoutAdapter13(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Overview tab1 = new Overview();
                return tab1;
            case 1:
                Stock tab2 = new Stock();
                return tab2;

            case 2:
                Fund tab3 = new Fund();
                return tab3;

            default:
                return null;





        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}


