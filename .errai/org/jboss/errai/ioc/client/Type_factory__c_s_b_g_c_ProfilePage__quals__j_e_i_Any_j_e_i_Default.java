package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import com.shotechnology.base.gwterraigae.client.NavigationEvent;
import com.shotechnology.base.gwterraigae.client.Page;
import com.shotechnology.base.gwterraigae.client.ProfilePage;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_s_b_g_c_ProfilePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ProfilePage> { public interface c_s_b_g_c_ProfilePageTemplateResource extends Template, ClientBundle { @Source("com/shotechnology/base/gwterraigae/client/ProfilePage.html") public TextResource getContents(); }
  public Type_factory__c_s_b_g_c_ProfilePage__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(ProfilePage.class, "Type_factory__c_s_b_g_c_ProfilePage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { ProfilePage.class, Page.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public ProfilePage createInstance(final ContextManager contextManager) {
    final ProfilePage instance = new ProfilePage();
    setIncompleteInstance(instance);
    final Event Page_navigationEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavigationEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, Page_navigationEvent);
    Page_Event_navigationEvent(instance, Page_navigationEvent);
    c_s_b_g_c_ProfilePageTemplateResource templateForProfilePage = GWT.create(c_s_b_g_c_ProfilePageTemplateResource.class);
    Element parentElementForTemplateOfProfilePage = TemplateUtil.getRootTemplateParentElement(templateForProfilePage.getContents().getText(), "com/shotechnology/base/gwterraigae/client/ProfilePage.html", "");
    TemplateUtil.translateTemplate("com/shotechnology/base/gwterraigae/client/ProfilePage.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProfilePage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProfilePage));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(0);
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfProfilePage), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((ProfilePage) instance, contextManager);
  }

  public void destroyInstanceHelper(final ProfilePage instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final ProfilePage instance) {
    instance.onPostConstruct();
  }

  native static Event Page_Event_navigationEvent(Page instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.Page::navigationEvent;
  }-*/;

  native static void Page_Event_navigationEvent(Page instance, Event<NavigationEvent> value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.Page::navigationEvent = value;
  }-*/;
}