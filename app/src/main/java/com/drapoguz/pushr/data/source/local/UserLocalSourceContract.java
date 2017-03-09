package com.drapoguz.pushr.data.source.local;

import com.drapoguz.pushr.data.model.User;

import java.util.List;

public interface UserLocalSourceContract {

    int count();

    List<User> getAll();

    User getById(int id);

    void add(final User user);

    void update(final User user);

    void delete(final int id);

    void deleteAll();
}
