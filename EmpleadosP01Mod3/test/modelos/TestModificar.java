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
public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        Empleado emp =new Empleado("181664691","jaime" ,27,2);
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(emp);
        boolean esperado = true;
        emp =new Empleado("181664691","Rodrigo" ,21,3);
        boolean obtenido = instance.Modificar(emp);
        Assert.assertEquals(esperado, obtenido);
        
    }
    
    
}
