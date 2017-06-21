package org.jboss.errai.ioc.client;

import java.lang.annotation.Annotation;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.jpa.client.local.ErraiEntityManager;
import org.jboss.errai.jpa.sync.client.local.ClientSyncManager;
import org.jboss.errai.jpa.sync.client.shared.DataSyncService;

public class Type_factory__o_j_e_j_s_c_l_ClientSyncManager__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientSyncManager> { public Type_factory__o_j_e_j_s_c_l_ClientSyncManager__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ClientSyncManager.class, "Type_factory__o_j_e_j_s_c_l_ClientSyncManager__quals__j_e_i_Any_j_e_i_Default", EntryPoint.class, true, null, true));
    handle.setAssignableTypes(new Class[] { ClientSyncManager.class, Object.class });
  }

  public ClientSyncManager createInstance(final ContextManager contextManager) {
    final ClientSyncManager instance = new ClientSyncManager();
    setIncompleteInstance(instance);
    final ErraiEntityManager ClientSyncManager_desiredStateEm = (ErraiEntityManager) contextManager.getInstance("Producer_factory__o_j_e_j_c_l_ErraiEntityManager__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, ClientSyncManager_desiredStateEm);
    ClientSyncManager_ErraiEntityManager_desiredStateEm(instance, ClientSyncManager_desiredStateEm);
    final Caller ClientSyncManager_dataSyncService = (Caller) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal", new Class[] { DataSyncService.class }, new Annotation[] { });
    registerDependentScopedReference(instance, ClientSyncManager_dataSyncService);
    instance.dataSyncService = ClientSyncManager_dataSyncService;
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final ClientSyncManager instance) {
    ClientSyncManager_setup(instance);
  }

  native static ErraiEntityManager ClientSyncManager_ErraiEntityManager_desiredStateEm(ClientSyncManager instance) /*-{
    return instance.@org.jboss.errai.jpa.sync.client.local.ClientSyncManager::desiredStateEm;
  }-*/;

  native static void ClientSyncManager_ErraiEntityManager_desiredStateEm(ClientSyncManager instance, ErraiEntityManager value) /*-{
    instance.@org.jboss.errai.jpa.sync.client.local.ClientSyncManager::desiredStateEm = value;
  }-*/;

  public native static void ClientSyncManager_setup(ClientSyncManager instance) /*-{
    instance.@org.jboss.errai.jpa.sync.client.local.ClientSyncManager::setup()();
  }-*/;
}