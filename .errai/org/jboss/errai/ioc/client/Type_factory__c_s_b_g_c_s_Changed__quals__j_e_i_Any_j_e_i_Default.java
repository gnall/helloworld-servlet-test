package org.jboss.errai.ioc.client;

import com.shotechnology.base.gwterraigae.client.stripe.Changed;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__c_s_b_g_c_s_Changed__quals__j_e_i_Any_j_e_i_Default extends Factory<Changed> { public Type_factory__c_s_b_g_c_s_Changed__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(Changed.class, "Type_factory__c_s_b_g_c_s_Changed__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { Changed.class, Object.class });
  }

  public Changed createInstance(final ContextManager contextManager) {
    final Changed instance = new Changed();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}