package learn.spring25.jms.jmstemplate.producer;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import learn.spring25.WsUserDao;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class JmsWsUserDao extends WsUserDao {
	public void registerUser(final String username) {
		jmsTemplate.send(destination, new MessageCreator() {
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
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	private Destination destination;
	private JmsTemplate jmsTemplate;
}
