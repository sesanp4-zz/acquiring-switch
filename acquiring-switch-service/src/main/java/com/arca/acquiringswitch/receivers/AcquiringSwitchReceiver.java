package com.arca.acquiringswitch.receivers;

import com.arca.framework.messaging.annotations.QueueListener;
import com.arca.framework.messaging.events.acquiringswitch.AcquiringSwitchEvent;
import com.arca.framework.messaging.receivers.MessageReceiver;
import com.arca.framework.messaging.services.MessagingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
@QueueListener(value = "com.arca.framework.messaging.events.acquiringswitch.AcquiringSwitchEvent")
public class AcquiringSwitchReceiver implements MessageReceiver<AcquiringSwitchEvent> {

    private Logger LOGGER = LoggerFactory.getLogger(AcquiringSwitchReceiver.class);

    @Autowired
    private MessagingService messagingService;


    @Override
    public void process(final AcquiringSwitchEvent message){
        LOGGER.info("Received an event of type [{}]", message);
        messagingService.broadcast(new AcquiringSwitchEvent());
    }

}
