package com.arca.acquiringswitch.configs;

import com.arca.framework.common.services.CorrelationService;
import com.arca.framework.common.utils.FrameworkConstants;
import com.arca.framework.messaging.services.MessagingService;
import com.arca.framework.web.rest.api.invoker.ClientEndpoint;
import com.arca.framework.web.utils.CreateBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Add here any beans required to interact over REST-HTTP(S) to other micro-services
 *
 */
@Configuration
public class EndpointsConfig {

    @Autowired
    private CorrelationService correlationService;

    @Autowired
    private MessagingService messagingService;

    @Value("${endpoints.debug:false}")
    private boolean endpointsDebug;

    @Value("${endpoints.internalCommsPort:8080}")
    private int internalCommsPort;

    @Value("${clients.api.max.connections:64}")
    private int clientApiMaxConnections;

    @Value("${clients.api.max.inactive:5000}")
    private int clientApiMaxInactive;

    private <T extends ClientEndpoint> T init(final String serviceName, Class<T> apiClientClass) {
        return CreateBeanUtils.createBean(serviceName, apiClientClass, correlationService, messagingService, endpointsDebug, internalCommsPort, clientApiMaxConnections, clientApiMaxInactive);
    }

}

