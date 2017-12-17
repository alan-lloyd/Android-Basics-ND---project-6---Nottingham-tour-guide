package androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour> {

    private int mColorResourceId;

    public TourAdapter(Activity context, ArrayList<androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour> tours, int colorResourceId) {
        super(context, 0, tours);
        mColorResourceId = colorResourceId;
    }

    @Override  // method is to get a list item view, and return it to the list view
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the object located at this position in the list
        androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide.Tour currentTour = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView locationTitleTextView = (TextView) listItemView.findViewById(R.id.location_title_text_view);
        // Get the version name from the current object and
        // set this text on the locationTitleTextView
        locationTitleTextView.setText(currentTour.getLocationTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.location_description_text_view);
        // Get the version number from the current object and
        // set this text on the number TextView
        defaultTextView.setText(currentTour.getLocationDescription());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image resource ID from the current object and
        // set the image to iconView
        iconView.setImageResource(currentTour.getLocationImageId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
