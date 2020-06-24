package com.project.loginservice.service;

import java.util.List;

import com.project.loginservice.pojo.BuyerSignupPojo;
import com.project.loginservice.pojo.SellerSignupPojo;

public interface BuyerSignupService {
	
		BuyerSignupPojo validateBuyer(BuyerSignupPojo buyerSignupPojo);

		BuyerSignupPojo getBuyer(int buyerId);
		
		List<SellerSignupPojo> getSeller();
		
}
