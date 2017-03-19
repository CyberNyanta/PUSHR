package com.drapoguz.pushr.domain.manager;

import com.drapoguz.pushr.data.model.Iteration;
import com.drapoguz.pushr.data.source.local.IterationLocalSourceContract;

import java.util.List;

public class IterationManager implements IterationManagerContract {

    // Data Members
    private IterationLocalSourceContract mIterationLocalSource;


    // Constructors
    public IterationManager(IterationLocalSourceContract iterationLocalSource) {

        mIterationLocalSource = iterationLocalSource;
    }


    // Implementation IterationManagerContract
    @Override
    public int count() {

        return mIterationLocalSource.count();
    }

    @Override
    public List<Iteration> getAll() {

        return mIterationLocalSource.getAll();
    }

    @Override
    public Iteration getById(int id) {

        return mIterationLocalSource.getById(id);
    }

    @Override
    public Iteration getMaxByPushUps() {

        return mIterationLocalSource.getMaxByPushUps();
    }

    @Override
    public Iteration getMinByPushUps() {

        return mIterationLocalSource.getMinByPushUps();
    }

    @Override
    public void add(Iteration iteration) {

        mIterationLocalSource.add(iteration);
    }

    @Override
    public void update(Iteration iteration) {

        mIterationLocalSource.update(iteration);
    }

    @Override
    public void delete(int id) {

        mIterationLocalSource.delete(id);
    }

    @Override
    public void deleteAll() {

        mIterationLocalSource.deleteAll();
    }
}
