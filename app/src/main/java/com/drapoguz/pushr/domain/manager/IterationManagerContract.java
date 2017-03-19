package com.drapoguz.pushr.domain.manager;

import com.drapoguz.pushr.data.model.Iteration;

import java.util.List;

public interface IterationManagerContract {

    int count();

    List<Iteration> getAll();

    Iteration getById(int id);

    Iteration getMaxByPushUps();

    Iteration getMinByPushUps();

    void add(Iteration iteration);

    void update(Iteration iteration);

    void delete(int id);

    void deleteAll();
}
