package com.arca.acquiringswitch.receivers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import com.arca.framework.messaging.events.acquiringswitch.AcquiringSwitchEvent;
import com.arca.framework.messaging.services.MessagingService;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class AcquiringSwitchReceiverTest {

    @Mock
    private MessagingService messagingService;
    @InjectMocks
    private AcquiringSwitchReceiver underTest;


    @Test
    public void process(){
        underTest.process(new AcquiringSwitchEvent());
        verify(messagingService).broadcast(isA(AcquiringSwitchEvent.class));
    }

}
