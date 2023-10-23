/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphisimdemo;

import java.util.logging.Logger;

/**
 *
 * @author murat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmailLogger logger = new EmailLogger();
        DatabaseLogger databaseLogger = new DatabaseLogger();
        logger.Log("");
        databaseLogger.Log("Database access control");
        // TODO code application logic here
    }

}
