package com.arca.framework.messaging.events.acquiringswitch;

import com.arca.framework.messaging.events.Event;

public class AcquiringSwitchEvent extends Event {


    public AcquiringSwitchEvent(){
        super(Level.AUDIT_IN_TRANSACTION_ONLY);
    }

}
