package adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import fragment.Fragment_Login;

public class View_Pager_Adapter extends FragmentStatePagerAdapter {
    public View_Pager_Adapter(FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                Fragment_Login tab1 = new Fragment_Login();
                return tab1;
            case 1:
                Fragment_Login tab2 = new Fragment_Login();
                return  tab2;
            case 2:
                Fragment_Login tab3 = new Fragment_Login();
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
