package com.example.MetroV2_1;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
@ComponentScan
public class Configuracion extends WsConfigurerAdapter{
	
	@Bean
	public XsdSchema metroSchema() {
		return new SimpleXsdSchema(new ClassPathResource("MetroV2_1.xsd"));
	}
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext){
		  MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		  servlet.setApplicationContext(applicationContext);
		  servlet.setTransformWsdlLocations(true);
		  return new ServletRegistrationBean(servlet, "/ws/*");
	}
	  @Bean(name = "MetroV2_1")
	  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema metroSchema)
	  {
		  DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		  wsdl11Definition.setPortTypeName("MetroPort");
		  wsdl11Definition.setLocationUri("/ws/MetroV2_1");
		  wsdl11Definition.setTargetNamespace("http://www.uvMetro.me/MetroV2_1");
		  wsdl11Definition.setSchema(metroSchema);
		  return wsdl11Definition;
	  }

}
