package com.drapoguz.pushr.injection.component;

import com.drapoguz.pushr.injection.module.LocalSourceModule;
import com.drapoguz.pushr.injection.scope.ManagerScope;

import dagger.Component;

@ManagerScope
@Component(dependencies = LocalSourceComponent.class, modules = LocalSourceModule.class)
public interface ManagerComponent {

}
