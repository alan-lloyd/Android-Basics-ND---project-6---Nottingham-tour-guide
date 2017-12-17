package androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class EmployerFragment extends Fragment {

    /**
     * {@link Fragment} that displays a list of employer list items.
     */

    public EmployerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

// Create a list of phrases (2 per list item)
        final ArrayList<androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour> employers = new ArrayList<androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour>();
        employers.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.employers_title), getString(R.string.employers_descriptive_text)));
        employers.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.employers_boots_uk), getString(R.string.employers_boots_uk_address)));
        employers.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.employers_dvsa), getString(R.string.employers_dvsa_address)));
        employers.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.employers_siemens_uk), getString(R.string.employers_siemens_uk_address)));
        employers.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.employers_pendragon), getString(R.string.employers_pendragon_address)));
        employers.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.employers_capital_one), getString(R.string.employers_capital_one_address)));


        // Create an TourAdapter, whose data source is a list of Tours. The
        // adapter knows how to create list items for each item in the list.
        androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.TourAdapter adapter = new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.TourAdapter(getActivity(), employers, R.color.category_going_out);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the  ListView use the TourAdapter, so that the
        //  ListView will display list items for each Tour in the list.
        listView.setAdapter(adapter);

        // Get the Tour object at the given position the user clicked on, using an OnClickListener

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour tour = employers.get(position);
            }

        });
        return rootView;
    }
}
