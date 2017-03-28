/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SudokuTesterPackage;

import SudokuPackage.Sudoku;
import org.junit.*;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author Bert
 */
public class SudokuTester {
    
    public SudokuTester() {
    }
    
    @Test
    public void TestSudokuCreation() {
        Sudoku s = new Sudoku();
        
        Assert.assertNotNull(s);
    }
    
    @Test
    public void testPlus(){
        Sudoku s = new Sudoku();
        int a = 5;
        int b = 6;
        assertEquals(a+b,s.plus(a,b));
    }
    
   

}
