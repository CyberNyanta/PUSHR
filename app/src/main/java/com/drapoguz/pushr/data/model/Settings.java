package com.drapoguz.pushr.data.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Settings extends RealmObject {

    // Data Members
    @PrimaryKey
    private int mId;


    // Getters and Setters
    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }
}
