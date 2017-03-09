package com.drapoguz.pushr.data.source.local;

import android.content.Context;

import com.drapoguz.pushr.data.model.Settings;

import java.util.List;
import java.util.Set;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class SettingsLocalSource implements SettingsLocalSourceContract {

    // Data Members
    private Realm mRealm;


    // Constructors
    public SettingsLocalSource(Context context) {

        // Setup Realm
        Realm.init(context);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfiguration);
        mRealm = Realm.getDefaultInstance();
    }


    // Implementation SettingsLocalSourceContract
    @Override
    public int count() {

        int count = mRealm.where(Settings.class).findAll().size();

        mRealm.close();

        return count;
    }

    @Override
    public List<Settings> getAll() {

        List<Settings> all = mRealm.where(Settings.class).findAll();

        mRealm.close();

        return all;
    }

    @Override
    public Settings getById(int id) {

        Settings settings = mRealm.where(Settings.class).equalTo("mId", id).findFirst();

        mRealm.close();

        return settings;
    }

    @Override
    public void add(Settings settings) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

            }
        });

        mRealm.close();
    }

    @Override
    public void update(Settings settings) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

            }
        });

        mRealm.close();
    }

    @Override
    public void delete(final int id) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                realm.where(Settings.class).equalTo("mId", id).findFirst().deleteFromRealm();
            }
        });

        mRealm.close();
    }

    @Override
    public void deleteAll() {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                realm.where(Settings.class).findAll().deleteAllFromRealm();
            }
        });

        mRealm.close();
    }
}
