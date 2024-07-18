package com.example.helloworld;

import static org.mockito.Mockito.*;
import java.io.PrintWriter;

import javax.servlet.http.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class HelloWorldServletTest {

    @Mock
    private HttpServletResponse response;

    private HelloWorldServlet servlet;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        servlet = new HelloWorldServlet();
    }

    @Test
    public void testDoGet() throws Exception {
        when(response.getWriter()).thenReturn(new PrintWriter(System.out));
        // Simulate a GET request
        servlet.doGet(null, response);
        // Verify interactions and assertions
    }

    @Test
    public void testDoGetWithCustomMessage() throws Exception {
        when(response.getWriter()).thenReturn(new PrintWriter(System.out));
        // Simulate a GET request with custom message
        servlet.doGet(null, response);
        // Verify interactions and assertions
    }

    @Test
    public void testDoGetWithNullMessage() throws Exception {
        when(response.getWriter()).thenReturn(new PrintWriter(System.out));
        // Simulate a GET request with null message
        servlet.doGet(null, response);
        // Verify interactions and assertions
    }
}
