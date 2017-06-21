package org.jboss.errai.ioc.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.shotechnology.base.gwterraigae.client.App;
import com.shotechnology.base.gwterraigae.client.FieldPage;
import com.shotechnology.base.gwterraigae.client.FindPage;
import com.shotechnology.base.gwterraigae.client.Main;
import com.shotechnology.base.gwterraigae.client.MainPage;
import com.shotechnology.base.gwterraigae.client.OauthCallbackPage;
import com.shotechnology.base.gwterraigae.client.Page;
import com.shotechnology.base.gwterraigae.client.ProfilePage;
import com.shotechnology.base.gwterraigae.client.firebase.Config;
import com.shotechnology.base.gwterraigae.client.stripe.Changed;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Instance;
import org.jboss.errai.bus.client.api.ClientMessageBus;
import org.jboss.errai.bus.client.api.messaging.RequestDispatcher;
import org.jboss.errai.common.client.api.BatchCaller;
import org.jboss.errai.common.client.api.Caller;
import org.jboss.errai.common.client.dom.Document;
import org.jboss.errai.common.client.dom.HTMLElement;
import org.jboss.errai.databinding.client.DataBinderProvider;
import org.jboss.errai.databinding.client.DataBindingModuleBootstrapper;
import org.jboss.errai.databinding.client.ListComponentProvider;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.databinding.client.components.ListComponent;
import org.jboss.errai.enterprise.client.cdi.CDIEventTypeLookup;
import org.jboss.errai.enterprise.client.cdi.EventProvider;
import org.jboss.errai.enterprise.client.cdi.InstanceProvider;
import org.jboss.errai.enterprise.client.cdi.JsTypeEventObserver;
import org.jboss.errai.enterprise.client.cdi.WindowEventObservers;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ioc.client.api.Disposer;
import org.jboss.errai.ioc.client.api.InitBallot;
import org.jboss.errai.ioc.client.api.ManagedInstance;
import org.jboss.errai.ioc.client.api.builtin.CallerProvider;
import org.jboss.errai.ioc.client.api.builtin.DisposerProvider;
import org.jboss.errai.ioc.client.api.builtin.IOCBeanManagerProvider;
import org.jboss.errai.ioc.client.api.builtin.InitBallotProvider;
import org.jboss.errai.ioc.client.api.builtin.ManagedInstanceProvider;
import org.jboss.errai.ioc.client.api.builtin.RootPanelProvider;
import org.jboss.errai.ioc.client.container.ApplicationScopedContext;
import org.jboss.errai.ioc.client.container.Context;
import org.jboss.errai.ioc.client.container.ContextManager;
import org.jboss.errai.ioc.client.container.ContextManagerImpl;
import org.jboss.errai.ioc.client.container.DependentScopeContext;
import org.jboss.errai.ioc.client.container.Factory;
import org.jboss.errai.ioc.client.container.JsTypeProvider;
import org.jboss.errai.ioc.client.container.SyncBeanManager;
import org.jboss.errai.ioc.client.lifecycle.impl.AccessImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.CreationImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.DestructionImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.LifecycleListenerRegistrarImpl;
import org.jboss.errai.ioc.client.lifecycle.impl.StateChangeImpl;
import org.jboss.errai.ioc.support.bus.client.BatchCallerProvider;
import org.jboss.errai.ioc.support.bus.client.MessageBusProvider;
import org.jboss.errai.ioc.support.bus.client.RequestDispatcherProvider;
import org.jboss.errai.ioc.support.bus.client.Sender;
import org.jboss.errai.ioc.support.bus.client.SenderProvider;
import org.jboss.errai.ui.client.local.producer.HTMLElementProvider;
import org.jboss.errai.ui.client.local.spi.TranslationService;
import org.jboss.errai.ui.client.local.spi.TranslationServiceProvider;
import org.jboss.errai.ui.client.widget.ListWidget;
import org.jboss.errai.ui.client.widget.ListWidgetProvider;
import org.jboss.errai.ui.client.widget.LocaleListBox;
import org.jboss.errai.ui.client.widget.LocaleSelector;
import org.jboss.errai.ui.nav.client.local.HistoryTokenFactory;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.nav.client.local.NavigationPanel;
import org.jboss.errai.ui.nav.client.local.NavigationPanelProvider;
import org.jboss.errai.ui.nav.client.local.PageTransitionProvider;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.nav.client.local.TransitionAnchorFactory;
import org.jboss.errai.ui.nav.client.local.TransitionAnchorFactoryProvider;
import org.jboss.errai.ui.nav.client.local.TransitionAnchorProvider;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.nav.client.local.TransitionToRole;
import org.jboss.errai.ui.nav.client.local.TransitionToRoleProvider;
import org.jboss.errai.ui.nav.client.local.URLPatternMatcher;
import org.jboss.errai.ui.nav.client.local.URLPatternMatcherProvider;
import org.jboss.errai.ui.nav.client.local.spi.NavigationGraph;
import org.jboss.errai.ui.shared.ServerTemplateProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BootstrapperImpl implements Bootstrapper {
  {
    new CDI().initLookupTable(CDIEventTypeLookup.get());
    new DataBindingModuleBootstrapper().run();
  }

  private ContextManager contextManager = new ContextManagerImpl();
  private static final Logger logger = LoggerFactory.getLogger(Bootstrapper.class);
  public abstract class Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<URLPatternMatcher> { }
  public abstract class Type_factory__c_s_b_g_c_Page__quals__j_e_i_Any_j_e_i_Default extends Factory<Page> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<LifecycleListenerRegistrarImpl> { }
  public abstract class Provider_factory__o_j_e_u_n_c_l_NavigationPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationPanel> { }
  public abstract class Type_factory__c_s_b_g_c_FieldPage__quals__j_e_i_Any_j_e_i_Default extends Factory<FieldPage> { }
  public abstract class ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal extends Factory<HTMLElement> { }
  public abstract class ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal extends Factory<Caller> { }
  public abstract class Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default extends Factory<ClientMessageBus> { }
  public abstract class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchorFactory__quals__Universal extends Factory<TransitionAnchorFactory> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_Disposer__quals__Universal extends Factory<Disposer> { }
  public abstract class ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal extends Factory<ListComponent> { }
  public abstract class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionToRole__quals__Universal extends Factory<TransitionToRole> { }
  public abstract class Type_factory__c_s_b_g_c_App__quals__j_e_i_Any_j_e_i_Default extends Factory<App> { }
  public abstract class Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default extends Factory<Document> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal extends Factory<ManagedInstance> { }
  public abstract class ExtensionProvided_factory__c_g_g_u_c_u_Button__quals__j_e_i_Any_j_e_i_Default extends Factory<Button> { }
  public abstract class Type_factory__c_s_b_g_c_MainPage__quals__j_e_i_Any_j_e_i_Default extends Factory<MainPage> { }
  public abstract class ContextualProvider_factory__j_e_e_Event__quals__Universal extends Factory<Event> { }
  public abstract class ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal extends Factory<DataBinder> { }
  public abstract class ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal extends Factory<InitBallot> { }
  public abstract class ExtensionProvided_factory__c_g_g_d_c_SpanElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<SpanElement> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanelProvider> { }
  public abstract class Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationGraph> { }
  public abstract class ExtensionProvided_factory__o_s_Logger__quals__Universal extends Factory<Logger> { }
  public abstract class Type_factory__c_s_b_g_c_Main__quals__j_e_i_Any_j_e_i_Default extends Factory<Main> { }
  public abstract class Type_factory__o_j_e_u_c_w_ListWidgetProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ListWidgetProvider> { }
  public abstract class Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCaller> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<URLPatternMatcherProvider> { }
  public abstract class ExtensionProvided_factory__c_g_g_d_c_HeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<HeadingElement> { }
  public abstract class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchor__quals__Universal extends Factory<TransitionAnchor> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default extends Factory<Navigation> { }
  public abstract class Type_factory__o_j_e_u_s_ServerTemplateProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ServerTemplateProvider> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<BatchCallerProvider> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_TransitionToRoleProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TransitionToRoleProvider> { }
  public abstract class JsType_factory__j_u_Set__quals__Universal extends Factory<Set> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<IOCBeanManagerProvider> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_TransitionAnchorFactoryProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TransitionAnchorFactoryProvider> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcherProvider> { }
  public abstract class ExtensionProvided_factory__c_g_g_u_c_u_SimplePanel__quals__j_e_i_Any_j_e_i_Default extends Factory<SimplePanel> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<AccessImpl> { }
  public abstract class Type_factory__c_s_b_g_c_s_Changed__quals__j_e_i_Any_j_e_i_Default extends Factory<Changed> { }
  public abstract class ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal extends Factory<TransitionTo> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DisposerProvider> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<MessageBusProvider> { }
  public abstract class Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<SenderProvider> { }
  public abstract class JsType_factory__j_u_Map__quals__Universal extends Factory<Map> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ManagedInstanceProvider> { }
  public abstract class JsType_factory__j_u_List__quals__Universal extends Factory<List> { }
  public abstract class ExtensionProvided_factory__c_g_g_d_c_DivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named extends Factory<DivElement> { }
  public abstract class Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<HTMLElementProvider> { }
  public abstract class Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<RootPanel> { }
  public abstract class ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal extends Factory<ListWidget> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<DestructionImpl> { }
  public abstract class Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InstanceProvider> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default extends Factory<HistoryTokenFactory> { }
  public abstract class ExtensionProvided_factory__c_g_g_u_c_u_VerticalPanel__quals__j_e_i_Any_j_e_i_Default extends Factory<VerticalPanel> { }
  public abstract class JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal extends Factory<WindowEventObservers> { }
  public abstract class Type_factory__c_s_b_g_c_FindPage__quals__j_e_i_Any_j_e_i_Default extends Factory<FindPage> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<InitBallotProvider> { }
  public abstract class ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal extends Factory<Sender> { }
  public abstract class Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default extends Factory<LocaleListBox> { }
  public abstract class JsType_factory__c_s_b_g_c_s_Changed__quals__Universal extends Factory<Changed> { }
  public abstract class JsType_factory__j_u_Collection__quals__Universal extends Factory<Collection> { }
  public abstract class Type_factory__c_s_b_g_c_f_Config__quals__j_e_i_Any_j_e_i_Default extends Factory<Config> { }
  public abstract class Type_factory__c_s_b_g_c_ProfilePage__quals__j_e_i_Any_j_e_i_Default extends Factory<ProfilePage> { }
  public abstract class Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<DataBinderProvider> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_PageTransitionProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<PageTransitionProvider> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TransitionAnchorProvider> { }
  public abstract class Type_factory__c_s_b_g_c_OauthCallbackPage__quals__j_e_i_Any_j_e_i_Default extends Factory<OauthCallbackPage> { }
  public abstract class JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal extends Factory<JsTypeProvider> { }
  public abstract class Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default extends Factory<JsTypeEventObserver> { }
  public abstract class Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<EventProvider> { }
  public abstract class ContextualProvider_factory__j_e_i_Instance__quals__Universal extends Factory<Instance> { }
  public abstract class JsType_factory__c_s_b_g_c_f_Config__quals__Universal extends Factory<Config> { }
  public abstract class ExtensionProvided_factory__c_g_g_u_c_u_Anchor__quals__j_e_i_Any_j_e_i_Default extends Factory<Anchor> { }
  public abstract class Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default extends Factory<WindowEventObservers> { }
  public abstract class Type_factory__o_j_e_u_n_c_l_NavigationPanelProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<NavigationPanelProvider> { }
  public abstract class JsType_factory__o_j_e_i_c_JsArray__quals__Universal extends Factory<JsArray> { }
  public abstract class Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<CallerProvider> { }
  public abstract class Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default extends Factory<RequestDispatcher> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<StateChangeImpl> { }
  public abstract class Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<TranslationServiceProvider> { }
  public abstract class Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default extends Factory<LocaleSelector> { }
  public abstract class Type_factory__o_j_e_i_c_l_i_CreationImpl__quals__j_e_i_Any_j_e_i_Default extends Factory<CreationImpl> { }
  public abstract class Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default extends Factory<ListComponentProvider> { }
  public abstract class JsType_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__Universal extends Factory<JsTypeEventObserver> { }
  public abstract class Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default extends Factory<SyncBeanManager> { }
  public abstract class Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default extends Factory<TranslationService> { }
  private void registerFactories0(final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context) {
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<URLPatternMatcher>) GWT.create(Producer_factory__o_j_e_u_n_c_l_URLPatternMatcher__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Page>) GWT.create(Type_factory__c_s_b_g_c_Page__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LifecycleListenerRegistrarImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_LifecycleListenerRegistrarImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<NavigationPanel>) GWT.create(Provider_factory__o_j_e_u_n_c_l_NavigationPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FieldPage>) GWT.create(Type_factory__c_s_b_g_c_FieldPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLElement>) GWT.create(ContextualProvider_factory__o_j_e_c_c_d_HTMLElement__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Caller>) GWT.create(ContextualProvider_factory__o_j_e_c_c_a_Caller__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ClientMessageBus>) GWT.create(Producer_factory__o_j_e_b_c_a_ClientMessageBus__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TransitionAnchorFactory>) GWT.create(ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchorFactory__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Disposer>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_Disposer__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListComponent>) GWT.create(ContextualProvider_factory__o_j_e_d_c_c_ListComponent__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TransitionToRole>) GWT.create(ContextualProvider_factory__o_j_e_u_n_c_l_TransitionToRole__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<App>) GWT.create(Type_factory__c_s_b_g_c_App__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Document>) GWT.create(Producer_factory__o_j_e_c_c_d_Document__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ManagedInstance>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_ManagedInstance__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Button>) GWT.create(ExtensionProvided_factory__c_g_g_u_c_u_Button__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<MainPage>) GWT.create(Type_factory__c_s_b_g_c_MainPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Event>) GWT.create(ContextualProvider_factory__j_e_e_Event__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DataBinder>) GWT.create(ContextualProvider_factory__o_j_e_d_c_a_DataBinder__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<InitBallot>) GWT.create(ContextualProvider_factory__o_j_e_i_c_a_InitBallot__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SpanElement>) GWT.create(ExtensionProvided_factory__c_g_g_d_c_SpanElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RootPanelProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_RootPanelProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NavigationGraph>) GWT.create(Producer_factory__o_j_e_u_n_c_l_s_NavigationGraph__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Logger>) GWT.create(ExtensionProvided_factory__o_s_Logger__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Main>) GWT.create(Type_factory__c_s_b_g_c_Main__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ListWidgetProvider>) GWT.create(Type_factory__o_j_e_u_c_w_ListWidgetProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<BatchCaller>) GWT.create(Provider_factory__o_j_e_c_c_a_BatchCaller__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<URLPatternMatcherProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_URLPatternMatcherProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HeadingElement>) GWT.create(ExtensionProvided_factory__c_g_g_d_c_HeadingElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TransitionAnchor>) GWT.create(ContextualProvider_factory__o_j_e_u_n_c_l_TransitionAnchor__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<Navigation>) GWT.create(Type_factory__o_j_e_u_n_c_l_Navigation__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<ServerTemplateProvider>) GWT.create(Type_factory__o_j_e_u_s_ServerTemplateProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<BatchCallerProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_BatchCallerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TransitionToRoleProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_TransitionToRoleProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Set>) GWT.create(JsType_factory__j_u_Set__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<IOCBeanManagerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_IOCBeanManagerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TransitionAnchorFactoryProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_TransitionAnchorFactoryProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<RequestDispatcherProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_RequestDispatcherProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SimplePanel>) GWT.create(ExtensionProvided_factory__c_g_g_u_c_u_SimplePanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<AccessImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_AccessImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Changed>) GWT.create(Type_factory__c_s_b_g_c_s_Changed__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TransitionTo>) GWT.create(ContextualProvider_factory__o_j_e_u_n_c_l_TransitionTo__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DisposerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_DisposerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<MessageBusProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_MessageBusProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<SenderProvider>) GWT.create(Type_factory__o_j_e_i_s_b_c_SenderProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Map>) GWT.create(JsType_factory__j_u_Map__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ManagedInstanceProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_ManagedInstanceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<List>) GWT.create(JsType_factory__j_u_List__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DivElement>) GWT.create(ExtensionProvided_factory__c_g_g_d_c_DivElement__quals__j_e_i_Any_j_e_i_Default_j_i_Named.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<HTMLElementProvider>) GWT.create(Type_factory__o_j_e_u_c_l_p_HTMLElementProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RootPanel>) GWT.create(Provider_factory__c_g_g_u_c_u_RootPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListWidget>) GWT.create(ContextualProvider_factory__o_j_e_u_c_w_ListWidget__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<DestructionImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_DestructionImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<InstanceProvider>) GWT.create(Type_factory__o_j_e_e_c_c_InstanceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<HistoryTokenFactory>) GWT.create(Type_factory__o_j_e_u_n_c_l_HistoryTokenFactory__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<VerticalPanel>) GWT.create(ExtensionProvided_factory__c_g_g_u_c_u_VerticalPanel__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WindowEventObservers>) GWT.create(JsType_factory__o_j_e_e_c_c_WindowEventObservers__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<FindPage>) GWT.create(Type_factory__c_s_b_g_c_FindPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<InitBallotProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_InitBallotProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Sender>) GWT.create(ContextualProvider_factory__o_j_e_i_s_b_c_Sender__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<LocaleListBox>) GWT.create(Type_factory__o_j_e_u_c_w_LocaleListBox__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Changed>) GWT.create(JsType_factory__c_s_b_g_c_s_Changed__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Collection>) GWT.create(JsType_factory__j_u_Collection__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Config>) GWT.create(Type_factory__c_s_b_g_c_f_Config__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ProfilePage>) GWT.create(Type_factory__c_s_b_g_c_ProfilePage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<DataBinderProvider>) GWT.create(Type_factory__o_j_e_d_c_DataBinderProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<PageTransitionProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_PageTransitionProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TransitionAnchorProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_TransitionAnchorProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<OauthCallbackPage>) GWT.create(Type_factory__c_s_b_g_c_OauthCallbackPage__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeProvider>) GWT.create(JsType_factory__o_j_e_i_c_c_JsTypeProvider__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeEventObserver>) GWT.create(Type_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<EventProvider>) GWT.create(Type_factory__o_j_e_e_c_c_EventProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Instance>) GWT.create(ContextualProvider_factory__j_e_i_Instance__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Config>) GWT.create(JsType_factory__c_s_b_g_c_f_Config__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<Anchor>) GWT.create(ExtensionProvided_factory__c_g_g_u_c_u_Anchor__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<WindowEventObservers>) GWT.create(Type_factory__o_j_e_e_c_c_WindowEventObservers__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<NavigationPanelProvider>) GWT.create(Type_factory__o_j_e_u_n_c_l_NavigationPanelProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsArray>) GWT.create(JsType_factory__o_j_e_i_c_JsArray__quals__Universal.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<CallerProvider>) GWT.create(Type_factory__o_j_e_i_c_a_b_CallerProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<RequestDispatcher>) GWT.create(Provider_factory__o_j_e_b_c_a_m_RequestDispatcher__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<StateChangeImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_StateChangeImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<TranslationServiceProvider>) GWT.create(Type_factory__o_j_e_u_c_l_s_TranslationServiceProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_ApplicationScopedContext_context.registerFactory((Factory<LocaleSelector>) GWT.create(Type_factory__o_j_e_u_c_w_LocaleSelector__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<CreationImpl>) GWT.create(Type_factory__o_j_e_i_c_l_i_CreationImpl__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<ListComponentProvider>) GWT.create(Type_factory__o_j_e_d_c_ListComponentProvider__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<JsTypeEventObserver>) GWT.create(JsType_factory__o_j_e_e_c_c_JsTypeEventObserver__quals__Universal.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<SyncBeanManager>) GWT.create(Producer_factory__o_j_e_i_c_c_SyncBeanManager__quals__j_e_i_Any_j_e_i_Default.class));
    org_jboss_errai_ioc_client_container_DependentScopeContext_context.registerFactory((Factory<TranslationService>) GWT.create(Provider_factory__o_j_e_u_c_l_s_TranslationService__quals__j_e_i_Any_j_e_i_Default.class));
  }

  private void registerFactories(final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context) {
    registerFactories0(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, org_jboss_errai_ioc_client_container_DependentScopeContext_context);
  }

  // The main IOC bootstrap method.
  public ContextManager bootstrapContainer() {
    final Context org_jboss_errai_ioc_client_container_ApplicationScopedContext_context = new ApplicationScopedContext();
    final Context org_jboss_errai_ioc_client_container_DependentScopeContext_context = new DependentScopeContext();
    logger.debug("Registering factories with contexts.");
    long start = System.currentTimeMillis();
    registerFactories(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context, org_jboss_errai_ioc_client_container_DependentScopeContext_context);
    logger.debug("Registered 88 factories in {}ms", System.currentTimeMillis() - start);
    logger.debug("Adding contexts to context manager...");
    start = System.currentTimeMillis();
    contextManager.addContext(org_jboss_errai_ioc_client_container_ApplicationScopedContext_context);
    contextManager.addContext(org_jboss_errai_ioc_client_container_DependentScopeContext_context);
    logger.debug("Added 2 contexts in {}ms", System.currentTimeMillis() - start);
    logger.debug("Calling finishInit on ContextManager");
    start = System.currentTimeMillis();
    contextManager.finishInit();
    logger.debug("ContextManager#finishInit ran in {}ms", System.currentTimeMillis() - start);
    return contextManager;
  }
}