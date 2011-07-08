package learn.spring25.jms.jmsgatewaysupport.producer;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.core.support.JmsGatewaySupport;

public class JmsWsUserDao extends JmsGatewaySupport {
	public void registerUser(final String username) {
		getJmsTemplate().send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				MapMessage message = session.createMapMessage();
				message.setString("username", username);
				return message;
			}			
		});
	}
	
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	private Destination destination;
}
