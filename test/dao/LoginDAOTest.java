/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import modelo.Login;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author godinho
 */
public class LoginDAOTest {
    
    public LoginDAOTest() {
    }

    /**
     * Test of VerificaLogin method, of class LoginDAO.
     */
    @Test
    public void testVerificaLogin() throws Exception {
        System.out.println("Testando método VerificaLogin");
        Login l = new Login();
        l.setNome("Mario");
        l.setSenha("mario");
        LoginDAO instance = new LoginDAO();
        int expResult = 1;
        int result = instance.VerificaLogin(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
