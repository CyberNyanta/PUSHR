package com.drapoguz.pushr.domain.manager;

import com.drapoguz.pushr.data.model.User;

import java.util.List;

public interface UserManagerContract {

    int count();

    List<User> getAll();

    User getById(int id);

    void add(final User user);

    void update(final User user);

    void delete(final int id);

    void deleteAll();
}
