
package com.example.pepe.sopitas.Models2;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllowedCountries {

    @SerializedName("option")
    @Expose
    private String option;
    @SerializedName("codes")
    @Expose
    private List<String> codes = new ArrayList<String>();

    /**
     * 
     * @return
     *     The option
     */
    public String getOption() {
        return option;
    }

    /**
     * 
     * @param option
     *     The option
     */
    public void setOption(String option) {
        this.option = option;
    }

    /**
     * 
     * @return
     *     The codes
     */
    public List<String> getCodes() {
        return codes;
    }

    /**
     * 
     * @param codes
     *     The codes
     */
    public void setCodes(List<String> codes) {
        this.codes = codes;
    }

}
