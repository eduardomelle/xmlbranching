/**
 * 
 */
package guru.learningjournal.examples.kafka.xmlbranching.bindings;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;

import guru.learningjournal.examples.kafka.model.Order;

/**
 * 
 */
public interface OrderListenerBinding {

	@Input("xml-input-channel")
	KStream<String, String> xmlInputStream();

	@Output("india-orders-channel")
	KStream<String, Order> indiaOutputStream();

	@Output("abroud-orders-channel")
	KStream<String, Order> abroudOutputStream();

}
