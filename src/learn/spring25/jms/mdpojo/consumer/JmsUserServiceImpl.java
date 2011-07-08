package learn.spring25.jms.mdpojo.consumer;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

public class JmsUserServiceImpl implements MessageListener {
	
	public void onMessage(Message arg0) {
		MapMessage m = (MapMessage) arg0;
		try {
			System.out.println("Got Message !!! " + m.getString("username") + " : " + this);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}