package com.drapoguz.pushr.data.model;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class User extends RealmObject {

    // Data Members
    @PrimaryKey
    private int mId;

    private String mUsername;

    private String mFirstName;

    private String mLastName;

    private Date mBirthday;

    private float mHeight;

    private int mWeight;

    private RealmList<Training> mTrainings;


    // Getters and Setters
    public int getId() {

        return mId;
    }

    public void setId(int id) {

        mId = id;
    }

    public String getUsername() {

        return mUsername;
    }

    public void setUsername(String username) {

        mUsername = username;
    }

    public String getFirstName() {

        return mFirstName;
    }

    public void setFirstName(String firstName) {

        mFirstName = firstName;
    }

    public String getLastName() {

        return mLastName;
    }

    public void setLastName(String lastName) {

        mLastName = lastName;
    }

    public Date getBirthday() {

        return mBirthday;
    }

    public void setBirthday(Date birthday) {

        mBirthday = birthday;
    }

    public float getHeight() {

        return mHeight;
    }

    public void setHeight(float height) {

        mHeight = height;
    }

    public int getWeight() {

        return mWeight;
    }

    public void setWeight(int weight) {

        mWeight = weight;
    }

    public RealmList<Training> getTrainings() {

        return mTrainings;
    }

    public void setTrainings(RealmList<Training> trainings) {

        mTrainings = trainings;
    }
}
