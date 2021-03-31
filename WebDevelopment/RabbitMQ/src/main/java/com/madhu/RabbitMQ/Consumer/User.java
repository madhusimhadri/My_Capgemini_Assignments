/*package com.madhu.RabbitMQ.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.madhu.RabbitMQ.Config.MessagingConfig;
import com.madhu.RabbitMQ.Dto.OrderStatus;

@Component
public class User {
	
	@RabbitListener(queues= MessagingConfig.QUEUE)
	public void consumeMessageFromQueue(OrderStatus orderStatus)
	{
		System.out.println("Message received from queue " +orderStatus);
	}

}
*/
