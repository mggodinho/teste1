/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author godinho
 */
public class ConectaBancoTest {
    
    public ConectaBancoTest() {
    }

    /**
     * Test of getConexao method, of class ConectaBanco.
     */
    @Test
    public void testGetConexao() throws SQLException, ClassNotFoundException {
        System.out.println("Testando método getConexao");
        // Connection expResult = null;
        Connection result = ConectaBanco.getConexao();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
