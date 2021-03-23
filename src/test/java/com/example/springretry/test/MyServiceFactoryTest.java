package com.example.springretry.test;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { MyServiceFactory.class,  MyServiceOne.class,
MyServiceTwo.class, MyServiceThree.class})
//@SpringBootTest
public class MyServiceFactoryTest {

    /*@Mock
    MyServiceOne myServiceOne;
    @Mock
    MyServiceTwo myServiceTwo;
    @Mock
    MyServiceThree myServiceThree;
    @Spy
    List<MyService> services = new ArrayList<>();




    @InjectMocks
    MyServiceFactory myServiceFactory;*/


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        /*services.add(myServiceOne);
        services.add(myServiceTwo);
        services.add(myServiceThree);*/
    }
    @Test
    public void test() {
        //when(services.get(anyInt())).thenReturn(myServiceOne);
        String type = MyServiceFactory.getService("one").getType();
        System.out.println("****"+type);
    }

}