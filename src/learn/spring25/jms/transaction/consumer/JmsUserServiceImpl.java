package learn.spring25.jms.transaction.consumer;

import java.util.List;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;

import learn.spring25.Document;
import learn.spring25.UserService;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.transaction.annotation.Transactional;

public class JmsUserServiceImpl implements UserService {
	
	@Transactional
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
	public boolean loginUser(String username, String password) {
		return processNextMessage();
	}

	public void registerUser(String username) {
		processNextMessage();
	}

	public List<Document> searchDocuments(String name) {
		processNextMessage();
		return null;
	}
}