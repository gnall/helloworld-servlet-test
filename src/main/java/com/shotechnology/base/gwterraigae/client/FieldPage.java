package com.shotechnology.base.gwterraigae.client;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.errai.ui.nav.client.local.PageState;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.HeadingElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.dom.client.Style.Visibility;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.shotechnology.base.gwterraigae.client.firebase.FirebaseImpl;
import com.shotechnology.base.gwterraigae.client.firebase.auth.Auth;
import com.shotechnology.base.gwterraigae.client.firebase.auth.Messaging;
import com.shotechnology.base.gwterraigae.client.services.ServiceRpc;
import com.shotechnology.base.gwterraigae.client.stripe.Element;
import com.shotechnology.base.gwterraigae.client.stripe.Elements;
import com.shotechnology.base.gwterraigae.client.stripe.JSON;
import com.shotechnology.base.gwterraigae.client.stripe.Stripe;
import com.shotechnology.base.gwterraigae.client.stripe.Style;
import com.shotechnology.base.gwterraigae.client.stripe.TokenCard;
import com.shotechnology.base.gwterraigae.client.stripe.Error;
import com.shotechnology.base.gwterraigae.client.stripe.Fn.Arg;

@Templated
@org.jboss.errai.ui.nav.client.local.Page(path = "field/{fieldId}")
public class FieldPage extends Page 
{
	@PageState
	private int fieldId;
	
	@Inject @DataField @Named("h1") HeadingElement fieldName;
	@Inject @DataField SpanElement location, capacity, coach;
	@Inject @DataField DivElement payment;
	
	@Inject
    @DataField
    DivElement stripePanel, gamePanel;
	
	@Inject
    @DataField
    Button submitButton;
	
    @Override
    public void onPostConstruct() 
    {
        super.onPostConstruct();
             
        setId("field-page");
    }
    
    @Override
    public void onPageShown()
    {
    	super.onPageShown();
    	    	
    	gamePanel.getStyle().setVisibility(Visibility.VISIBLE);
    	stripePanel.getStyle().setVisibility(Visibility.HIDDEN);

        ServiceRpc.getGameService().getGame(this.fieldId, new AsyncCallback<Game>()
		{
			@Override
			public void onSuccess(Game game) 
			{
		    	capacity.setInnerText("17 / 41 attending");
		    	coach.setInnerText(game.getCoachName());
		    	fieldName.setInnerText(game.getFieldName());
		    	location.setInnerText(game.getLocation());
			}
        	
			@Override
			public void onFailure(Throwable error) {
				GWT.log(error.getMessage());
			}

		});
    }
    
    Stripe stripe;
    
    @EventHandler("payment")
    public void onPaymentClicked(ClickEvent event)
    {
    	Style style = new Style();
    	style.getBase().setColor("#FF0000");
    	style.getBase().setFontSize("100");
    	this.stripe = new Stripe("pk_test_vJ7zF6rZkRjlnrayJUGPCUS6");
    	
    	GWT.log("stripe: " + JSON.stringify(this.stripe));
    	
    	Elements elements = this.stripe.elements();
    	
    	GWT.log("elements: " + JSON.stringify(elements));
    	
    	Element card = elements.create("card");
    	
    	GWT.log("card: " + JSON.stringify(card));
    	
    	GWT.log("style: " + JSON.stringify(style));
    	
    	card.mount("#card-element");
    	
    	gamePanel.getStyle().setVisibility(Visibility.HIDDEN);
    	stripePanel.getStyle().setVisibility(Visibility.VISIBLE);
    	
    	this.submitButton.addClickHandler(new ClickHandler()
		{
			@Override
			public void onClick(ClickEvent event) 
			{
				Arg<TokenCard> onResolve = new Arg<TokenCard>()
				{
					@Override
					public void e(TokenCard token) 
					{
						GWT.log("token.getId(): " + token.getToken().getId());
						GWT.log("token.getObject(): " + token.getToken().getObject());
						GWT.log("token.getClient_ip(): " + token.getToken().getClient_ip());
						GWT.log("token.getType(): " + token.getToken().getType());
						GWT.log("token.getUsed(): " + token.getToken().getUsed());
						GWT.log("token.getCreated(): " + token.getToken().getCreated());
						GWT.log("token.getLivemode(): " + token.getToken().getLivemode());
						GWT.log("getAddressZip(): " + token.getToken().getCard().getAddress_zip());
						GWT.log(JSON.stringify(token));
						
						ServiceRpc.getGameService().payGame(token.getToken().getId(), "jason.washo@gmail.com", new AsyncCallback<Void>()
						{
							@Override
							public void onFailure(Throwable caught) {
								// TODO Auto-generated method stub
								
							}

							@Override
							public void onSuccess(Void result) {
								// TODO Auto-generated method stub
								
							}
						});
					}
				};
				
				Arg<Error> onError = new Arg<Error>()
				{

					@Override
					public void e(Error error) {
						GWT.log(error.getMessage());
					}
				};
				
				
		    	stripe.createToken(card).then(onResolve, onError);
		    	
		    	
		    	
//		    	.katch(new Arg<Error>()
//				{
//					@Override
//					public void e(Error error) 
//					{
//						GWT.log(error.getMessage());
//					}
//				})
			}
		});
    	

    }
    
        
}