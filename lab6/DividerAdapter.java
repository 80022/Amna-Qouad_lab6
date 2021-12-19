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
public class DividerAdapter implements DivideInterface{
    MultiplyInterface multiplyInterface;
    String operator;
    public BigDecimal Big_decimal_divide(BigDecimal num1,BigDecimal num2)
    {
       if(operator=="*")
          return  multiplyInterface.Big_decimal_multiply(num1,num2);
       else
           return num1/num2;
    }
    
}
