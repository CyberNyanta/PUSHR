package com.drapoguz.pushr.data.source.local;

import com.drapoguz.pushr.data.model.Iteration;

import java.util.List;

public interface IterationLocalSourceContract {

    int count();

    List<Iteration> getAll();

    Iteration getById(int id);

    void add(final Iteration iteration);

    void update(final Iteration iteration);

    void delete(final int id);

    void deleteAll();
}
