package androidbasicsnd.lloyd.alan.com.udacity.nottinghamtourguide;

public class Tour {

    private int mLocationImageId;
    private String mLocationTitle;
    private String mLocationDescription;

    //constructor to create ArrayAdapter object

    public Tour(String locationTitle, String locationDescription, int locationImageId) {
        mLocationTitle = locationTitle;   //item 'title'
        mLocationDescription = locationDescription;  //detailed text regarding the title
        mLocationImageId = locationImageId;    //drawable resource ID integer for the image associated with the word
    }

    //constructor to create ArrayAdapter object

    public Tour(String locationTitle, String locationDescription) {
        this.mLocationTitle = locationTitle;
        this.mLocationDescription = locationDescription;
    }


    public String getLocationTitle() {
        return mLocationTitle;
    }

    public String getLocationDescription() {
        return mLocationDescription;
    }

    public int getLocationImageId() {
        return mLocationImageId;
    }

}