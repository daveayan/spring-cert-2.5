package learn.spring25.jms.jmsgatewaysupport.consumer;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;

import org.springframework.jms.core.support.JmsGatewaySupport;

public class JmsUserServiceImpl extends JmsGatewaySupport {

	public boolean processNextMessage() {
		MapMessage m = (MapMessage) getJmsTemplate().receive(destination);
		if (m == null) {
			System.out.println("No messages " + this);
			return false;
		}
		try {
			System.out.println("Got Message !!! " + m.getString("username") + " : " + this);
		} catch (JMSException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	private Destination destination;
}