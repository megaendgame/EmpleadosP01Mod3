/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import cl.duoc.BussEmpleado;
import cl.duoc.Empleado;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author endga
 */
public class TestBuscar {

    public TestBuscar() {
    }
    
    @Test
    public void testBuscar(){
        System.out.println("Buscar");
        String rut = "44444444";
        BussEmpleado instance = new BussEmpleado();
        Empleado obtenido = instance.Buscar(rut);
        Assert.assertEquals(obtenido.getRut(), rut);
    }
}
