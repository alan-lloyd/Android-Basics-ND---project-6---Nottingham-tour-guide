package androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {CategoryAdapter} is a  FragmentPagerAdapter that can provide the layout for
 * each list item based on a data source which is a list of objects
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new  CategoryAdapter object.
     * <p>
     * context is the context of the app
     * fm      is the fragment manager that will keep each fragment's state in the adapter
     * across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the  Fragment that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.GoingOutFragment();
        } else if (position == 1) {
            return new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.CityCentreFragment();
        } else if (position == 2) {
            return new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.ArboretumFragment();
        } else {
            return new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.EmployerFragment();
        }
    }

    /**
     * Return the total number of pages
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.title_going_out);
        } else if (position == 1) {
            return mContext.getString(R.string.title_city_centre);
        } else if (position == 2) {
            return mContext.getString(R.string.title_arboretum);
        } else {
            return mContext.getString(R.string.title_employers);
        }
    }
}