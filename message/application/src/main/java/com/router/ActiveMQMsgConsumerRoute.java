package com.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMsgConsumerRoute extends RouteBuilder {
	
    @Override
    public void configure() throws Exception {
    	
    	
		
		  from("activemq:sendqueue").log("${body}")
		  .to("log:received-message-from-active-mq").to("activemq:receivequeue");
		 
        
        from("timer:test?period=60000").log("${body}")
        .to("log:received-message-from-active-mq");
        
        
    }
    
    
}


