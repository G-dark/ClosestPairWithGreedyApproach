package dcvsga;




import java.util.HashSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;


import java.util.List;
import models.Graph;
import models.Tester;
import models.Vertex;
import org.junit.Test;
public class Testing {
    
    public Testing() {
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
    // The methods must be annotated with annotation @Testing. For example:
    //
    
    @Test
    public void testCreationOfDataset() {
    
        Tester tester = new Tester();
        
        int  N = 32;
        
        List<Vertex> dataset= tester.generateDataSet(N);
        String strdataset = tester.toString(dataset);
        
        assertEquals(N,dataset.size());
        
        
        System.out.println("This is the set of points:" +  strdataset);
    
    }
    
    @Test
    public void testPrim(){
    
         Tester tester = new Tester();
        
        int  N = 32;
        
        List<Vertex> dataset= tester.generateDataSet(N);
        String strdataset = tester.toString(dataset);
        
        System.out.println("This is the set of points:" +  strdataset);
        
        Graph graph = new Graph();
        
        graph.vertices.addAll(dataset);
        
        
        int choice = (int) (Math.random()*10 + 1), counter = 0;
        MST = graph.applyPRIM(,counter);
        
    
    
    }
    
    
    
    
}
