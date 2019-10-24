package com.modular.monolith.product;

import org.springframework.stereotype.Component;

@Component
class ProtectedComponent {

	public void doSomething() {
		System.out.println("call ProtectedComponent.doSomething()");;
	}
	
}
