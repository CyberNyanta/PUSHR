package com.drapoguz.pushr.domain.manager;

import com.drapoguz.pushr.data.model.Training;
import com.drapoguz.pushr.data.source.local.TrainingLocalSourceContract;

import java.util.List;

public class TrainingManager implements TrainingManagerContract {

    // Data Members
    private TrainingLocalSourceContract mTrainingLocalSource;


    // Constructors
    public TrainingManager(TrainingLocalSourceContract trainingLocalSource) {

        mTrainingLocalSource = trainingLocalSource;
    }


    // Implementation TrainingManagerContract
    @Override
    public int count() {

        return mTrainingLocalSource.count();
    }

    @Override
    public List<Training> getAll() {

        return mTrainingLocalSource.getAll();
    }

    @Override
    public Training getById(int id) {

        return mTrainingLocalSource.getById(id);
    }

    @Override
    public void add(Training training) {

        mTrainingLocalSource.add(training);
    }

    @Override
    public void update(Training training) {

        mTrainingLocalSource.update(training);
    }

    @Override
    public void delete(int id) {

        mTrainingLocalSource.delete(id);
    }

    @Override
    public void deleteAll() {

        mTrainingLocalSource.deleteAll();
    }
}
