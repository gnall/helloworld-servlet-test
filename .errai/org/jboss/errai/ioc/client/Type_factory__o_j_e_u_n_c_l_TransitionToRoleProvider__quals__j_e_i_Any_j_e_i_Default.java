package org.jboss.errai.ioc.client;

import javax.inject.Singleton;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.nav.client.local.TransitionToRoleProvider;

public class Type_factory__o_j_e_u_n_c_l_TransitionToRoleProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TransitionToRoleProvider> { public Type_factory__o_j_e_u_n_c_l_TransitionToRoleProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(TransitionToRoleProvider.class, "Type_factory__o_j_e_u_n_c_l_TransitionToRoleProvider__quals__j_e_i_Any_j_e_i_Default", Singleton.class, false, null, true));
    handle.setAssignableTypes(new Class[] { TransitionToRoleProvider.class, Object.class, ContextualTypeProvider.class });
  }

  public TransitionToRoleProvider createInstance(final ContextManager contextManager) {
    final TransitionToRoleProvider instance = new TransitionToRoleProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}