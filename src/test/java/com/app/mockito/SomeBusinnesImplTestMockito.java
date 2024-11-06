package com.app.mockito;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinnesImplTestMockito {

    @Test
    void test() {
        //given
        DataService dataServiceMock = mock(DataService.class);
        // dataServiceMock.retrieveAllData() => new int[] {25, 5, 3};
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 5, 3});

        //when
        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);
        int result = business.findTheGreatestFromAllData();

        //result
        System.out.println(result);
        assertEquals(25, result);
    }

}
