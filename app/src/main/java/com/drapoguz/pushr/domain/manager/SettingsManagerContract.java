package com.drapoguz.pushr.domain.manager;

import com.drapoguz.pushr.data.model.Settings;

import java.util.List;

public interface SettingsManagerContract {

    int count();

    List<Settings> getAll();

    Settings getById(int id);

    void add(final Settings settings);

    void update(final Settings settings);

    void delete(final int id);

    void deleteAll();
}
