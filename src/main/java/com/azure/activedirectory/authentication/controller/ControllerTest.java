/*package com.azure.activedirectory.authentication.controller;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.microsoft.aad.adal4j.AuthenticationContext;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.microsoft.aad.adal4j.ClientCredential;
import com.nimbusds.jwt.JWT;

public class ControllerTest {
	 public static void main(String srgs[])
	    {
		 
		 
		 String authorityUri = "https://login.windows.net/common/oauth2/authorize";  
		  AuthenticationContext authContext = new AuthenticationContext(authorityUri);  
		  
		  AuthenticationResult token = authContext.AcquireToken(resourceUri, clientId, new Uri(redirectUri), PromptBehavior.RefreshSession);
		  
	        String authority ="https://login.windows.net/common/oauth2/authorize";
	        String tenant = "venuamanchaoutlook.onmicrosoft.com" ;


	        AuthenticationContext context = null;
	        AuthenticationResult result = null;
	        ExecutorService service = null;
	        try {
	            service = Executors.newFixedThreadPool(1);
	              context = new AuthenticationContext(authority + tenant + "/", true,
	                    service);
	            Future<AuthenticationResult> future = context.acquireToken(
	                    "https://graph.windows.net", new ClientCredential("prasadbolla@venuamanchaoutlook.onmicrosoft.com",
	                    "Anitha@143"), null);
	            result = future.get();
	            
	            String tenantId ="32161c04-7d4b-4c08-9016-fb826fed8909";
				context = new AuthenticationContext("https://login.microsoftonline.com/" + tenantId , false, service);
	            String clientId="8418ad51-113c-49dd-9b5b-be264b5d8eec";
				String clientSecret="h-_xfS9yifq6I_aZdLfD.aIoi1fzqtI5";
				// TODO: add your client id and client secret
	            ClientCredential cred = new ClientCredential(clientId, clientSecret);
	            Future<AuthenticationResult> future = context.acquireToken("https://management.azure.com/", cred, null);
	            result = future.get();
	            
	            
	            service = Executors.newFixedThreadPool(1);
	            context = new AuthenticationContext(authority, false, service);
	            Future<AuthenticationResult> future = context.acquireToken(
	                "https://graph.windows.net", "32161c04-7d4b-4c08-9016-fb826fed8909", "prasadbolla@venuamanchaoutlook.onmicrosoft.com", "Anitha@143",
	                null);
	            result = future.get();
	            System.out.println("Access Token - " + result.getAccessToken());
	            System.out.println("Refresh Token - " + result.getRefreshToken());
	            System.out.println("ID Token - " + result.getIdToken());
	            
	            
	            
	        } catch (Exception e) {
	             e.getCause();
	        } finally {
	            service.shutdown();
	        }


	    }
	 
	 
	 private static AuthenticationResult getAccessTokenFromUserCredentials(String username, String password, String 
			 AUTHORITY, String CLIENT_ID) throws Exception {
			     AuthenticationContext context = null;
			     AuthenticationResult result = null;
			     ExecutorService service = null;
			     try {
			         service = Executors.newFixedThreadPool(1);
			         context = new AuthenticationContext(AUTHORITY, false, service);
			         Future<AuthenticationResult> future = context.acquireToken(
			                 "https://graph.windows.net", CLIENT_ID, username, password,
			                 null);
			         result = future.get();
			     } finally {
			         service.shutdown();
			     }

			     if (result == null) {
			         System.out.println("ex)");
			     }
			     return result;
			 }

			 public void azureAuthenticate(String authority, String clientID, String username, String password){
			     AuthenticationResult result = null;
			     try {
			         result = getAccessTokenFromUserCredentials(username, password, authority, clientID);
			      //   DecodedJWT accessToken = JWT.decode(result.getAccessToken());
			         //Want to verify the validity of this access token
			     } catch (Exception ex) {
			         ex.printStackTrace();
			     }

			 }
}
*/