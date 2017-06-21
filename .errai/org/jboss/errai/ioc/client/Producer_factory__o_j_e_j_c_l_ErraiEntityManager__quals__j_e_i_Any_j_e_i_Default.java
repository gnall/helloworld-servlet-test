package org.jboss.errai.ioc.client;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.jpa.client.local.ErraiEntityManager;
import org.jboss.errai.jpa.client.local.ErraiEntityManagerProducer;

public class Producer_factory__o_j_e_j_c_l_ErraiEntityManager__quals__j_e_i_Any_j_e_i_Default extends Factory<ErraiEntityManager> { public Producer_factory__o_j_e_j_c_l_ErraiEntityManager__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ErraiEntityManager.class, "Producer_factory__o_j_e_j_c_l_ErraiEntityManager__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ErraiEntityManager.class, Object.class, EntityManager.class });
  }

  public ErraiEntityManager createInstance(final ContextManager contextManager) {
    ErraiEntityManagerProducer producerInstance = contextManager.getInstance("Type_factory__o_j_e_j_c_l_ErraiEntityManagerProducer__quals__j_e_i_Any_j_e_i_Default");
    producerInstance = Factory.maybeUnwrapProxy(producerInstance);
    final ErraiEntityManager instance = producerInstance.getEntityManager();
    thisInstance.setReference(instance, "producerInstance", producerInstance);
    return instance;
  }
}