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
public class TestCrear {

    public TestCrear() {
    }
    @Test
    public void testCrear(){
        System.out.println("Crear");
        Empleado emp =new Empleado("181664691","jaime" ,27,2);
        BussEmpleado instance = new BussEmpleado();
        boolean esperado = true;
        boolean obtenido = instance.Crear(emp);
        Assert.assertEquals(esperado, obtenido);
        //Assert.assertTrue(instance.subTotal(venta)==20000);
        
    }
    
    
    
    
}
