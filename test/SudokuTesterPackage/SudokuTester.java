/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SudokuTesterPackage;

import SudokuPackage.Sudoku;
import org.junit.*;
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
    
   

}
