/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author endga
 */
public class BussEmpleadoIT {
    
    public BussEmpleadoIT() {
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

    /**
     * Test of Listar method, of class BussEmpleado.
     */
    @Test
    public void testListar() {
        System.out.println("Listar");
        BussEmpleado instance = new BussEmpleado();
        List<Empleado> expResult = null;
        List<Empleado> result = instance.Listar();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Buscar method, of class BussEmpleado.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "";
        BussEmpleado instance = new BussEmpleado();
        Empleado expResult = null;
        Empleado result = instance.Buscar(rut);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Crear method, of class BussEmpleado.
     */
    @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado obj = null;
        BussEmpleado instance = new BussEmpleado();
        boolean expResult = false;
        boolean result = instance.Crear(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Modificar method, of class BussEmpleado.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Empleado obj = null;
        BussEmpleado instance = new BussEmpleado();
        boolean expResult = false;
        boolean result = instance.Modificar(obj);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Eliminar method, of class BussEmpleado.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String rut = "";
        BussEmpleado instance = new BussEmpleado();
        boolean expResult = false;
        boolean result = instance.Eliminar(rut);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of montoBono method, of class BussEmpleado.
     */
    @Test
    public void testMontoBono() {
        System.out.println("montoBono");
        BussEmpleado instance = new BussEmpleado();
        List<Empleado> expResult = null;
        List<Empleado> result = instance.montoBono();
        assertEquals(expResult, result);
        
    }
    
}
