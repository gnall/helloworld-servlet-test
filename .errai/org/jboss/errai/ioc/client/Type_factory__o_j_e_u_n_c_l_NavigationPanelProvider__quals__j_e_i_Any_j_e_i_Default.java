package org.jboss.errai.ioc.client;

import javax.inject.Provider;
import javax.inject.Singleton;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.nav.client.local.NavigationPanelProvider;

public class Type_factory__o_j_e_u_n_c_l_NavigationPanelProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationPanelProvider> { public Type_factory__o_j_e_u_n_c_l_NavigationPanelProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavigationPanelProvider.class, "Type_factory__o_j_e_u_n_c_l_NavigationPanelProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavigationPanelProvider.class, Object.class, Provider.class });
  }

  public NavigationPanelProvider createInstance(final ContextManager contextManager) {
    final NavigationPanelProvider instance = new NavigationPanelProvider();
    setIncompleteInstance(instance);
    final Navigation NavigationPanelProvider_navigation = (Navigation) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default");
    NavigationPanelProvider_Navigation_navigation(instance, NavigationPanelProvider_navigation);
    setIncompleteInstance(null);
    return instance;
  }

  native static Navigation NavigationPanelProvider_Navigation_navigation(NavigationPanelProvider instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.NavigationPanelProvider::navigation;
  }-*/;

  native static void NavigationPanelProvider_Navigation_navigation(NavigationPanelProvider instance, Navigation value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.NavigationPanelProvider::navigation = value;
  }-*/;
}