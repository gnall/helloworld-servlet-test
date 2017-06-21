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
import com.shotechnology.base.gwterraigae.client.NavigationEvent;
import com.shotechnology.base.gwterraigae.client.Page;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class Type_factory__c_s_b_g_c_Page__quals__j_e_i_Any_j_e_i_Default extends Factory<Page> { public Type_factory__c_s_b_g_c_Page__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(Page.class, "Type_factory__c_s_b_g_c_Page__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { Page.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public Page createInstance(final ContextManager contextManager) {
    final Page instance = new Page();
    setIncompleteInstance(instance);
    final Event Page_navigationEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavigationEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, Page_navigationEvent);
    Page_Event_navigationEvent(instance, Page_navigationEvent);
    setIncompleteInstance(null);
    return instance;
  }

  public void invokePostConstructs(final Page instance) {
    instance.onPostConstruct();
  }

  native static Event Page_Event_navigationEvent(Page instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.Page::navigationEvent;
  }-*/;

  native static void Page_Event_navigationEvent(Page instance, Event<NavigationEvent> value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.Page::navigationEvent = value;
  }-*/;
}