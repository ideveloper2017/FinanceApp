package adapter;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import fragment.Viewpager2;

public class View_Pager_Adapter_charity_2 extends FragmentStatePagerAdapter {
    public View_Pager_Adapter_charity_2(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                Viewpager2 tab1 = new Viewpager2();
                return tab1;
            case 1:
                Viewpager2 tab2 = new Viewpager2();
                return  tab2;
            case 2:
                Viewpager2 tab3 = new Viewpager2();
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
