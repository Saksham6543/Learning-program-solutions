package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Mock the API
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub its method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Use the mock in the service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Step 4: Assert the result
        assertEquals("Mock Data", result);
    }

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Use the mock in service
        MyService service = new MyService(mockApi);
        service.fetchData(); // This should call mockApi.getData()

        // Step 3: Verify that it was called
        verify(mockApi).getData(); // If not called, test fails
    }

}
