/**
 * 
 */
package guru.learningjournal.examples.kafka.xmlbranching.configs;

import java.util.Collections;
import java.util.Map;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.springframework.stereotype.Service;

import guru.learningjournal.examples.kafka.xmlbranching.model.OrderEnvelop;
import io.confluent.kafka.streams.serdes.json.KafkaJsonSchemaSerde;

/**
 * 
 */
@Service
public class AppSerdes extends Serdes {

	private final static String SCHEMA_REGISTRY_URL = "http://localhost:8081";

	private final static Map<String, String> SERDE_CONFIG = Collections.singletonMap("schema.registry.url",
			SCHEMA_REGISTRY_URL);

	public static Serde<OrderEnvelop> orderEnvelop() {
		final Serde<OrderEnvelop> specificJsonSerde = new KafkaJsonSchemaSerde<OrderEnvelop>();
		specificJsonSerde.configure(SERDE_CONFIG, false);
		return specificJsonSerde;
	}

}
