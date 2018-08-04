/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylibrary;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author huang
 */
public class RingBufferTest {
    
    public RingBufferTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testRingBuffer() {
        BufferInterface buffer=new RingBuffer(10);
        buffer.push(1);
        assertEquals(buffer.peek(),1);
        assertEquals(buffer.size(),1);
        
        buffer.push('C');
        assertEquals(buffer.peek(),1);
        assertEquals(buffer.size(),2);
        
        buffer.push("abc");
        assertEquals(buffer.peek(),1);
        assertEquals(buffer.size(),3);
        
        Object o=buffer.pop();
        assertEquals(o,1);
        assertEquals(buffer.size(),2);
        
        o=buffer.pop();
        assertEquals(o,'C');
        assertEquals(buffer.size(),1);
        
        o=buffer.pop();
        assertEquals(o,"abc");
        assertEquals(buffer.size(),0);
    }
    
    @Test
    public void testMyStack() {
        BufferInterface buffer=new MyStack(10);
        buffer.push(1);
        assertEquals(buffer.peek(),1);
        assertEquals(buffer.size(),1);
        
        buffer.push('C');
        assertEquals(buffer.peek(),'C');
        assertEquals(buffer.size(),2);
        
        buffer.push("abc");
        assertEquals(buffer.peek(),"abc");
        assertEquals(buffer.size(),3);
        
        Object o=buffer.pop();
        assertEquals(o,"abc");
        assertEquals(buffer.size(),2);
        
        o=buffer.pop();
        assertEquals(o,'C');
        assertEquals(buffer.size(),1);
        
        o=buffer.pop();
        assertEquals(o,1);
        assertEquals(buffer.size(),0);
    }
}
