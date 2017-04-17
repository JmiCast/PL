
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
class plp3 {
    public static void main(String[] args) {
    //if (args.length == 1){
        try {
            RandomAccessFile entrada = new RandomAccessFile("/home/ara65/Escritorio/PL/P3/plp3/test/testSemantico.txt"/*args[0]*/,"r");
            AnalizadorLexico al = new AnalizadorLexico(entrada);
            TraductorDR tdr = new TraductorDR(al);
            String trad = tdr.S(); // simbolo inicial de la gramatica
            tdr.comprobarFinFichero();
            System.out.println(trad);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error, fichero no encontrado: " + args[0]);
        }
    /*}
        else System.out.println("Error, uso: java plp3 <nomfichero>");*/
    }
}
