package com.arca.acquiringswitch.services.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import com.arca.framework.data.services.ConversionService;
import com.arca.framework.common.exceptions.SystemException;
import com.arca.framework.common.exceptions.SystemExceptionCode;
import com.arca.acquiringswitch.data.entities.AcquiringSwitch;
import com.arca.framework.messaging.services.MessagingService;
import com.arca.framework.dataweb.services.impl.AbstractCRUDServiceImpl;

import java.lang.reflect.Method;

import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class AcquiringSwitchServiceImplTest {

    @Mock
    private ConversionService conversionService;
    @Mock
    private MessagingService messagingService;
    @InjectMocks
    private AcquiringSwitchServiceImpl underTest;


    @Test
    public void process(){
        disablePersistence(underTest);
        underTest.doAcquiringSwitch(new AcquiringSwitch());
    }


  public static void disablePersistence(AbstractCRUDServiceImpl service) {
      try{
          Method setDisablePersistence = service.getClass().getSuperclass().getDeclaredMethod("setDisablePersistence", boolean.class);
          setDisablePersistence.setAccessible(true);
          setDisablePersistence.invoke(service, true);
      } catch (ReflectiveOperationException roex) {
          throw new SystemException(roex.getMessage(), roex, SystemExceptionCode.INCONSISTENT_BACKEND_CODE);
      }
  }
}
