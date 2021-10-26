/**
 * 
 */
package com.aburgos.projectspringdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aburgos.projectspringdesktop.dao.DisqueraDAO;

/**
 * @author Alexis
 *
 */
class SpringDesktotTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		assertNotNull(context);
		
		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAO");
		
		assertNotNull(disqueraDAO);
		
		System.out.println("Contexto cargado exitósamente!");
		System.out.println(disqueraDAO);
		
		// :::::::::::::::PROPERTIES:::::::::::
		
		Properties properties = (Properties) context.getBean("properties");
		
		System.out.println(properties.get("spring-username"));
	}

}
