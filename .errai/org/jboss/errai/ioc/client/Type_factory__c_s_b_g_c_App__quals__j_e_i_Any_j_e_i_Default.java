package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import com.shotechnology.base.gwterraigae.client.App;
import com.shotechnology.base.gwterraigae.client.Main;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.nav.client.local.Navigation;

public class Type_factory__c_s_b_g_c_App__quals__j_e_i_Any_j_e_i_Default extends Factory<App> { public Type_factory__c_s_b_g_c_App__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(App.class, "Type_factory__c_s_b_g_c_App__quals__j_e_i_Any_j_e_i_Default", EntryPoint.class, true, null, true));
    handle.setAssignableTypes(new Class[] { App.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public App createInstance(final ContextManager contextManager) {
    final App instance = new App();
    setIncompleteInstance(instance);
    final Main App_content = (Main) contextManager.getInstance("Type_factory__c_s_b_g_c_Main__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, App_content);
    App_Main_content(instance, App_content);
    final Navigation App_navigation = (Navigation) contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default");
    App_Navigation_navigation(instance, App_navigation);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final App instance) {
    instance.init();
  }

  native static Navigation App_Navigation_navigation(App instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.App::navigation;
  }-*/;

  native static void App_Navigation_navigation(App instance, Navigation value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.App::navigation = value;
  }-*/;

  native static Main App_Main_content(App instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.App::content;
  }-*/;

  native static void App_Main_content(App instance, Main value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.App::content = value;
  }-*/;
}