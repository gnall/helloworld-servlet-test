package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.nav.client.local.URLPatternMatcherProvider;

public class Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<URLPatternMatcherProvider> { public Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(URLPatternMatcherProvider.class, "Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { URLPatternMatcherProvider.class, Object.class });
  }

  public URLPatternMatcherProvider createInstance(final ContextManager contextManager) {
    final URLPatternMatcherProvider instance = new URLPatternMatcherProvider();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}