package com.arca.acquiringswitch.endpoints;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;
import com.arca.framework.data.services.ConversionService;
import com.arca.acquiringswitch.data.entities.AcquiringSwitch;
import com.arca.acquiringswitch.models.SAAcquiringSwitch;
import com.arca.acquiringswitch.services.AcquiringSwitchService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AcquiringSwitchEndpointTest {

    @Mock
    private AcquiringSwitchService acquiringSwitchService;
    @Mock
    private ConversionService conversionService;
    @InjectMocks
    private AcquiringSwitchEndpoint underTest;

    @Test
    public void doAcquiringSwitch() {
        SAAcquiringSwitch saAcquiringSwitch = new SAAcquiringSwitch();
        SAAcquiringSwitch expectedAcquiringSwitch = new SAAcquiringSwitch();
        AcquiringSwitch acquiringSwitch = new AcquiringSwitch();
        when(conversionService.convert(saAcquiringSwitch, AcquiringSwitch.class)).thenReturn(acquiringSwitch);
        when(acquiringSwitchService.doAcquiringSwitch(acquiringSwitch)).thenReturn(acquiringSwitch);
        when(conversionService.convert(acquiringSwitch, SAAcquiringSwitch.class)).thenReturn(expectedAcquiringSwitch);

        ResponseEntity<SAAcquiringSwitch> response = underTest.doAcquiringSwitch(saAcquiringSwitch);
        assertThat(expectedAcquiringSwitch).isEqualTo(response.getBody());
        assertThat(200).isEqualTo(response.getStatusCode().value());
    }


    @Test
    public void doAcquiringSwitchGet() {
        ResponseEntity<SAAcquiringSwitch> response = underTest.doAcquiringSwitchGet();
        assertThat(response.getBody()).isNotNull();
        assertThat(200).isEqualTo(response.getStatusCode().value());
    }
}
