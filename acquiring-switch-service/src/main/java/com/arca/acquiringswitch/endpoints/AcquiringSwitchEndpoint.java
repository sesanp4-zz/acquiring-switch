package com.arca.acquiringswitch.endpoints;

import com.arca.framework.data.services.ConversionService;
import com.arca.framework.web.exceptions.WebServiceExceptionCode;
import com.arca.framework.web.utils.WebValidationUtils;
import com.arca.acquiringswitch.api.AcquiringSwitchApiService;
import com.arca.acquiringswitch.data.entities.AcquiringSwitch;
import com.arca.acquiringswitch.models.SAAcquiringSwitch;
import com.arca.acquiringswitch.services.AcquiringSwitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Objects;

import static org.springframework.http.ResponseEntity.ok;

@Component
public class AcquiringSwitchEndpoint implements AcquiringSwitchApiService {

    @Autowired
    private AcquiringSwitchService acquiringSwitchService;
    @Autowired
    private ConversionService conversionService;

    @Override
    public ResponseEntity<SAAcquiringSwitch> doAcquiringSwitch(final SAAcquiringSwitch acquiringSwitch) {
        WebValidationUtils.validateNotNull(acquiringSwitch, "AcquiringSwitch");

        return ok(conversionService.convert(
                acquiringSwitchService.doAcquiringSwitch(
                        conversionService.convert(acquiringSwitch, AcquiringSwitch.class)),
                SAAcquiringSwitch.class));
    }


    @Override
    public ResponseEntity<SAAcquiringSwitch> doAcquiringSwitchGet() {

        SAAcquiringSwitch sa = new SAAcquiringSwitch();
        sa.setId("This is the id");
        sa.setDescription("This is the description");
        return ok(sa);
    }
}
