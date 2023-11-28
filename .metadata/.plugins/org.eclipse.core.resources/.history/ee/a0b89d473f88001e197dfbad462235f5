package com.app.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.facade.CurrencyExchangeProxy;
import com.app.model.CalculatedAmount;

@RestController
public class CurrencyCalculationController {
	
	@Autowired
	private CurrencyExchangeProxy proxy;
	
	
	// old code
	/*@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CalculatedAmount calculatedamount(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<CalculatedAmount> response = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",
				CalculatedAmount.class,uriVariables);				
				
		CalculatedAmount calculateAmount = response.getBody();
		
		return new CalculatedAmount(calculateAmount.getId(),calculateAmount.getFrom(),
				calculateAmount.getTo(), calculateAmount.getCoversionMultiple(),
				quantity,quantity.multiply(calculateAmount.getCoversionMultiple()),
				calculateAmount.getPort());
	}*/
	
	
	// using feign
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CalculatedAmount calculatedAmountFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
	
	    CalculatedAmount calculateAmount = proxy.retriveExchangaeValue(from, to);
		
		return new CalculatedAmount(calculateAmount.getId(),calculateAmount.getFrom(),
				calculateAmount.getTo(), calculateAmount.getCoversionMultiple(),
				quantity,quantity.multiply(calculateAmount.getCoversionMultiple()),
				calculateAmount.getPort());
	}
		
				

}
