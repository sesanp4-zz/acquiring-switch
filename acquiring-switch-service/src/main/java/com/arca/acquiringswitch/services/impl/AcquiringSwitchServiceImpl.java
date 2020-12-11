package com.arca.acquiringswitch.services.impl;

import com.arca.framework.dataweb.services.impl.AbstractCRUDServiceImpl;
import com.arca.acquiringswitch.data.entities.AcquiringSwitch;
import com.arca.acquiringswitch.services.AcquiringSwitchService;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class AcquiringSwitchServiceImpl extends AbstractCRUDServiceImpl<AcquiringSwitch> implements AcquiringSwitchService {

    private Logger LOGGER = LoggerFactory.getLogger(AcquiringSwitchServiceImpl.class);

    @Override
    public AcquiringSwitch doAcquiringSwitch(AcquiringSwitch acquiringSwitch) {
        LOGGER.info("Calling doAcquiringSwitch: [{}]", acquiringSwitch.getId());
        return super.create(acquiringSwitch);
    }


}
