
package com.chachaup.ivarsities.models;

import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class UniversitiesListResponse implements Parcelable
{

    @SerializedName("domains")
    @Expose
    private List<String> domains = null;
    @SerializedName("alpha_two_code")
    @Expose
    private String alphaTwoCode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("web_pages")
    @Expose
    private List<String> webPages = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("state-province")
    @Expose
    private Object stateProvince;
    public final static Creator<UniversitiesListResponse> CREATOR = new Creator<UniversitiesListResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public UniversitiesListResponse createFromParcel(android.os.Parcel in) {
            return new UniversitiesListResponse(in);
        }

        public UniversitiesListResponse[] newArray(int size) {
            return (new UniversitiesListResponse[size]);
        }

    }
    ;

    protected UniversitiesListResponse(android.os.Parcel in) {
        in.readList(this.domains, (String.class.getClassLoader()));
        this.alphaTwoCode = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.webPages, (String.class.getClassLoader()));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.stateProvince = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public UniversitiesListResponse() {
    }

    /**
     * 
     * @param country
     * @param webPages
     * @param name
     * @param domains
     * @param stateProvince
     * @param alphaTwoCode
     */
    public UniversitiesListResponse(List<String> domains, String alphaTwoCode, String country, List<String> webPages, String name, Object stateProvince) {
        super();
        this.domains = domains;
        this.alphaTwoCode = alphaTwoCode;
        this.country = country;
        this.webPages = webPages;
        this.name = name;
        this.stateProvince = stateProvince;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    public void setAlphaTwoCode(String alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getWebPages() {
        return webPages;
    }

    public void setWebPages(List<String> webPages) {
        this.webPages = webPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(Object stateProvince) {
        this.stateProvince = stateProvince;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeList(domains);
        dest.writeValue(alphaTwoCode);
        dest.writeValue(country);
        dest.writeList(webPages);
        dest.writeValue(name);
        dest.writeValue(stateProvince);
    }

    public int describeContents() {
        return  0;
    }

}
