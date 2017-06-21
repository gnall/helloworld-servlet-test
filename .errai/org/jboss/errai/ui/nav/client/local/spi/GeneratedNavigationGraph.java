package org.jboss.errai.ui.nav.client.local.spi;

import com.shotechnology.base.gwterraigae.client.FieldPage;
import com.shotechnology.base.gwterraigae.client.FindPage;
import com.shotechnology.base.gwterraigae.client.MainPage;
import com.shotechnology.base.gwterraigae.client.OauthCallbackPage;
import com.shotechnology.base.gwterraigae.client.Page;
import com.shotechnology.base.gwterraigae.client.ProfilePage;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.jboss.errai.common.client.PageRequest;
import org.jboss.errai.common.client.util.CreationalCallback;
import org.jboss.errai.enterprise.client.cdi.api.CDI;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.HistoryToken;
import org.jboss.errai.ui.nav.client.local.api.NavigationControl;
import org.jboss.errai.ui.nav.client.shared.NavigationEvent;

public class GeneratedNavigationGraph extends NavigationGraph { public GeneratedNavigationGraph() {
    final PageNode defaultPage = new PageNode<MainPage>() {
      public String name() {
        return "MainPage";
      }

      public String toString() {
        return "MainPage";
      }

      public String getURL() {
        return "main";
      }

      public Class contentType() {
        return MainPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(MainPage.class).getInstance(callback);
      }

      public void pageHiding(MainPage widget, NavigationControl control) {
        control.proceed();
      }

      public void pageHidden(MainPage widget) {

      }

      public void pageShowing(MainPage widget, HistoryToken state, NavigationControl control) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("MainPage", pageState)));
        control.proceed();
      }

      public void pageShown(MainPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
      }

      public void destroy(MainPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("", defaultPage);
    pagesByRole.put(DefaultPage.class, defaultPage);
    final PageNode mainPage = defaultPage;
    pagesByName.put("MainPage", mainPage);
    final PageNode oauthCallbackPage = new PageNode<OauthCallbackPage>() {
      public String name() {
        return "OauthCallbackPage";
      }

      public String toString() {
        return "OauthCallbackPage";
      }

      public String getURL() {
        return "callback";
      }

      public Class contentType() {
        return OauthCallbackPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(OauthCallbackPage.class).getInstance(callback);
      }

      public void pageHiding(OauthCallbackPage widget, NavigationControl control) {
        control.proceed();
      }

      public void pageHidden(OauthCallbackPage widget) {

      }

      public void pageShowing(OauthCallbackPage widget, HistoryToken state, NavigationControl control) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("OauthCallbackPage", pageState)));
        control.proceed();
      }

      public native void Page_onPageShown(Page instance) /*-{
        instance.@com.shotechnology.base.gwterraigae.client.Page::onPageShown()();
      }-*/;

      public void pageShown(OauthCallbackPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        Page_onPageShown(widget);
      }

      public void destroy(OauthCallbackPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("OauthCallbackPage", oauthCallbackPage);
    final PageNode findPage = new PageNode<FindPage>() {
      public String name() {
        return "FindPage";
      }

      public String toString() {
        return "FindPage";
      }

      public String getURL() {
        return "find";
      }

      public Class contentType() {
        return FindPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(FindPage.class).getInstance(callback);
      }

      public void pageHiding(FindPage widget, NavigationControl control) {
        control.proceed();
      }

      public void pageHidden(FindPage widget) {

      }

      public void pageShowing(FindPage widget, HistoryToken state, NavigationControl control) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("FindPage", pageState)));
        control.proceed();
      }

      public native void Page_onPageShown(Page instance) /*-{
        instance.@com.shotechnology.base.gwterraigae.client.Page::onPageShown()();
      }-*/;

      public void pageShown(FindPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        Page_onPageShown(widget);
      }

      public void destroy(FindPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("FindPage", findPage);
    final PageNode profilePage = new PageNode<ProfilePage>() {
      public String name() {
        return "ProfilePage";
      }

      public String toString() {
        return "ProfilePage";
      }

      public String getURL() {
        return "profile";
      }

      public Class contentType() {
        return ProfilePage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(ProfilePage.class).getInstance(callback);
      }

      public void pageHiding(ProfilePage widget, NavigationControl control) {
        control.proceed();
      }

      public void pageHidden(ProfilePage widget) {

      }

      public void pageShowing(ProfilePage widget, HistoryToken state, NavigationControl control) {
        final Map pageState = new HashMap() {
          {

          }
        };
        CDI.fireEvent(new NavigationEvent(new PageRequest("ProfilePage", pageState)));
        control.proceed();
      }

      public native void Page_onPageShown(Page instance) /*-{
        instance.@com.shotechnology.base.gwterraigae.client.Page::onPageShown()();
      }-*/;

      public void pageShown(ProfilePage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        Page_onPageShown(widget);
      }

      public void destroy(ProfilePage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("ProfilePage", profilePage);
    final PageNode fieldPage = new PageNode<FieldPage>() {
      public String name() {
        return "FieldPage";
      }

      public String toString() {
        return "FieldPage";
      }

      public String getURL() {
        return "field/{fieldId}";
      }

      public Class contentType() {
        return FieldPage.class;
      }

      public void produceContent(CreationalCallback callback) {
        bm.lookupBean(FieldPage.class).getInstance(callback);
      }

      public void pageHiding(FieldPage widget, NavigationControl control) {
        control.proceed();
      }

      public void pageHidden(FieldPage widget) {

      }

      native void FieldPage_int_fieldId(FieldPage instance, int value) /*-{
        instance.@com.shotechnology.base.gwterraigae.client.FieldPage::fieldId = value;
      }-*/;

      public void pageShowing(FieldPage widget, HistoryToken state, NavigationControl control) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("fieldId");
        if ((fv0 == null) || fv0.isEmpty()) {
          FieldPage_int_fieldId(widget, (int) 0);
        } else {
          FieldPage_int_fieldId(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("fieldId", fv0.iterator().next());
        }
        CDI.fireEvent(new NavigationEvent(new PageRequest("FieldPage", pageState)));
        control.proceed();
      }

      public native void Page_onPageShown(Page instance) /*-{
        instance.@com.shotechnology.base.gwterraigae.client.Page::onPageShown()();
      }-*/;

      public void pageShown(FieldPage widget, HistoryToken state) {
        final Map pageState = new HashMap() {
          {

          }
        };
        final Collection fv0 = state.getState().get("fieldId");
        if ((fv0 == null) || fv0.isEmpty()) {
          FieldPage_int_fieldId(widget, (int) 0);
        } else {
          FieldPage_int_fieldId(widget, Integer.valueOf((String) fv0.iterator().next()));
          pageState.put("fieldId", fv0.iterator().next());
        }
        Page_onPageShown(widget);
      }

      public void destroy(FieldPage widget) {
        bm.destroyBean(widget);
      }
    };
    pagesByName.put("FieldPage", fieldPage);
  }

}