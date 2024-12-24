/**
 * 
 */
package guru.learningjournal.examples.kafka.xmlbranching.model;

import guru.learningjournal.examples.kafka.model.Order;
import lombok.Data;

/**
 * 
 */
@Data
public class OrderEnvelop {

	private String xmlOrderKey;
	private String xmlOrderValue;

	private String orderTag;
	private Order validOrder;

}
