package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.dom.client.Node;
import java.lang.annotation.Annotation;
import javax.enterprise.context.Dependent;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ui.shared.TemplateUtil;

public class ExtensionProvided_factory__c_g_g_d_c_HeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HeadingElement> { public ExtensionProvided_factory__c_g_g_d_c_HeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named() {
    super(new FactoryHandleImpl(HeadingElement.class, "ExtensionProvided_factory__c_g_g_d_c_HeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named", Dependent.class, false, "h1", true));
    handle.setAssignableTypes(new Class[] { HeadingElement.class, Element.class, Node.class, JavaScriptObject.class, Object.class });
    handle.setQualifiers(new Annotation[] { QualifierUtil.ANY_ANNOTATION, QualifierUtil.DEFAULT_ANNOTATION, QualifierUtil.createNamed("h1") });
  }

  public HeadingElement createInstance(final ContextManager contextManager) {
    final Element element = Document.get().createElement("h1");
    final HeadingElement retVal = TemplateUtil.nativeCast(element);
    return retVal;
  }
}