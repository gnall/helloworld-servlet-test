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
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import com.shotechnology.base.gwterraigae.client.Main;
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

public class Type_factory__c_s_b_g_c_Main__quals__j_e_i_Any_j_e_i_Default extends Factory<Main> { public interface c_s_b_g_c_MainTemplateResource extends Template, ClientBundle { @Source("com/shotechnology/base/gwterraigae/client/Main.html") public TextResource getContents(); }
  public Type_factory__c_s_b_g_c_Main__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(Main.class, "Type_factory__c_s_b_g_c_Main__quals__j_e_i_Any_j_e_i_Default", Dependent.class, false, null, true));
    handle.setAssignableTypes(new Class[] { Main.class, Composite.class, Widget.class, UIObject.class, Object.class, HasVisibility.class, EventListener.class, HasAttachHandlers.class, HasHandlers.class, IsWidget.class, IsRenderable.class });
  }

  public Main createInstance(final ContextManager contextManager) {
    final Main instance = new Main();
    setIncompleteInstance(instance);
    final SimplePanel Main_container = (SimplePanel) contextManager.getInstance("ExtensionProvided_factory__c_g_g_u_c_u_SimplePanel__quals__j_e_i_Any_j_e_i_Default");
    registerDependentScopedReference(instance, Main_container);
    Main_SimplePanel_container(instance, Main_container);
    c_s_b_g_c_MainTemplateResource templateForMain = GWT.create(c_s_b_g_c_MainTemplateResource.class);
    Element parentElementForTemplateOfMain = TemplateUtil.getRootTemplateParentElement(templateForMain.getContents().getText(), "com/shotechnology/base/gwterraigae/client/Main.html", "");
    TemplateUtil.translateTemplate("com/shotechnology/base/gwterraigae/client/Main.html", TemplateUtil.getRootTemplateElement(parentElementForTemplateOfMain));
    Map<String, Element> dataFieldElements = TemplateUtil.getDataFieldElements(TemplateUtil.getRootTemplateElement(parentElementForTemplateOfMain));
    final Map<String, DataFieldMeta> dataFieldMetas = new HashMap<String, DataFieldMeta>(1);
    dataFieldMetas.put("container", new DataFieldMeta());
    Map<String, Widget> templateFieldsMap = new LinkedHashMap<String, Widget>();
    TemplateUtil.compositeComponentReplace("com.shotechnology.base.gwterraigae.client.Main", "com/shotechnology/base/gwterraigae/client/Main.html", new Supplier<Widget>() {
      public Widget get() {
        return Main_SimplePanel_container(instance).asWidget();
      }
    }, dataFieldElements, dataFieldMetas, "container");
    templateFieldsMap.put("container", Main_SimplePanel_container(instance).asWidget());
    TemplateUtil.initWidget(instance, TemplateUtil.getRootTemplateElement(parentElementForTemplateOfMain), templateFieldsMap.values());
    StyleBindingsRegistry.get().updateStyles(instance);
    setIncompleteInstance(null);
    return instance;
  }

  public void generatedDestroyInstance(final Object instance, final ContextManager contextManager) {
    destroyInstanceHelper((Main) instance, contextManager);
  }

  public void destroyInstanceHelper(final Main instance, final ContextManager contextManager) {
    TemplateUtil.cleanupWidget(instance);
  }

  public void invokePostConstructs(final Main instance) {
    instance.init();
  }

  native static SimplePanel Main_SimplePanel_container(Main instance) /*-{
    return instance.@com.shotechnology.base.gwterraigae.client.Main::container;
  }-*/;

  native static void Main_SimplePanel_container(Main instance, SimplePanel value) /*-{
    instance.@com.shotechnology.base.gwterraigae.client.Main::container = value;
  }-*/;
}