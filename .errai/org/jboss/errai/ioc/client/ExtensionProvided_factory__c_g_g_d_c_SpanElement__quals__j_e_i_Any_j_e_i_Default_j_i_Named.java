package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.SpanElement;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.TemplateUtil;

public class ExtensionProvided_factory__c_g_g_d_c_SpanElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<SpanElement> { public ExtensionProvided_factory__c_g_g_d_c_SpanElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(SpanElement.class, "ExtensionProvided_factory__c_g_g_d_c_SpanElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "span", true));
    handle.setAssignableTypes(new Class[] { SpanElement.class, Element.class, Node.class, JavaScriptObject.class, Object.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("span") });
  }

  public SpanElement createInstance(final ContextManager contextManager) {
    final Element element = Document.get().createElement("span");
    final SpanElement retVal = TemplateUtil.nativeCast(element);
    return retVal;
  }
}