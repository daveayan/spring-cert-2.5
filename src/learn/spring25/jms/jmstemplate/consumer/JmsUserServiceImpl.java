package learn.spring25.jms.jmstemplate.consumer;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;

import learn.spring25.UserServiceImpl;

import org.springframework.jms.core.JmsTemplate;

public class JmsUserServiceImpl extends UserServiceImpl {

	public boolean processNextMessage() {
		MapMessage m = (MapMessage) jmsTemplate.receive(destination);
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
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	private Destination destination;
	private JmsTemplate jmsTemplate;
}