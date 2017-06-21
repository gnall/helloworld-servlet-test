package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import com.shotechnology.base.gwterraigae.client.MainPage;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_s_b_g_c_MainPage__quals__j_e_i_Any_j_e_i_Default extends Factory<MainPage> { public interface c_s_b_g_c_MainPageTemplateResource extends Template, ClientBundle { @Source("com/shotechnology/base/gwterraigae/client/MainPage.html") public TextResource getContents(); }
  public Type_factory__c_s_b_g_c_MainPage__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(MainPage.class, "Type_factory__c_s_b_g_c_MainPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { MainPage.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public MainPage createInstance(final ContextManager contextManager) {
    final MainPage instance = new MainPage();
    setIncompleteInstance(instance);
    final Anchor MainPage_find = (Anchor) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_Anchor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, MainPage_find);
    MainPage_Anchor_find(instance, MainPage_find);
    final Anchor MainPage_field = (Anchor) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_Anchor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, MainPage_field);
    MainPage_Anchor_field(instance, MainPage_field);
    final Anchor MainPage_favorite = (Anchor) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_Anchor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, MainPage_favorite);
    MainPage_Anchor_favorite(instance, MainPage_favorite);
    final Anchor MainPage_login = (Anchor) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_Anchor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, MainPage_login);
    MainPage_Anchor_login(instance, MainPage_login);
    final Anchor MainPage_profile = (Anchor) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_Anchor__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, MainPage_profile);
    MainPage_Anchor_profile(instance, MainPage_profile);
    c_s_b_g_c_MainPageTemplateResource templateForMainPage = GWT.create(c_s_b_g_c_MainPageTemplateResource.class);
    Element parentElementForTemplateOfMainPage = TemplateUtil.getRootTemplateParentElement(templateForMainPage.getContents().getText(), "com/shotechnology/base/gwterraigae/client/MainPage.html", "");
    TemplateUtil.translateTemplate("com/shotechnology/base/gwterraigae/client/MainPage.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfMainPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfMainPage));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(5);
    dataFieldMetas.put("find", new DataFieldMeta());
    dataFieldMetas.put("profile", new DataFieldMeta());
    dataFieldMetas.put("field", new DataFieldMeta());
    dataFieldMetas.put("favorite", new DataFieldMeta());
    dataFieldMetas.put("login", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.MainPage", "com/shotechnology/base/gwterraigae/client/MainPage.html", new Supplier<Widget>() {
      public Widget get() {
        return MainPage_Anchor_find(instance).asWidget();
      }
    }, dataFieldElements, dataFieldMetas, "find");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.MainPage", "com/shotechnology/base/gwterraigae/client/MainPage.html", new Supplier<Widget>() {
      public Widget get() {
        return MainPage_Anchor_profile(instance).asWidget();
      }
    }, dataFieldElements, dataFieldMetas, "profile");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.MainPage", "com/shotechnology/base/gwterraigae/client/MainPage.html", new Supplier<Widget>() {
      public Widget get() {
        return MainPage_Anchor_field(instance).asWidget();
      }
    }, dataFieldElements, dataFieldMetas, "field");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.MainPage", "com/shotechnology/base/gwterraigae/client/MainPage.html", new Supplier<Widget>() {
      public Widget get() {
        return MainPage_Anchor_favorite(instance).asWidget();
      }
    }, dataFieldElements, dataFieldMetas, "favorite");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.MainPage", "com/shotechnology/base/gwterraigae/client/MainPage.html", new Supplier<Widget>() {
      public Widget get() {
        return MainPage_Anchor_login(instance).asWidget();
      }
    }, dataFieldElements, dataFieldMetas, "login");
    templateFieldsMap.put("find", MainPage_Anchor_find(instance).asWidget());
    templateFieldsMap.put("profile", MainPage_Anchor_profile(instance).asWidget());
    templateFieldsMap.put("field", MainPage_Anchor_field(instance).asWidget());
    templateFieldsMap.put("favorite", MainPage_Anchor_favorite(instance).asWidget());
    templateFieldsMap.put("login", MainPage_Anchor_login(instance).asWidget());
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfMainPage), templateFieldsMap.values());
    ((HasClickHandlers) templateFieldsMap.get("login")).addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.goToLoginPage(event);
      }
    });
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((MainPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final MainPage instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final MainPage instance) {
    instance.onPostConstruct();
  }

  native static Anchor MainPage_Anchor_find(MainPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.MainPage::find;
  }-*/;

  native static void MainPage_Anchor_find(MainPage instance, Anchor value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.MainPage::find = value;
  }-*/;

  native static Anchor MainPage_Anchor_login(MainPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.MainPage::login;
  }-*/;

  native static void MainPage_Anchor_login(MainPage instance, Anchor value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.MainPage::login = value;
  }-*/;

  native static Anchor MainPage_Anchor_field(MainPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.MainPage::field;
  }-*/;

  native static void MainPage_Anchor_field(MainPage instance, Anchor value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.MainPage::field = value;
  }-*/;

  native static Anchor MainPage_Anchor_profile(MainPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.MainPage::profile;
  }-*/;

  native static void MainPage_Anchor_profile(MainPage instance, Anchor value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.MainPage::profile = value;
  }-*/;

  native static Anchor MainPage_Anchor_favorite(MainPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.MainPage::favorite;
  }-*/;

  native static void MainPage_Anchor_favorite(MainPage instance, Anchor value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.MainPage::favorite = value;
  }-*/;
}