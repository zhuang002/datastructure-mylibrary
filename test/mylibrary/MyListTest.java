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
public class MyListTest {
    
    public MyListTest() {
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
    public void testMyChainList() {
        MyList list=new MyChainList();
        list.add(1);
        list.add(2);
        assertEquals(list.size(),2);
        assertEquals(1,list.get(0));
        assertEquals(2,list.get(1));
        list.remove(0);
        assertEquals(list.size(),1);
        assertEquals(list.get(1),null);
        assertEquals(list.get(0),1);
                
    }
}
