package com.app.account;

import com.jk.util.JKObjectUtil;
import com.jk.web.services.client.JKMatureServiceClient;

public class ServiceClient extends JKMatureServiceClient<Model>{

	@Override
	public String getServiceUrlPropertyName() {
		return "app.services.account.url";
	}

}
