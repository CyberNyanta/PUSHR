package com.drapoguz.pushr.domain.manager;

import com.drapoguz.pushr.data.model.User;
import com.drapoguz.pushr.data.source.local.UserLocalSourceContract;

import java.util.List;

public class UserManager implements UserManagerContract {

    // Data Members
    private UserLocalSourceContract mUserLocalSource;


    // Constructors
    public UserManager(UserLocalSourceContract userLocalSource) {

        mUserLocalSource = userLocalSource;
    }


    // Implementation UserManagerContract
    @Override
    public int count() {

        return mUserLocalSource.count();
    }

    @Override
    public List<User> getAll() {

        return mUserLocalSource.getAll();
    }

    @Override
    public User getById(int id) {

        return mUserLocalSource.getById(id);
    }

    @Override
    public void add(User user) {

        mUserLocalSource.add(user);
    }

    @Override
    public void update(User user) {

        mUserLocalSource.update(user);
    }

    @Override
    public void delete(int id) {

        mUserLocalSource.delete(id);
    }

    @Override
    public void deleteAll() {

        mUserLocalSource.deleteAll();
    }
}
