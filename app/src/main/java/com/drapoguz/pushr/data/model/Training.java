package com.drapoguz.pushr.data.model;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Training extends RealmObject {

    // Data Members
    @PrimaryKey
    private int mId;

    private Date mStartDate;

    private Date mEndDate;

    private int mPushUps;

    private RealmList<Iteration> mIterations;


    // Getters and Setters
    public int getId() {

        return mId;
    }

    public void setId(int id) {

        mId = id;
    }

    public Date getStartDate() {

        return mStartDate;
    }

    public void setStartDate(Date startDate) {

        mStartDate = startDate;
    }

    public Date getEndDate() {

        return mEndDate;
    }

    public void setEndDate(Date endDate) {

        mEndDate = endDate;
    }

    public int getPushUps() {

        return mPushUps;
    }

    public void setPushUps(int pushUps) {

        mPushUps = pushUps;
    }

    public RealmList<Iteration> getIterations() {

        return mIterations;
    }

    public void setIterations(RealmList<Iteration> iterations) {

        mIterations = iterations;
    }
}
