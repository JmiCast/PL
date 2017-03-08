
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author REYES ALBILLAR, ALEJANDRO <ara65@alu.ua.es>
 * <el_reyes_95@hotmmail.com> <el.reyes.95@gmail.com>
 */
class plp1 {
    public static void main(String[] args) {
    if (args.length == 1){
        try {
            RandomAccessFile entrada = new RandomAccessFile(/*"/home/ara65/Escritorio/PL/plp1/src/testSintactico.txt"*/args[0],"r");
            AnalizadorLexico al = new AnalizadorLexico(entrada);
            AnalizadorSintacticoDR asdr = new AnalizadorSintacticoDR(al);
            asdr.S(); // simbolo inicial de la gramatica
            asdr.comprobarFinFichero();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error, fichero no encontrado: " + args[0]);
        }
    }
        else System.out.println("Error, uso: java plp1 <nomfichero>");
    }
}