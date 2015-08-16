package com.sytlnrf.shengyitao.criminalitent.model;

import java.util.UUID;

/**
 * Created by shengyitao on 8/16/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime(){
        this.mId = UUID.randomUUID();
    }

    public UUID getmId() {
        return this.mId;
    }

    public String getmTitle() {
        return this.mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
