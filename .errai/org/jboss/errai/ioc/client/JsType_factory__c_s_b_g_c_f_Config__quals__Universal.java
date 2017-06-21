package org.jboss.errai.ioc.client;

import com.shotechnology.base.gwterraigae.client.firebase.Config;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__c_s_b_g_c_f_Config__quals__Universal extends Factory<Config> { public JsType_factory__c_s_b_g_c_f_Config__quals__Universal() {
    super(new FactoryHandleImpl(Config.class, "JsType_factory__c_s_b_g_c_f_Config__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { Config.class, Object.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public Config createInstance(final ContextManager contextManager) {
    return (Config) WindowInjectionContextStorage.createOrGet().getBean("com.shotechnology.base.gwterraigae.client.firebase.Config");
  }
}