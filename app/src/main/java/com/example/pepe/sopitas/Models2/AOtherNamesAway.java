
package com.example.pepe.sopitas.Models2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AOtherNamesAway {

    @SerializedName("zh")
    @Expose
    private String zh;
    @SerializedName("ar")
    @Expose
    private String ar;

    /**
     * 
     * @return
     *     The zh
     */
    public String getZh() {
        return zh;
    }

    /**
     * 
     * @param zh
     *     The zh
     */
    public void setZh(String zh) {
        this.zh = zh;
    }

    /**
     * 
     * @return
     *     The ar
     */
    public String getAr() {
        return ar;
    }

    /**
     * 
     * @param ar
     *     The ar
     */
    public void setAr(String ar) {
        this.ar = ar;
    }

}
