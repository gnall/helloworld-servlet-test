package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.HasAttachHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.EventListener;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsRenderable;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import com.shotechnology.base.gwterraigae.client.FieldPage;
import com.shotechnology.base.gwterraigae.client.NavigationEvent;
import com.shotechnology.base.gwterraigae.client.Page;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import org.jboss.errai.common.client.ui.ElementWrapperWidget;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.DataFieldMeta;
import org.jboss.errai.ui.shared.Template;
import org.jboss.errai.ui.shared.TemplateUtil;
import org.jboss.errai.ui.shared.api.style.StyleBindingsRegistry;

public class Type_factory__c_s_b_g_c_FieldPage__quals__j_e_i_Any_j_e_i_Default extends Factory<FieldPage> { public interface c_s_b_g_c_FieldPageTemplateResource extends Template, ClientBundle { @Source("com/shotechnology/base/gwterraigae/client/FieldPage.html") public TextResource getContents(); }
  public Type_factory__c_s_b_g_c_FieldPage__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(FieldPage.class, "Type_factory__c_s_b_g_c_FieldPage__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { FieldPage.class, Page.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public FieldPage createInstance(final ContextManager contextManager) {
    final FieldPage instance = new FieldPage();
    setIncompleteInstance(instance);
    final DivElement FieldPage_stripePanel = (DivElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_DivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FieldPage_stripePanel);
    FieldPage_DivElement_stripePanel(instance, FieldPage_stripePanel);
    final DivElement FieldPage_gamePanel = (DivElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_DivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FieldPage_gamePanel);
    FieldPage_DivElement_gamePanel(instance, FieldPage_gamePanel);
    final SpanElement FieldPage_coach = (SpanElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_SpanElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FieldPage_coach);
    FieldPage_SpanElement_coach(instance, FieldPage_coach);
    final HeadingElement FieldPage_fieldName = (HeadingElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_HeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FieldPage_fieldName);
    FieldPage_HeadingElement_fieldName(instance, FieldPage_fieldName);
    final SpanElement FieldPage_location = (SpanElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_SpanElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FieldPage_location);
    FieldPage_SpanElement_location(instance, FieldPage_location);
    final DivElement FieldPage_payment = (DivElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_DivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FieldPage_payment);
    FieldPage_DivElement_payment(instance, FieldPage_payment);
    final Button FieldPage_submitButton = (Button) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_Button__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, FieldPage_submitButton);
    FieldPage_Button_submitButton(instance, FieldPage_submitButton);
    final Event Page_navigationEvent = (Event) contextManager.getContextualInstance("ContextualProvider_factory__j_e_e_Event__quals__Universal", new Class[] { NavigationEvent.class }, new Annotation[] { });
    registerDependentScopedReference(instance, Page_navigationEvent);
    Page_Event_navigationEvent(instance, Page_navigationEvent);
    final SpanElement FieldPage_capacity = (SpanElement) contextManager.getInstance("ExtensionProvided_factory__c_g_g_d_c_SpanElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named");
    registerDependentScopedReference(instance, FieldPage_capacity);
    FieldPage_SpanElement_capacity(instance, FieldPage_capacity);
    c_s_b_g_c_FieldPageTemplateResource templateForFieldPage = GWT.create(c_s_b_g_c_FieldPageTemplateResource.class);
    Element parentElementForTemplateOfFieldPage = TemplateUtil.getRootTemplateParentElement(templateForFieldPage.getContents().getText(), "com/shotechnology/base/gwterraigae/client/FieldPage.html", "");
    TemplateUtil.translateTemplate("com/shotechnology/base/gwterraigae/client/FieldPage.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFieldPage));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFieldPage));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(8);
    dataFieldMetas.put("fieldName", new DataFieldMeta());
    dataFieldMetas.put("location", new DataFieldMeta());
    dataFieldMetas.put("capacity", new DataFieldMeta());
    dataFieldMetas.put("coach", new DataFieldMeta());
    dataFieldMetas.put("payment", new DataFieldMeta());
    dataFieldMetas.put("stripePanel", new DataFieldMeta());
    dataFieldMetas.put("gamePanel", new DataFieldMeta());
    dataFieldMetas.put("submitButton", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.FieldPage", "com/shotechnology/base/gwterraigae/client/FieldPage.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FieldPage_HeadingElement_fieldName(instance));
      }
    }, dataFieldElements, dataFieldMetas, "fieldName");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.FieldPage", "com/shotechnology/base/gwterraigae/client/FieldPage.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FieldPage_SpanElement_location(instance));
      }
    }, dataFieldElements, dataFieldMetas, "location");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.FieldPage", "com/shotechnology/base/gwterraigae/client/FieldPage.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FieldPage_SpanElement_capacity(instance));
      }
    }, dataFieldElements, dataFieldMetas, "capacity");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.FieldPage", "com/shotechnology/base/gwterraigae/client/FieldPage.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FieldPage_SpanElement_coach(instance));
      }
    }, dataFieldElements, dataFieldMetas, "coach");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.FieldPage", "com/shotechnology/base/gwterraigae/client/FieldPage.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FieldPage_DivElement_payment(instance));
      }
    }, dataFieldElements, dataFieldMetas, "payment");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.FieldPage", "com/shotechnology/base/gwterraigae/client/FieldPage.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FieldPage_DivElement_stripePanel(instance));
      }
    }, dataFieldElements, dataFieldMetas, "stripePanel");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.FieldPage", "com/shotechnology/base/gwterraigae/client/FieldPage.html", new Supplier<Widget>() {
      public Widget get() {
        return ElementWrapperWidget.getWidget(FieldPage_DivElement_gamePanel(instance));
      }
    }, dataFieldElements, dataFieldMetas, "gamePanel");
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.FieldPage", "com/shotechnology/base/gwterraigae/client/FieldPage.html", new Supplier<Widget>() {
      public Widget get() {
        return FieldPage_Button_submitButton(instance).asWidget();
      }
    }, dataFieldElements, dataFieldMetas, "submitButton");
    templateFieldsMap.put("fieldName", ElementWrapperWidget.getWidget(FieldPage_HeadingElement_fieldName(instance)));
    templateFieldsMap.put("location", ElementWrapperWidget.getWidget(FieldPage_SpanElement_location(instance)));
    templateFieldsMap.put("capacity", ElementWrapperWidget.getWidget(FieldPage_SpanElement_capacity(instance)));
    templateFieldsMap.put("coach", ElementWrapperWidget.getWidget(FieldPage_SpanElement_coach(instance)));
    templateFieldsMap.put("payment", ElementWrapperWidget.getWidget(FieldPage_DivElement_payment(instance)));
    templateFieldsMap.put("stripePanel", ElementWrapperWidget.getWidget(FieldPage_DivElement_stripePanel(instance)));
    templateFieldsMap.put("gamePanel", ElementWrapperWidget.getWidget(FieldPage_DivElement_gamePanel(instance)));
    templateFieldsMap.put("submitButton", FieldPage_Button_submitButton(instance).asWidget());
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfFieldPage), templateFieldsMap.values());
    TemplateUtil.setupWrappedElementEventHandler(templateFieldsMap.get("payment"), new ClickHandler() {
      public void onClick(ClickEvent event) {
        instance.onPaymentClicked(event);
      }
    }, ClickEvent.getType());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((FieldPage) instance, contextManager);
  }

  public void destroyInstanceHelper(final FieldPage instance, final ContextManager contextManager) {
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FieldPage_HeadingElement_fieldName(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FieldPage_SpanElement_location(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FieldPage_SpanElement_capacity(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FieldPage_SpanElement_coach(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FieldPage_DivElement_payment(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FieldPage_DivElement_stripePanel(instance)));
    ElementWrapperWidget.removeWidget(ElementWrapperWidget.getWidget(FieldPage_DivElement_gamePanel(instance)));
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final FieldPage instance) {
    instance.onPostConstruct();
  }

  native static Event Page_Event_navigationEvent(Page instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.Page::navigationEvent;
  }-*/;

  native static void Page_Event_navigationEvent(Page instance, Event<NavigationEvent> value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.Page::navigationEvent = value;
  }-*/;

  native static SpanElement FieldPage_SpanElement_coach(FieldPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FieldPage::coach;
  }-*/;

  native static void FieldPage_SpanElement_coach(FieldPage instance, SpanElement value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FieldPage::coach = value;
  }-*/;

  native static DivElement FieldPage_DivElement_gamePanel(FieldPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FieldPage::gamePanel;
  }-*/;

  native static void FieldPage_DivElement_gamePanel(FieldPage instance, DivElement value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FieldPage::gamePanel = value;
  }-*/;

  native static DivElement FieldPage_DivElement_payment(FieldPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FieldPage::payment;
  }-*/;

  native static void FieldPage_DivElement_payment(FieldPage instance, DivElement value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FieldPage::payment = value;
  }-*/;

  native static Button FieldPage_Button_submitButton(FieldPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FieldPage::submitButton;
  }-*/;

  native static void FieldPage_Button_submitButton(FieldPage instance, Button value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FieldPage::submitButton = value;
  }-*/;

  native static SpanElement FieldPage_SpanElement_capacity(FieldPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FieldPage::capacity;
  }-*/;

  native static void FieldPage_SpanElement_capacity(FieldPage instance, SpanElement value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FieldPage::capacity = value;
  }-*/;

  native static DivElement FieldPage_DivElement_stripePanel(FieldPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FieldPage::stripePanel;
  }-*/;

  native static void FieldPage_DivElement_stripePanel(FieldPage instance, DivElement value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FieldPage::stripePanel = value;
  }-*/;

  native static HeadingElement FieldPage_HeadingElement_fieldName(FieldPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FieldPage::fieldName;
  }-*/;

  native static void FieldPage_HeadingElement_fieldName(FieldPage instance, HeadingElement value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FieldPage::fieldName = value;
  }-*/;

  native static SpanElement FieldPage_SpanElement_location(FieldPage instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.FieldPage::location;
  }-*/;

  native static void FieldPage_SpanElement_location(FieldPage instance, SpanElement value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.FieldPage::location = value;
  }-*/;
}