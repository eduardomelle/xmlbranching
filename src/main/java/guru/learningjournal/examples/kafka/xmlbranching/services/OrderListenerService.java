/**
 * 
 */
package guru.learningjournal.examples.kafka.xmlbranching.services;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import guru.learningjournal.examples.kafka.model.Order;
import guru.learningjournal.examples.kafka.xmlbranching.bindings.OrderListenerBinding;
import lombok.extern.log4j.Log4j2;

/**
 * 
 */
@Service
@Log4j2
@EnableBinding(OrderListenerBinding.class)
public class OrderListenerService {

	@Value("${application.configs.error.topic.name}")
	private String ERROR_TOPIC;

	@StreamListener("xml-input-channel")
	@SendTo({ "india-orders-channel", "abroad-orders-channel" })
	public KStream<String, Order> process(KStream<String, String> input) {
		return null;
	}

}
