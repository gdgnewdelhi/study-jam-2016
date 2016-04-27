package com.dawbrack.map;



public class LocationInfo {

    int HOUR_OF_THE_DAY;
    int MINUTE;
    String DATE;
    Double Latitude;
    Double Longitude;
    String Location_Name;

    // SETTERS AND GETTERS
    public String getLocation_Name() {
        return Location_Name;
    }

    public void setLocation_Name(String location_Name) {
        Location_Name = location_Name;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public int getHOUR_OF_THE_DAY() {
        return HOUR_OF_THE_DAY;
    }

    public void setHOUR_OF_THE_DAY(int HOUR_OF_THE_DAY) {
        this.HOUR_OF_THE_DAY = HOUR_OF_THE_DAY;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double longitude) {
        Longitude = longitude;
    }

    public int getMINUTE() {
        return MINUTE;
    }

    public void setMINUTE(int MINUTE) {
        this.MINUTE = MINUTE;
    }
}
