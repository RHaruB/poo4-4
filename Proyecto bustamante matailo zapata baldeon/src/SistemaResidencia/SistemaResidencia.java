package SistemaResidencia;
/*
Luis Bustamante: menu, clase abstracta
Gabriel Zapata: clases: registro de casas y Residencia
Alexander Matailo: clases: vistaAdmiinnistrador, interface
*/
import java.util.Scanner;
import Registros.Casa;
import Registros.Persona;
import Registros.Vivienda;
import Registros.Casa;
import Registros.Servicios;

public class SistemaResidencia {

    public static void main(String[] args) {
        
        System.out.println("SISTEMA DE REGISTRO DE URBANIZACION");
        int op = 0;
        int op2 = 0;
        int op3 = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. ADMINISTRADOR");
        System.out.println("2. USUARIO");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                Administrador();

            case 2:
                             

        }
    }
    public static void Administrador(){
        System.out.println("ADMINISTRADOR");
        int op = 0;
        //quiero llamar al metodo registro de cada clase
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Registrar");
        System.out.println("2. Consultar");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                Registrar();
            case 2:
                Consultas();
                             

        }
    }
    public static void Registrar(){
        System.out.println("REGISTROS");
        int op = 0;
        //quiero llamar al metodo registro de cada clase
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Vivienda");
        System.out.println("2. Persona");
        System.out.println("3. Carro");
        System.out.println("4. Area recreativa");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                

            case 2:
                             

        }
    }
    public static void Consultas(){
        System.out.println("CONSULTAS");
        int op = 0;
        //quiero llamar al metodo registro de cada clase
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Propietario de vivenda");
        System.out.println("2. Persona1 Copropietarios al día");
        System.out.println("3. Consulta de impagos.");
        System.out.println("4. Consulta vehículos visitantes a residente");
        System.out.println("5. Consulta de personas reservadoras de áreas recreativas\"");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                

            case 2:
                             

        }
    }

}
