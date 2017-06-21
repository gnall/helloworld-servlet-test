package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.nav.client.local.HistoryTokenFactory;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider;

public class Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TransitionAnchorProvider> { public Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TransitionAnchorProvider.class, "Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TransitionAnchorProvider.class, Object.class, ContextualTypeProvider.class });
  }

  public TransitionAnchorProvider createInstance(final ContextManager contextManager) {
    final TransitionAnchorProvider instance = new TransitionAnchorProvider();
    setIncompleteInstance(instance);
    final Navigation TransitionAnchorProvider_navigation = (Navigation) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default");
    TransitionAnchorProvider_Navigation_navigation(instance, TransitionAnchorProvider_navigation);
    final HistoryTokenFactory TransitionAnchorProvider_htFactory = (HistoryTokenFactory) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default");
    TransitionAnchorProvider_HistoryTokenFactory_htFactory(instance, TransitionAnchorProvider_htFactory);
    setIncompleteInstance(null);
    return instance;
  }

  native static HistoryTokenFactory TransitionAnchorProvider_HistoryTokenFactory_htFactory(TransitionAnchorProvider instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider::htFactory;
  }-*/;

  native static void TransitionAnchorProvider_HistoryTokenFactory_htFactory(TransitionAnchorProvider instance, HistoryTokenFactory value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider::htFactory = value;
  }-*/;

  native static Navigation TransitionAnchorProvider_Navigation_navigation(TransitionAnchorProvider instance) /*-{
    return instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider::navigation;
  }-*/;

  native static void TransitionAnchorProvider_Navigation_navigation(TransitionAnchorProvider instance, Navigation value) /*-{
    instance.@org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider::navigation = value;
  }-*/;
}