package androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of going out array list items.
 */
public class GoingOutFragment extends Fragment {


    public GoingOutFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

// Create a list of tours, comprising 2 phrases each
        final ArrayList<androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour> tours = new ArrayList<androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour>();
        tours.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.going_out_at_night), getString(R.string.going_out_in_lace_market)));
        tours.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.going_out_anoki_restaurant), getString(R.string.going_out_anoki_restaurant_address)));
        tours.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.going_out_mandarin_restaurant), getString(R.string.going_out_mandarin_restaurant_address)));
        tours.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.going_out_theatre_royal), getString(R.string.going_out_theatre_royal_address)));
        tours.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.going_out_top_chef), getString(R.string.going_out_top_chef_address)));
        tours.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.going_out_broadway_cinema), getString(R.string.going_out_broadway_cinema_address)));


        // Create an  TourAdapter, whose data source is a list of Tours. The
        // adapter knows how to create list items for each item in the list.
        androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.TourAdapter adapter = new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.TourAdapter(getActivity(), tours, R.color.category_going_out);

        // Find the  ListView object in the view hierarchy of the Activity.
        // There should be a  ListView with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the TourAdapter, so that the
        //  ListView will display list items for each  Tour in the list.
        listView.setAdapter(adapter);


        // Get the {@link Tour} object at the given position the user clicked on using an OnClickListener


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour tour = tours.get(position);
            }

        });
        return rootView;
    }
}



