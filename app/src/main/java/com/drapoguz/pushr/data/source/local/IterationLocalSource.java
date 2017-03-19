package com.drapoguz.pushr.data.source.local;

import android.content.Context;

import com.drapoguz.pushr.data.model.Iteration;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.Sort;

public class IterationLocalSource implements IterationLocalSourceContract {

    // Data Members
    private Realm mRealm;


    // Constructors
    public IterationLocalSource(Context context) {

        // Setup Realm
        Realm.init(context);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfiguration);
        mRealm = Realm.getDefaultInstance();
    }


    // Implementation IterationLocalSourceContract
    @Override
    public int count() {

        int count = mRealm.where(Iteration.class).findAll().size();

        mRealm.close();

        return count;
    }

    @Override
    public List<Iteration> getAll() {

        List<Iteration> all = mRealm.where(Iteration.class).findAll();

        mRealm.close();

        return all;
    }

    @Override
    public Iteration getById(int id) {

        Iteration iteration = mRealm.where(Iteration.class).equalTo("mId", id).findFirst();

        mRealm.close();

        return iteration;
    }

    @Override
    public Iteration getMaxByPushUps() {

        Iteration iteration = mRealm.where(Iteration.class).findAll().sort("mPushUps", Sort.DESCENDING).first();

        mRealm.close();

        return iteration;
    }

    @Override
    public Iteration getMinByPushUps() {

        Iteration iteration = mRealm.where(Iteration.class).findAll().sort("mPushUps").first();

        mRealm.close();

        return iteration;
    }

    @Override
    public void add(final Iteration iteration) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                final Iteration newIteration = realm.createObject(Iteration.class);

                newIteration.setStartDate(iteration.getStartDate());
                newIteration.setEndDate(iteration.getEndDate());
                newIteration.setPushUps(iteration.getPushUps());
            }
        });

        mRealm.close();
    }

    @Override
    public void update(final Iteration iteration) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                final Iteration oldIteration = realm.where(Iteration.class).equalTo("mId", iteration.getId()).findFirst();

                oldIteration.setStartDate(iteration.getStartDate());
                oldIteration.setEndDate(iteration.getEndDate());
                oldIteration.setPushUps(iteration.getPushUps());
            }
        });

        mRealm.close();
    }

    @Override
    public void delete(final int id) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                realm.where(Iteration.class).equalTo("mId", id).findFirst().deleteFromRealm();
            }
        });

        mRealm.close();
    }

    @Override
    public void deleteAll() {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                realm.where(Iteration.class).findAll().deleteAllFromRealm();
            }
        });

        mRealm.close();
    }
}
