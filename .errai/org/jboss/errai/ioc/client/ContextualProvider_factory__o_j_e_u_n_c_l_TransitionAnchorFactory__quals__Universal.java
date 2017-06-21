package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.api.ContextualTypeProvider;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.nav.client.local.TransitionAnchorFactory;

public class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchorFactory__quals__Universal extends Factory<TransitionAnchorFactory> { public ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchorFactory__quals__Universal() {
    super(new FactoryHandleImpl(TransitionAnchorFactory.class, "ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchorFactory__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { TransitionAnchorFactory.class, Object.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public TransitionAnchorFactory createContextualInstance(final ContextManager contextManager, final Class[] typeArgs, final Annotation[] qualifiers) {
    final ContextualTypeProvider<TransitionAnchorFactory> provider = (ContextualTypeProvider<TransitionAnchorFactory>) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_TransitionAnchorFactoryProvider__quals__j_e_i_Any_j_e_i_Default");
    final TransitionAnchorFactory instance = provider.provide(typeArgs, qualifiers);
    return instance;
  }
}