package com.drapoguz.pushr.data.source.local;

import android.content.Context;

import com.drapoguz.pushr.data.model.User;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class UserLocalSource implements UserLocalSourceContract {

    // Data Members
    private Realm mRealm;


    // Constructors
    public UserLocalSource(Context context) {

        // Setup Realm
        Realm.init(context);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfiguration);
        mRealm = Realm.getDefaultInstance();
    }


    // Implementation UserLocalSourceContract
    @Override
    public int count() {

        int count = mRealm.where(User.class).findAll().size();

        mRealm.close();

        return count;
    }

    @Override
    public List<User> getAll() {

        List<User> all = mRealm.where(User.class).findAll();

        mRealm.close();

        return all;
    }

    @Override
    public User getById(int id) {

        User user = mRealm.where(User.class).equalTo("mId", id).findFirst();

        mRealm.close();

        return user;
    }

    @Override
    public void add(final User user) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                final User newUser = realm.createObject(User.class);

                newUser.setUsername(user.getUsername());
                newUser.setFirstName(user.getFirstName());
                newUser.setLastName(user.getLastName());
                newUser.setBirthday(user.getBirthday());
                newUser.setHeight(user.getHeight());
                newUser.setWeight(user.getWeight());
            }
        });

        mRealm.close();
    }

    @Override
    public void update(final User user) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                final User oldUser = realm.where(User.class).equalTo("mId", user.getId()).findFirst();

                oldUser.setFirstName(user.getFirstName());
                oldUser.setLastName(user.getLastName());
                oldUser.setBirthday(user.getBirthday());
                oldUser.setHeight(user.getHeight());
                oldUser.setWeight(user.getWeight());
            }
        });

        mRealm.close();
    }

    @Override
    public void delete(final int id) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                realm.where(User.class).equalTo("mId", id).findFirst().deleteFromRealm();
            }
        });

        mRealm.close();
    }

    @Override
    public void deleteAll() {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                realm.where(User.class).findAll().deleteAllFromRealm();
            }
        });

        mRealm.close();
    }
}
