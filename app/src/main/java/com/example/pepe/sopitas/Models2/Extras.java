
package com.example.pepe.sopitas.Models2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Extras {

    @SerializedName("Venue")
    @Expose
    private String venue;
    @SerializedName("Attendance")
    @Expose
    private String attendance;

    /**
     * 
     * @return
     *     The venue
     */
    public String getVenue() {
        return venue;
    }

    /**
     * 
     * @param venue
     *     The Venue
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     * 
     * @return
     *     The attendance
     */
    public String getAttendance() {
        return attendance;
    }

    /**
     * 
     * @param attendance
     *     The Attendance
     */
    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

}
