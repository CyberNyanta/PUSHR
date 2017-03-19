package com.drapoguz.pushr.data.source.local;

import com.drapoguz.pushr.data.model.Training;

import java.util.List;

public interface TrainingLocalSourceContract {

    int count();

    List<Training> getAll();

    Training getById(int id);

    Training getMaxByPushUps();

    Training getMinByPushUps();

    void add(final Training training);

    void update(final Training training);

    void delete(final int id);

    void deleteAll();
}
