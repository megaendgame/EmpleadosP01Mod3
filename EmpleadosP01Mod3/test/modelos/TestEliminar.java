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
public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String rut ="181664691";
        Empleado emp =new Empleado("181664691","jaime" ,27,2);
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(emp);
        boolean esperado = true;
        boolean obtenido = instance.Eliminar(rut);
        Assert.assertEquals(esperado, obtenido);
        
    }
    
}
