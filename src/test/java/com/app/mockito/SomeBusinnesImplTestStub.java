package com.app.mockito;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinnesImplTestStub {

    @Test
    void test() {
        //given
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceStub);

        //when
        int result = business.findTheGreatestFromAllData();

        //result
        System.out.println(result);
        assertEquals(25, result);
    }

    @Test
    void test2() {
        //given
        DataServiceStub2 dataServiceStub = new DataServiceStub2();
        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceStub);

        //when
        int result = business.findTheGreatestFromAllData();

        //result
        System.out.println(result);
        assertEquals(33, result);
    }
}

class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {25, 5, 3};
    }
}

class DataServiceStub2 implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {33, 15, 3};
    }
}

