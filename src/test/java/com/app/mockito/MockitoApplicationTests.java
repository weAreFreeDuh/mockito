package com.app.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class MockitoApplicationTests {

	@Mock
	DataService dataServiceMock;

	@InjectMocks	//Mock에 Injection 주입
	SomeBusinessImpl business;

	@Test
	void test() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25, 5, 3});
		assertEquals(25, business.findTheGreatestFromAllData());
	}

}
