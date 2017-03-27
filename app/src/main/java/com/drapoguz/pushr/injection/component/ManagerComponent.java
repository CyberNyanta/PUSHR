package com.drapoguz.pushr.injection.component;

import com.drapoguz.pushr.injection.module.LocalSourceModule;
import com.drapoguz.pushr.injection.module.ManagerModule;
import com.drapoguz.pushr.injection.scope.ManagerScope;
import com.drapoguz.pushr.ui.main.MainPresenter;

import dagger.Component;

@ManagerScope
@Component(dependencies = LocalSourceComponent.class, modules = ManagerModule.class)
public interface ManagerComponent {

    void inject(MainPresenter presenter);
}
