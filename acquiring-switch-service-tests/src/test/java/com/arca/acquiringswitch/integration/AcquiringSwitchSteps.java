package com.arca.acquiringswitch.integration;


import com.arca.framework.messaging.services.MessagingService;
import com.arca.framework.testing.integration.configs.TestConfig;
import com.arca.framework.testing.integration.services.MacroService;
import cucumber.api.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;

import java.io.IOException;

@ContextConfiguration(classes = TestConfig.class, loader = SpringBootContextLoader.class)
public class AcquiringSwitchSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(AcquiringSwitchSteps.class);

    @Autowired
    private MessagingService messagingService;

    @Autowired
    private MacroService macroService;

    @Value("${test.messages.wait.timeout:2000}")
    private int timeoutTime;
    @Value("${test.messages.poll:100}")
    private int pollTime;

    @Given("^this step does nothing$")
    public void noOp() throws Throwable {
        // This class needs at least 1 method for it to work properly.

    }







}
