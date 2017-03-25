package com.drapoguz.pushr.injection.component;

import com.drapoguz.pushr.injection.module.LocalSourceModule;
import com.drapoguz.pushr.injection.scope.LocalSourceScope;

import dagger.Component;

@LocalSourceScope
@Component(dependencies = AppComponent.class, modules = LocalSourceModule.class)
public interface LocalSourceComponent {

}
