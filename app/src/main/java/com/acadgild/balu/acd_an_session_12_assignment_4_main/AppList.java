package com.acadgild.balu.acd_an_session_12_assignment_4_main;

/**
 * Created by BALU on 6/15/2016.
 */
public class AppList
{
    private String title;
    private int logo;

    public AppList(String title, int logo) {
        this.title = title;
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
