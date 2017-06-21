package org.jboss.errai.ioc.client;

import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.CellPanel;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HasWidgets.ForIsWidget;
import com.google.gwt.user.client.ui.IndexedPanel;
import com.google.gwt.user.client.ui.InsertPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;

public class ExtensionProvided_factory__c_g_g_u_c_u_VerticalPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<VerticalPanel> { public ExtensionProvided_factory__c_g_g_u_c_u_VerticalPanel__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(VerticalPanel.class, "ExtensionProvided_factory__c_g_g_u_c_u_VerticalPanel__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { VerticalPanel.class, CellPanel.class, ComplexPanel.class, Panel.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, ForIsWidget.class, HasWidgets.class, Iterable.class, com.google.gwt.user.client.ui.IndexedPanel.ForIsWidget.class, IndexedPanel.class, HasAlignment.class, HasHorizontalAlignment.class, HasVerticalAlignment.class, com.google.gwt.user.client.ui.InsertPanel.ForIsWidget.class, InsertPanel.class });
  }

  public VerticalPanel createInstance(final ContextManager contextManager) {
    return new VerticalPanel();
  }
}