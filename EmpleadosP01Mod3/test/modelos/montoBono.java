/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import cl.duoc.BussEmpleado;
import cl.duoc.Empleado;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author endga
 */
public class montoBono {

    public montoBono() {
    }
    
    
   @Test
    public void testmontoBono(){
        System.out.println("montoBono");
        String rut ="44444444";
        BussEmpleado instance = new BussEmpleado();
        
        Empleado emp  = instance.Buscar(rut);
        Assert.assertTrue(emp.montoBono()== 400.000);
        
    }
    
    
}
