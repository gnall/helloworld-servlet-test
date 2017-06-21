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
import com.shotechnology.base.gwterraigae.client.MainPage;
import com.shotechnology.base.gwterraigae.client.NavigationEvent;
import com.shotechnology.base.gwterraigae.client.OauthCallbackPage;
import com.shotechnology.base.gwterraigae.client.Page;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_s_b_g_c_OauthCallbackPage__quals__j_e_i_Any_j_e_i_Default extends Factory<OauthCallbackPage> { public interface c_s_b_g_c_OauthCallbackPageTemplateResource extends Template, ClientBundle { @Source("com/shotechnology/base/gwterraigae/client/OauthCallbackPage.html") public TextResource getContents(); }
  public Type_factory__c_s_b_g_c_OauthCallbackPage__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(OauthCallbackPage.class, "Type_factory__c_s_b_g_c_OauthCallbackPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { OauthCallbackPage.class, Page.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public OauthCallbackPage createInstance(final ContextManager contextManager) {
    final OauthCallbackPage instance = new OauthCallbackPage();
    setIncompleteInstance(instance);
    final TransitionTo OauthCallbackPage_transitionToMainPage = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { MainPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, OauthCallbackPage_transitionToMainPage);
    OauthCallbackPage_TransitionTo_transitionToMainPage(instance, OauthCallbackPage_transitionToMainPage);
    final Event Page_navigationEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavigationEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, Page_navigationEvent);
    Page_Event_navigationEvent(instance, Page_navigationEvent);
    c_s_b_g_c_OauthCallbackPageTemplateResource templateForOauthCallbackPage = GWT.create(c_s_b_g_c_OauthCallbackPageTemplateResource.class);
    Element parentElementForTemplateOfOauthCallbackPage = TemplateUtil.getRootTemplateParentElement(templateForOauthCallbackPage.getContents().getText(), "com/shotechnology/base/gwterraigae/client/OauthCallbackPage.html", "");
    TemplateUtil.translateTemplate("com/shotechnology/base/gwterraigae/client/OauthCallbackPage.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOauthCallbackPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOauthCallbackPage));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(0);
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfOauthCallbackPage), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((OauthCallbackPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final OauthCallbackPage instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final OauthCallbackPage instance) {
    instance.onPostConstruct();
  }

  native static Event Page_Event_navigationEvent(Page instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.Page::navigationEvent;
  }-*/;

  native static void Page_Event_navigationEvent(Page instance, Event<NavigationEvent> value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.Page::navigationEvent = value;
  }-*/;

  native static TransitionTo OauthCallbackPage_TransitionTo_transitionToMainPage(OauthCallbackPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.OauthCallbackPage::transitionToMainPage;
  }-*/;

  native static void OauthCallbackPage_TransitionTo_transitionToMainPage(OauthCallbackPage instance, TransitionTo<MainPage> value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.OauthCallbackPage::transitionToMainPage = value;
  }-*/;
}