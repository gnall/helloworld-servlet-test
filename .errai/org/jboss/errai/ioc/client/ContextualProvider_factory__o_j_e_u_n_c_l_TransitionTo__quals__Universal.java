package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.nav.client.local.TransitionTo;

public class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal extends Factory<TransitionTo> { public ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal() {
    super(new FactoryHandleImpl(TransitionTo.class, "ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { TransitionTo.class, Object.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public TransitionTo createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<TransitionTo> provider = (ContextualTypeProvider<TransitionTo>) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_PageTransitionProvider__quals__j_e_i_Any_j_e_i_Default");
    final TransitionTo instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }
}