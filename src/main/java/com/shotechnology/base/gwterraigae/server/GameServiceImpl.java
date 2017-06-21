package com.shotechnology.base.gwterraigae.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.shotechnology.base.gwterraigae.client.Game;
import com.shotechnology.base.gwterraigae.client.services.GameService;
import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.RateLimitException;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.Customer;

public class GameServiceImpl extends RemoteServiceServlet implements GameService 
{
	private static final long serialVersionUID = 4782196019260207910L;

	private static final Logger log = Logger.getLogger(GameServiceImpl.class.getName());
	
	@Override
	public List<Game> getGames() 
	{
		List<Game> gameList = new ArrayList<Game>();
		
		Game game1 = new Game(1, "Weston Field", "Scranton, PA", "Today 3:00pm", "B. Reid", "color-secondary-2-0-bg");
		Game game2 = new Game(2, "Fitzpatrick Field", "Scranton, PA", "July 15 4:15pm", "C. Wileage", "color-complement-1-bg");
		Game game3 = new Game(3, "South Side Complex", "Scranton, PA", "July 17 4:15pm", "J. Washo", "color-secondary-1-2-bg");
		
		gameList.add(game1);
		gameList.add(game2);
		gameList.add(game3);
		
		return gameList;	
	}

	@Override
	public Game getGame(Integer gameId) 
	{
		// TODO: This is where we will lookup the Game in database
		switch (gameId)
		{
			case 1:
				return new Game(1, "Weston Field", "Scranton, PA", "Today 3:00pm", "B. Reid", "color-secondary-2-0-bg");
			
			case 2:
				return new Game(2, "Fitzpatrick Field", "Scranton, PA", "July 15 4:15pm", "C. Wileage", "color-complement-1-bg");

			case 3:
				return new Game(3, "South Side Complex", "Scranton, PA", "July 17 4:15pm", "J. Washo", "color-secondary-1-2-bg");
		
			default:
				return new Game();
		}
	}

	@Override
	public void payGame(String token, String email) 
	{
		Stripe.apiKey = "sk_test_ZCq7cKO0W4muydfgLSve9isW";
		
		Customer customer = new Customer();
		
		Map<String, Object> customerParams = new HashMap<String, Object>();
		customerParams.put("email", "jason.washo@gmail.com");
		customerParams.put("source", token);
		try{customer = Customer.create(customerParams);}
		catch (CardException e) {System.out.println("Status is: " + e.getCode());System.out.println("Message is: " + e.getMessage());} 
		catch (RateLimitException e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());} 
		catch (InvalidRequestException e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());}
		catch (AuthenticationException e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());}
		catch (APIConnectionException e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());}
		catch (StripeException e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());}
		catch (Exception e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());}
		
		/*
		 * Creating a charger against a customer's id
		 */
		
		Map<String, Object> chargeParams = new HashMap<String, Object>();
		chargeParams.put("amount", 500);
		chargeParams.put("currency", "usd");
		chargeParams.put("description", "Charge for joe.gnall@example.com");
		chargeParams.put("customer", customer.getId());
		
		Map<String, String> initialMetadata = new HashMap<String, String>();
		initialMetadata.put("user_id", "1");
		initialMetadata.put("orderNumber", "1");
		chargeParams.put("metadata", initialMetadata);
		
		// ^ obtained with Stripe.js
		try{Charge.create(chargeParams);}
		catch (CardException e) {System.out.println("Status is: " + e.getCode());System.out.println("Message is: " + e.getMessage());} 
		catch (RateLimitException e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());} 
		catch (InvalidRequestException e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());}
		catch (AuthenticationException e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());}
		catch (APIConnectionException e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());}
		catch (StripeException e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());}
		catch (Exception e) {System.out.println("Status is: " + e.toString());System.out.println("Message is: " + e.getMessage());}
		
		log.info(customer.getId());		
	}
	
	
}