package com.chachaup.ivarsities.models;

import java.util.List;

public class University {
    private String uName;
    private List<String> uDomains;
    private String uAlphaTwoCode;
    private String uCountry;
    private List<String> uWebPages;
    private Object uStateProvince;

    public University(String uName, List<String> uDomains, String uAlphaTwoCode, String uCountry, List<String> uWebPages, Object uStateProvince) {
        this.uName = uName;
        this.uDomains = uDomains;
        this.uAlphaTwoCode = uAlphaTwoCode;
        this.uCountry = uCountry;
        this.uWebPages = uWebPages;
        this.uStateProvince = uStateProvince;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public List<String> getuDomains() {
        return uDomains;
    }

    public void setuDomains(List<String> uDomains) {
        this.uDomains = uDomains;
    }

    public String getuAlphaTwoCode() {
        return uAlphaTwoCode;
    }

    public void setuAlphaTwoCode(String uAlphaTwoCode) {
        this.uAlphaTwoCode = uAlphaTwoCode;
    }

    public String getuCountry() {
        return uCountry;
    }

    public void setuCountry(String uCountry) {
        this.uCountry = uCountry;
    }

    public List<String> getuWebPages() {
        return uWebPages;
    }

    public void setuWebPages(List<String> uWebPages) {
        this.uWebPages = uWebPages;
    }

    public Object getuStateProvince() {
        return uStateProvince;
    }

    public void setuStateProvince(Object uStateProvince) {
        this.uStateProvince = uStateProvince;
    }
}
