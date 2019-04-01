package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainControllerImpl mockito_controller;
    TrainUser mockito_user;
    TrainSensorImpl trainsensor;

    @Before
    public void before() {
        // TODO Add initializations
        TrainSystem system = new TrainSystem();
        mockito_controller = mock(TrainController.class);
        mockito_user = mock(TrainUser.class);
        trainsensor = new TrainSensorImpl(mockito_user,mockito_controller);
    }

    @Test
    public void TestBelowAbsMin() {
        // TODO Delete this and add test cases based on the issues
        trainsensor.overrideSpeedLimit(-10);
        verify(mockito_user).setAlarmState(true);
    }

    @Test
    public void TestOverAbsMax() {
        // TODO Delete this and add test cases based on the issues
        trainsensor.overrideSpeedLimit(200);
        verify(mockito_user).setAlarmState(true);
    }

    @Test
    public void TestOverRelMax() {
        // TODO Delete this and add test cases based on the issues
        trainsensor.overrideSpeedLimit(mockito_controller.getReferenceSpeed()*2.1);
        verify(mockito_user).setAlarmState(true);
    }

    @Test
    public void TestBetweenMinMax() {
        // TODO Delete this and add test cases based on the issues
        trainsensor.overrideSpeedLimit(50);
        if (mockito_controller.getReferenceSpeed()*2 < 50) {

            verify(mockito_user).setAlarmState(true);
        }
        else {
            verify(mockito_user).setAlarmState(false);
        }

    }


    @Test
    public void ThisIsAnExampleTestStub() {
        // TODO Delete this and add test cases based on the issues
    }
}
