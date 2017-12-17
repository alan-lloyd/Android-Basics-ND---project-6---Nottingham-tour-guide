package androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

public class ArboretumFragment extends Fragment {

    /**
     * {@link Fragment} that displays a list of arboretum park items.
     */

    public ArboretumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

// Create a list of 2 phrases and 1 image per list item
        final ArrayList<androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour> arboretum = new ArrayList<androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour>();
        arboretum.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.arboretum_1_path), getString(R.string.arboretum_1_path_description), R.drawable.scenic_path));
        arboretum.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.arboretum_2_pond), getString(R.string.arboretum_2_pond_description), R.drawable.pond_birdhouse));
        arboretum.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.arboretum_3_scenic_view), getString(R.string.arboretum_3_scenic_view_description), R.drawable.scenic_view));
        arboretum.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.arboretum_4_bell_tower), getString(R.string.arboretum_4_bell_tower_description), R.drawable.bell_tower));
        arboretum.add(new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour(getString(R.string.arboretum_5_chinese_bell), getString(R.string.arboretum_5_chinese_bell_description), R.drawable.chinese_bell));

        // Create an {@link TourAdapter}, whose data source is a list of  Tour. The
        // adapter knows how to create list items for each item in the list.
        androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.TourAdapter adapter = new androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.TourAdapter(getActivity(), arboretum, R.color.category_going_out);

        // Find the ListView object in the view hierarchy of the Activity.
        // There should be a ListView with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the TourAdapter, so that the
        // ListView will display list items for each Tour in the list.
        listView.setAdapter(adapter);

        // Get the Tour} object at the given position the user clicked on, via OnClickListener

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour tour = arboretum.get(position);
            }

        });
        return rootView;
    }
}
