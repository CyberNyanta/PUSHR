package com.drapoguz.pushr.domain.manager;

import com.drapoguz.pushr.data.model.Settings;
import com.drapoguz.pushr.data.source.local.SettingsLocalSourceContract;

import java.util.List;

public class SettingsManager implements SettingsManagerContract {

    // Data Members
    private SettingsLocalSourceContract mSettingsLocalSource;


    // Constructors
    public SettingsManager(SettingsLocalSourceContract settingsLocalSource) {

        mSettingsLocalSource = settingsLocalSource;
    }


    // Implementation SettingsManagerContract
    @Override
    public int count() {

        return mSettingsLocalSource.count();
    }

    @Override
    public List<Settings> getAll() {

        return mSettingsLocalSource.getAll();
    }

    @Override
    public Settings getById(int id) {

        return mSettingsLocalSource.getById(id);
    }

    @Override
    public void add(Settings settings) {

        mSettingsLocalSource.add(settings);
    }

    @Override
    public void update(Settings settings) {

        mSettingsLocalSource.update(settings);
    }

    @Override
    public void delete(int id) {

        mSettingsLocalSource.delete(id);
    }

    @Override
    public void deleteAll() {

        mSettingsLocalSource.deleteAll();
    }
}
