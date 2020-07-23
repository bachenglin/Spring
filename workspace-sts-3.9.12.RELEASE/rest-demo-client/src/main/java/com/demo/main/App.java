package com.demo.main;

import com.demo.model.Product;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class App {
	
	Product product;
	ClientConfig clientConfig;
	Client client;
	WebResource webResource;
	ClientResponse clientResponse;
	
	public App() throws Exception {
		
		product = new Product(4, "Carom Board", 75.00);
		
		clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		client = Client.create(clientConfig);
		
		webResource = client.resource("http://localhost:8080/rest-demo/rest/products/create");
		
		clientResponse = webResource.accept("application/json").type("application/json").post(ClientResponse.class, product);
		
		if(clientResponse.getStatus() != 201) {
			throw new RuntimeException("Failed: HTTP Error code : " + clientResponse.getStatus());
		}
		
		String output = clientResponse.getEntity(String.class);
		System.out.println("RESPONSE FROM API...");
		System.out.println(output);
		//System.out.println(output.replace('\\', '\u0000'));
		
	}

	public static void main(String[] args) {
		
		try {
			new App();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
