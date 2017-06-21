package org.jboss.errai.ioc.client;

import com.shotechnology.base.gwterraigae.client.stripe.Changed;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class JsType_factory__c_s_b_g_c_s_Changed__quals__Universal extends Factory<Changed> { public JsType_factory__c_s_b_g_c_s_Changed__quals__Universal() {
    super(new FactoryHandleImpl(Changed.class, "JsType_factory__c_s_b_g_c_s_Changed__quals__Universal", Dependent.class, false, null, false));
    handle.setAssignableTypes(new Class[] { Changed.class, Object.class });
    handle.setQualifiers(new Annotation[] { });
  }

  public Changed createInstance(final ContextManager contextManager) {
    return (Changed) WindowInjectionContextStorage.createOrGet().getBean("com.shotechnology.base.gwterraigae.client.stripe.Changed");
  }
}