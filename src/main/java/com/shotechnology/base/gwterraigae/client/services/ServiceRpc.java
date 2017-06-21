package com.shotechnology.base.gwterraigae.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.util.PhonegapUtil;
import com.shotechnology.base.gwterraigae.shared.SharedConstants;

public class ServiceRpc 
{
	private static GameServiceAsync gameService;
	
	public static void init(PhoneGap phoneGap)
	{
		gameService = GWT.create(GameService.class);
		
		if (phoneGap.isPhoneGapDevice())
		{
			PhonegapUtil.prepareService((ServiceDefTarget) gameService, 
					SharedConstants.SERVICES_URL, SharedConstants.GAME_SERVICE);
		}
	}

	public static GameServiceAsync getGameService() {
		return gameService;
	}
}