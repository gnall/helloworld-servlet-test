package org.jboss.errai.ioc.client;

import com.shotechnology.base.gwterraigae.client.firebase.Config;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__c_s_b_g_c_f_Config__quals__j_e_i_Any_j_e_i_Default extends Factory<Config> { public Type_factory__c_s_b_g_c_f_Config__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(Config.class, "Type_factory__c_s_b_g_c_f_Config__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { Config.class, Object.class });
  }

  public Config createInstance(final ContextManager contextManager) {
    final Config instance = new Config();
    setIncompleteInstance(instance);
    setIncompleteInstance(null);
    return instance;
  }
}