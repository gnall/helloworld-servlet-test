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
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.shotechnology.base.gwterraigae.client.FieldPage;
import com.shotechnology.base.gwterraigae.client.FindPage;
import com.shotechnology.base.gwterraigae.client.NavigationEvent;
import com.shotechnology.base.gwterraigae.client.Page;
import com.shotechnology.base.gwterraigae.client.ProfilePage;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
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

public class Type_factory__c_s_b_g_c_FindPage__quals__j_e_i_Any_j_e_i_Default extends Factory<FindPage> { public interface c_s_b_g_c_FindPageTemplateResource extends Template, ClientBundle { @Source("com/shotechnology/base/gwterraigae/client/FindPage.html") public TextResource getContents(); }
  public Type_factory__c_s_b_g_c_FindPage__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(FindPage.class, "Type_factory__c_s_b_g_c_FindPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { FindPage.class, Page.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public FindPage createInstance(final ContextManager contextManager) {
    final FindPage instance = new FindPage();
    setIncompleteInstance(instance);
    final TransitionTo FindPage_profileClicked = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { ProfilePage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FindPage_profileClicked);
    FindPage_TransitionTo_profileClicked(instance, FindPage_profileClicked);
    final VerticalPanel FindPage_upcomingGames = (VerticalPanel) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_VerticalPanel__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FindPage_upcomingGames);
    FindPage_VerticalPanel_upcomingGames(instance, FindPage_upcomingGames);
    final TransitionTo FindPage_fieldClicked = (TransitionTo) contextManager.getContextualInstance("ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal", new Class[] { FieldPage.class }, new Annotation[] { });
    registerDependentScopedReference(instance, FindPage_fieldClicked);
    FindPage_TransitionTo_fieldClicked(instance, FindPage_fieldClicked);
    final Event Page_navigationEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavigationEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, Page_navigationEvent);
    Page_Event_navigationEvent(instance, Page_navigationEvent);
    c_s_b_g_c_FindPageTemplateResource templateForFindPage = GWT.create(c_s_b_g_c_FindPageTemplateResource.class);
    Element parentElementForTemplateOfFindPage = TemplateUtil.getRootTemplateParentElement(templateForFindPage.getContents().getText(), "com/shotechnology/base/gwterraigae/client/FindPage.html", "");
    TemplateUtil.translateTemplate("com/shotechnology/base/gwterraigae/client/FindPage.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFindPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFindPage));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(1);
    dataFieldMetas.put("upcomingGames", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.FindPage", "com/shotechnology/base/gwterraigae/client/FindPage.html", new Supplier<Widget>() {
      public Widget get() {
        return FindPage_VerticalPanel_upcomingGames(instance).asWidget();
      }
    }, dataFieldElements, dataFieldMetas, "upcomingGames");
    templateFieldsMap.put("upcomingGames", FindPage_VerticalPanel_upcomingGames(instance).asWidget());
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFindPage), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FindPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final FindPage instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final FindPage instance) {
    instance.onPostConstruct();
  }

  native static TransitionTo FindPage_TransitionTo_profileClicked(FindPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FindPage::profileClicked;
  }-*/;

  native static void FindPage_TransitionTo_profileClicked(FindPage instance, TransitionTo<ProfilePage> value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FindPage::profileClicked = value;
  }-*/;

  native static Event Page_Event_navigationEvent(Page instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.Page::navigationEvent;
  }-*/;

  native static void Page_Event_navigationEvent(Page instance, Event<NavigationEvent> value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.Page::navigationEvent = value;
  }-*/;

  native static VerticalPanel FindPage_VerticalPanel_upcomingGames(FindPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FindPage::upcomingGames;
  }-*/;

  native static void FindPage_VerticalPanel_upcomingGames(FindPage instance, VerticalPanel value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FindPage::upcomingGames = value;
  }-*/;

  native static TransitionTo FindPage_TransitionTo_fieldClicked(FindPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FindPage::fieldClicked;
  }-*/;

  native static void FindPage_TransitionTo_fieldClicked(FindPage instance, TransitionTo<FieldPage> value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FindPage::fieldClicked = value;
  }-*/;
}