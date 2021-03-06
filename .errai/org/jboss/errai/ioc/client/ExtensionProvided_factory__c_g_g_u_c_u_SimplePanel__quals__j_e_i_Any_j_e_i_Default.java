package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HasOneWidget;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HasWidgets.ForIsWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class ExtensionProvided_factory__c_g_g_u_c_u_SimplePanel__quals__j_e_i_Any_j_e_i_Default extends Factory<SimplePanel> { public ExtensionProvided_factory__c_g_g_u_c_u_SimplePanel__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(SimplePanel.class, "ExtensionProvided_factory__c_g_g_u_c_u_SimplePanel__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { SimplePanel.class, Panel.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, ForIsWidget.class, HasWidgets.class, Iterable.class, HasOneWidget.class, AcceptsOneWidget.class });
  }

  public SimplePanel createInstance(final ContextManager contextManager) {
    return new SimplePanel();
  }
}