package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.nav.client.local.HistoryTokenFactory;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.nav.client.local.TransitionAnchorFactoryProvider;

public class Type_factory__o_j_e_u_n_c_l_TransitionAnchorFactoryProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TransitionAnchorFactoryProvider> { public Type_factory__o_j_e_u_n_c_l_TransitionAnchorFactoryProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TransitionAnchorFactoryProvider.class, "Type_factory__o_j_e_u_n_c_l_TransitionAnchorFactoryProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TransitionAnchorFactoryProvider.class, Object.class, ContextualTypeProvider.class });
  }

  public TransitionAnchorFactoryProvider createInstance(final ContextManager contextManager) {
    final TransitionAnchorFactoryProvider instance = new TransitionAnchorFactoryProvider();
    setIncompleteInstance(instance);
    final HistoryTokenFactory TransitionAnchorFactoryProvider_htFactory = (HistoryTokenFactory) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default");
    TransitionAnchorFactoryProvider_HistoryTokenFactory_htFactory(instance, TransitionAnchorFactoryProvider_htFactory);
    final Navigation TransitionAnchorFactoryProvider_navigation = (Navigation) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default");
    TransitionAnchorFactoryProvider_Navigation_navigation(instance, TransitionAnchorFactoryProvider_navigation);
    setIncompleteInstance(null);
    return instance;
  }

  native static HistoryTokenFactory TransitionAnchorFactoryProvider_HistoryTokenFactory_htFactory(TransitionAnchorFactoryProvider instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorFactoryProvider::htFactory;
  }-*/;

  native static void TransitionAnchorFactoryProvider_HistoryTokenFactory_htFactory(TransitionAnchorFactoryProvider instance, HistoryTokenFactory value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorFactoryProvider::htFactory = value;
  }-*/;

  native static Navigation TransitionAnchorFactoryProvider_Navigation_navigation(TransitionAnchorFactoryProvider instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorFactoryProvider::navigation;
  }-*/;

  native static void TransitionAnchorFactoryProvider_Navigation_navigation(TransitionAnchorFactoryProvider instance, Navigation value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorFactoryProvider::navigation = value;
  }-*/;
}