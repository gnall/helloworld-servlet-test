package com.shotechnology.base.gwterraigae.client.services;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.shotechnology.base.gwterraigae.client.Game;
import com.shotechnology.base.gwterraigae.shared.SharedConstants;

@RemoteServiceRelativePath(SharedConstants.GAME_SERVICE)
public interface GameService extends RemoteService 
{
	List<Game> getGames();
	
	Game getGame(Integer gameId);
	
	void payGame(String token, String email);
}