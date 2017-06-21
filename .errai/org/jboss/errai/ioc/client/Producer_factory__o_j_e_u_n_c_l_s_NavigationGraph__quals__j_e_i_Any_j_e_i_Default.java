package org.jboss.errai.ioc.client;

import java.util.Collection;
import javax.enterprise.context.ApplicationScoped;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.FactoryHandleImpl;
import org.jboss.errai.ioc.client.container.Proxy;
import org.jboss.errai.ioc.client.container.ProxyHelper;
import org.jboss.errai.ioc.client.container.ProxyHelperImpl;
import org.jboss.errai.ui.nav.client.local.URLPatternMatcherProvider;
import org.jboss.errai.ui.nav.client.local.spi.NavigationGraph;
import org.jboss.errai.ui.nav.client.local.spi.PageNode;

public class Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationGraph> { private class Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_DefaultProxyImpl extends NavigationGraph implements Proxy<NavigationGraph> {
    private final ProxyHelper<NavigationGraph> proxyHelper = new ProxyHelperImpl<NavigationGraph>("Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_Default");
    public void initProxyProperties(final NavigationGraph instance) {

    }

    public NavigationGraph asBeanType() {
      return this;
    }

    public void setInstance(final NavigationGraph instance) {
      proxyHelper.setInstance(instance);
    }

    public void clearInstance() {
      proxyHelper.clearInstance();
    }

    public void setProxyContext(final Context context) {
      proxyHelper.setProxyContext(context);
    }

    public Context getProxyContext() {
      return proxyHelper.getProxyContext();
    }

    public Object unwrap() {
      return proxyHelper.getInstance(this);
    }

    public boolean equals(Object obj) {
      obj = Factory.maybeUnwrapProxy(obj);
      return proxyHelper.getInstance(this).equals(obj);
    }

    @Override public PageNode getPage(String name) {
      if (proxyHelper != null) {
        final NavigationGraph proxiedInstance = proxyHelper.getInstance(this);
        final PageNode retVal = proxiedInstance.getPage(name);
        return retVal;
      } else {
        return super.getPage(name);
      }
    }

    @Override public PageNode getPage(Class type) {
      if (proxyHelper != null) {
        final NavigationGraph proxiedInstance = proxyHelper.getInstance(this);
        final PageNode retVal = proxiedInstance.getPage(type);
        return retVal;
      } else {
        return super.getPage(type);
      }
    }

    @Override public Collection getPagesByRole(Class role) {
      if (proxyHelper != null) {
        final NavigationGraph proxiedInstance = proxyHelper.getInstance(this);
        final Collection retVal = proxiedInstance.getPagesByRole(role);
        return retVal;
      } else {
        return super.getPagesByRole(role);
      }
    }

    @Override public PageNode getPageByRole(Class role) {
      if (proxyHelper != null) {
        final NavigationGraph proxiedInstance = proxyHelper.getInstance(this);
        final PageNode retVal = proxiedInstance.getPageByRole(role);
        return retVal;
      } else {
        return super.getPageByRole(role);
      }
    }

    @Override public boolean isEmpty() {
      if (proxyHelper != null) {
        final NavigationGraph proxiedInstance = proxyHelper.getInstance(this);
        final boolean retVal = proxiedInstance.isEmpty();
        return retVal;
      } else {
        return super.isEmpty();
      }
    }

    @Override public Collection getAllPages() {
      if (proxyHelper != null) {
        final NavigationGraph proxiedInstance = proxyHelper.getInstance(this);
        final Collection retVal = proxiedInstance.getAllPages();
        return retVal;
      } else {
        return super.getAllPages();
      }
    }

    @Override public int hashCode() {
      if (proxyHelper != null) {
        final NavigationGraph proxiedInstance = proxyHelper.getInstance(this);
        final int retVal = proxiedInstance.hashCode();
        return retVal;
      } else {
        return super.hashCode();
      }
    }
  }
  public Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_Default() {
    super(new FactoryHandleImpl(NavigationGraph.class, "Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_Default", ApplicationScoped.class, false, null, true));
    handle.setAssignableTypes(new Class[] { NavigationGraph.class, Object.class });
  }

  public NavigationGraph createInstance(final ContextManager contextManager) {
    URLPatternMatcherProvider producerInstance = contextManager.getInstance("Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default");
    producerInstance = Factory.maybeUnwrapProxy(producerInstance);
    final NavigationGraph instance = producerInstance.createNavigationGraph();
    thisInstance.setReference(instance, "producerInstance", producerInstance);
    registerDependentScopedReference(instance, producerInstance);
    return instance;
  }

  public Proxy createProxy(final Context context) {
    final Proxy<NavigationGraph> proxyImpl = new Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_DefaultProxyImpl();
    proxyImpl.setProxyContext(context);
    return proxyImpl;
  }
}