package com.shotechnology.base.gwterraigae.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.shotechnology.base.gwterraigae.client.Game;

public interface GameServiceAsync 
{
	void getGames(AsyncCallback<List<Game>> callback);
	
	void getGame(Integer gameId, AsyncCallback<Game> callback);
	
	void payGame(String token, String email, AsyncCallback<Void> callback);
}