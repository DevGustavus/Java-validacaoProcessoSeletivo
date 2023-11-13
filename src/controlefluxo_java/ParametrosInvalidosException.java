/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlefluxo_java;

/**
 *
 * @author gusta
 */
public class ParametrosInvalidosException extends Exception{
    
    public ParametrosInvalidosException() {
        super("O segundo parametro deve ser maior que o primeiro");
    }
}
