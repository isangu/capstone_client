package com.example.inhacsecapstone.calendars;

public class ListViewItem {
    private String titleStr ;
    private String descStr ;

    ListViewItem() {
    }


    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setDesc(String desc) {
        descStr = desc ;
    }

    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc() {
        return this.descStr ;
    }
}