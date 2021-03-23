package com.example.springretry;

import com.example.springretry.test.MyServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	/*@Autowired
	BackendAdapter backendAdapter;*/

	@Autowired
	MyServiceFactory myServiceFactory;

	/*@GetMapping("/retry")
	@ExceptionHandler({ Exception.class })
	public String validateSPringRetryCapability(@RequestParam(required = false) boolean simulateretry,
			@RequestParam(required = false) boolean simulateretryfallback) {
		System.out.println("===============================");
		System.out.println("Inside RestController mathod..");
		return backendAdapter.getBackendResponse(simulateretry, simulateretryfallback);
	}*/

	@GetMapping("/factory")
	public String factory() {
		System.out.println("Inside factory mathod..");
		return MyServiceFactory.getService("two").getType();
	}
}
