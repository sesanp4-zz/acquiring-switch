package com.arca.acquiringswitch.services;

import com.arca.framework.dataweb.services.CRUDService;
import com.arca.acquiringswitch.data.entities.AcquiringSwitch;


public interface AcquiringSwitchService extends CRUDService<AcquiringSwitch> {

    AcquiringSwitch doAcquiringSwitch(AcquiringSwitch acquiringSwitch);

}
