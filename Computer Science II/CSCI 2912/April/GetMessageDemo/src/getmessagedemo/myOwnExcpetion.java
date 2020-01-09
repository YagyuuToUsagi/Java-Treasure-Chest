/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmessagedemo;

/**
 *
 * @author brianaranda
 */
class myOwnException extends Exception {

    public myOwnException(String message) {
        super("My Own Exception: "+message);
    }
    
}
