package androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class CityCentreFragment extends Fragment {

    /**
     * Fragment that displays a list of city centre items.
     */

    public CityCentreFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

// Create a list of phrases (2 per item), and images (1 per item)
        final ArrayList<androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour> cityCentre = new ArrayList<androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour>();
        cityCentre.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.city_centre_lace_market_1), getString(R.string.city_centre_lace_market_1_description), R.drawable.lm_renewed1));
        cityCentre.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.city_centre_lace_market_2), getString(R.string.city_centre_lace_market_2_description), R.drawable.lm_renewed2));
        cityCentre.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.city_centre_lace_market_3), getString(R.string.city_centre_lace_market_3_description), R.drawable.lm_renewed3));
        cityCentre.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.city_centre_lace_market_ristes_place_4), getString(R.string.city_centre_lace_market_ristes_place_4_description), R.drawable.lm_renewed_ristesplc_anoki));
        cityCentre.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.city_centre_lace_market_shops), getString(R.string.city_centre_lace_market_shops_description), R.drawable.lm_lively_shops_restrs));
        cityCentre.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.city_centre_market_square), getString(R.string.city_centre_market_square_description), R.drawable.market_square));
        cityCentre.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.city_centre_theatre_royal), getString(R.string.city_centre_theatre_royal_description), R.drawable.theatre_royal));


        // Create an {@link TourAdapter}, whose data source is a list of Tours. The
        // adapter knows how to create list items for each item in the list.
        androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.TourAdapter adapter = new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.TourAdapter(getActivity(), cityCentre, R.color.category_going_out);

        // Find the ListView object in the view hierarchy of the  Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the TourAdapter, so that the
        // ListView will display list items for each  Tour in the list.
        listView.setAdapter(adapter);

        // Get the Tour object at the given position the user clicked on, using OnClickListener

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour tour = cityCentre.get(position);
            }
        });
        return rootView;
    }
}