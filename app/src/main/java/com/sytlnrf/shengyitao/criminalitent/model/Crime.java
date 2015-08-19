package com.sytlnrf.shengyitao.criminalitent.model;

import java.util.Date;
import java.util.UUID;

/**
 * Created by shengyitao on 8/16/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    public Crime(){
        this.mId = UUID.randomUUID();
        this.mDate = new Date();
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

    public Date getmDate() {
        return this.mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return this.mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }
    @Override
    public String toString(){
        return mTitle;
    }
}
