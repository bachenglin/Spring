/*
package eureka.demo;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

@EnableBinding(Source.class)
public class TollPublisher {
	@InboundChannelAdapter(channel = Source.OUTPUT)
	public String sendTollCharge() {
		return "{station:\"20\", customerid:\"100\", timestamp: \"2019-11-09-12T03:15:00\"}";
	}
}*/

package eureka.demo;

import java.util.Random;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;

//@EnableBinding(Source.class)
@EnableBinding(TollSource.class)
public class TollPublisher {

	Random random = new Random();

	@Bean
	@InboundChannelAdapter(channel = "fastpassTollChannel", poller = @Poller(fixedDelay = "2000"))
	public MessageSource<Toll> sendTollCharge() {
		return () -> MessageBuilder.withPayload(new Toll("20", "100", "2019-11-09T12:04:00"))
				.setHeader("speed", random.nextInt(8) * 10).build();
	}

	/*
	 * @InboundChannelAdapter(channel = Source.OUTPUT) public String
	 * sendTollCharge() { return "{station:\"20\", customerid:\"100\",
	 * timestamp:\"2019-11-09-12T03:15:00\"}"; }
	 */
	/*@Bean
	@InboundChannelAdapter(channel = "fastpassTollChannel", poller = @Poller(fixedDelay = "2000"))
	public MessageSource<Toll> sendTollCharge() {
		return () -> MessageBuilder.withPayload(new Toll("20", "100", "2019-11-09T12:04:00")).build();
	}
*/
	class Toll {
		public String stationId;
		public String customerId;
		public String timestamp;

		public Toll(String stationId, String customerId, String timestamp) {
			this.stationId = stationId;
			this.customerId = customerId;
			this.timestamp = timestamp;

		}
	}
}
