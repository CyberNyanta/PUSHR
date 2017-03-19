package com.drapoguz.pushr.data.source.local;

import android.content.Context;

import com.drapoguz.pushr.data.model.Training;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.Sort;

public class TrainingLocalSource implements TrainingLocalSourceContract {

    // Data Members
    private Realm mRealm;


    // Constructors
    public TrainingLocalSource(Context context) {

        // Setup Realm
        Realm.init(context);
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfiguration);
        mRealm = Realm.getDefaultInstance();
    }


    // Implementation TrainingLocalSourceContract
    @Override
    public int count() {

        int count = mRealm.where(Training.class).findAll().size();

        mRealm.close();

        return count;
    }

    @Override
    public List<Training> getAll() {

        List<Training> all = mRealm.where(Training.class).findAll();

        mRealm.close();

        return all;
    }

    @Override
    public Training getById(int id) {

        Training training = mRealm.where(Training.class).equalTo("mId", id).findFirst();

        mRealm.close();

        return training;
    }

    @Override
    public Training getMaxByPushUps() {

        Training training = mRealm.where(Training.class).findAll().sort("mPushUps", Sort.DESCENDING).first();

        mRealm.close();

        return training;
    }

    @Override
    public Training getMinByPushUps() {

        Training training = mRealm.where(Training.class).findAll().sort("mPushUps").first();

        mRealm.close();

        return training;
    }

    @Override
    public void add(final Training training) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                final Training newTraining = realm.createObject(Training.class);

                newTraining.setStartDate(training.getStartDate());
                newTraining.setEndDate(training.getEndDate());
                newTraining.setPushUps(training.getPushUps());
            }
        });

        mRealm.close();
    }

    @Override
    public void update(final Training training) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                final Training oldTraining = realm.where(Training.class).equalTo("mId", training.getId()).findFirst();

                oldTraining.setStartDate(training.getStartDate());
                oldTraining.setEndDate(training.getEndDate());
                oldTraining.setPushUps(training.getPushUps());
            }
        });

        mRealm.close();
    }

    @Override
    public void delete(final int id) {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                realm.where(Training.class).equalTo("mId", id).findFirst().deleteFromRealm();
            }
        });

        mRealm.close();
    }

    @Override
    public void deleteAll() {

        mRealm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                realm.where(Training.class).findAll().deleteAllFromRealm();
            }
        });

        mRealm.close();
    }
}
