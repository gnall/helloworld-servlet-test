package com.shotechnology.base.gwterraigae.client.firebase;

public class FirebaseImpl 
{
	private static Firebase firebase;

	public static void initializeFirebase()
	{
		Config firebaseConfig = new Config();
		firebaseConfig.setApiKey("AIzaSyBHw638MUKXjZIUTZO_146nxtYpmwDhWpY");
		firebaseConfig.setAuthDomain("sho-sandbox-flex.firebaseapp.com");
		firebaseConfig.setDatabaseURL("https://sho-sandbox-flex.firebaseio.com");
		firebaseConfig.setStorageBucket("sho-sandbox-flex.appspot.com");
		firebaseConfig.setMessagingSenderId("930764944572");
		firebaseConfig.setProjectId("sho-sandbox-flex");
		
		firebase = Firebase.initializeApp(firebaseConfig);
	}
	
	public static Firebase getFirebase() {
		return firebase;
	}

	public static void setFirebase(Firebase firebase) {
		FirebaseImpl.firebase = firebase;
	}
}
