/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.math.BigDecimal;

/**
 *
 * @author Computer Science
 */
public class Divider implements DivideInterface {
    
    DividerAdapter dividerAdapter;
     public BigDecimal  Big_decimal_divide(BigDecimal num1,BigDecimal num2)
     {
         
         return num1/num2;
     }

   
    
}
