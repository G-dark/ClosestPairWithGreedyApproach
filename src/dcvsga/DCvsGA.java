/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcvsga;

import java.util.List;
import models.Tester;
import models.Vertex;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Ricardo
 */
public class DCvsGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       //Test test = new Test();
       Result result = JUnitCore.runClasses(Testing.class);
       for(Failure fail: result.getFailures()){
           
           System.out.println(fail.toString());
       }
       
        System.out.println("Result == " + result.wasSuccessful());
       
//        Tester tester = new Tester();
//        int N = 16;
//        List<Vertex> dataset = tester.generateDataSet(N);
//
//        String strdataset = tester.toString(dataset);
//
//        assertEquals(N, dataset.size());
//
//        System.out.println("This is the set of points:" + strdataset);

    }
}
