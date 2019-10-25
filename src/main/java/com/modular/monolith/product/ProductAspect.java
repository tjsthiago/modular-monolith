package com.modular.monolith.product;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
class ProductAspect {

	@Before("execution(* com.modular.monolith.product.ProductServiceImpl.*(..))")
	public void doSomethingWithAspectOnProductServiceImpl(JoinPoint joinPoint) {
		System.out.println("ProductAspect.doSomethingWithAspectOnProductServiceImpl()");
	}
	
}
