package adapter;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import fragment.Calculator_14;
import fragment.Overview_14;

public class TablayoutAdapter14 extends FragmentStatePagerAdapter {

int mnooftabs;

    public TablayoutAdapter14(FragmentManager fm, int mnooftabs) {
        super(fm);
        this.mnooftabs = mnooftabs;
    }

    public TablayoutAdapter14(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Overview_14 tab1 = new Overview_14();
                return tab1;
            case 1:
                Calculator_14 tab2 = new Calculator_14();
                return tab2;


            default:
                return null;





        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}


