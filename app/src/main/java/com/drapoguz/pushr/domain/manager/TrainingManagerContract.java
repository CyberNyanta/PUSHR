package com.drapoguz.pushr.domain.manager;

import com.drapoguz.pushr.data.model.Training;

import java.util.List;

public interface TrainingManagerContract {

    int count();

    List<Training> getAll();

    Training getById(int id);

    void add(final Training training);

    void update(final Training training);

    void delete(final int id);

    void deleteAll();
}
