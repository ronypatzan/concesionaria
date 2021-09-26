/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionaria;
import java.util.Scanner;      

/**
 *
 * @author usuario
 */
public class Concesionaria {

    
     int opc_a = 0;
        int opc_b = 0;
        public int gama = 0;
        private int acumulado = 0, precio_gama = 0;
        String amenidades;
        public String gamma = "";
        String ame = "";
        int tipo_amenidad = 0, tipo_transmision =0;
    public static void main(String[] args) {
        
        {
        Concesionaria llamado = new Concesionaria();
        llamado.menu_principal();
    }
    
    /*
     *
     */
    public void menu_principal()
    {
        Concesionaria llamado = new Concesionaria();
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("----------------------------------");
        System.out.println("-     CONCESIONARIO DE AUTOS     -");
        System.out.println("-       - MENU PRINCIPAL  -      -");
        System.out.println("----------------------------------");
        
        System.out.println(" 1.- Seleccionar Automóvil ");
        System.out.println(" 2.- Salir ");
        
        System.out.println(" Ingrese la opción que desea ejecutar: ");
        opc_a = entrada.nextInt();
        
        if(opc_a == 1)
        {
            llamado.seleccion_vehiculo();
            
        }
        System.out.println(" End... ");
    }
    
    public void seleccion_vehiculo()
    {
        Concesionaria llamado_1 = new Concesionaria();
        Scanner entrada = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
            System.out.println(" ----------------------------------------");
            System.out.println("          CONCESIONARIO DE AUTOS         ");
            System.out.println("      SELECCION DE GAMA DE VEHICULO      ");
            System.out.println(" ----------------------------------------");
            System.out.println(" 01.- Sedan Económico           18,940.00");
            System.out.println(" 02.- Sedán                     23,570.00");
            System.out.println(" 03.- Deportivo                 24,100.00");
            System.out.println(" 04.- Híbrido                   25,100.00");
            System.out.println(" 05.- Coupe                     19,350.00");
            System.out.println(" 06.- Coupe Deportivo           24,100.00");
            System.out.println(" 07.- Compacto                  16,190.00");
            System.out.println(" 08.- Hatchback                 20,150.00");
            System.out.println(" 09.- Economico Version Rally   34,700.00");
            System.out.println(" 10.- Regresar a menú principal          ");
            System.out.println(" Ingrese gama de vehiculo: ");
            gama = entrada.nextInt();
            
            switch (gama)
            {
                case 1:
                    precio_gama = 18940;
                    acumulado = acumulado + precio_gama;
                    gamma = " Sedan Ecónomico ";
                    System.out.println(" Ha seleccionado la gama: "+gamma);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                case 10:
                    llamado_1.menu_principal();
                    break;    
            }   
            System.out.println(" Desea agregar amnidades? (s/n): ");
            amenidades = text.nextLine();
            
            switch(amenidades)
            {
                case "s":
                    llamado_1.amenidades();
                    break;
                case "n":
                    System.out.println(" precio gama "+precio_gama);
                    llamado_1.venta_vehiculo();
                    break;
            }
    }
    public void venta_vehiculo()
    {
        ame = "Ninguna";
        System.out.println(" ----------------------------------------");
        System.out.println("          CONCESIONARIO DE AUTOS         ");
        System.out.println("             VENTA DE VEHICULO           ");
        System.out.println(" ----------------------------------------");
        System.out.println(" Gama seleccionada: "+gama+"  US$"+precio_gama);
        System.out.println(" Amenidades: "+ame);
        System.out.println(" Total: "+"  US$"+acumulado);
    }
    public void amenidades()
    {
        Concesionaria llamado_2 = new Concesionaria();
        Scanner text = new Scanner(System.in);
        System.out.println(" ----------------------------------------");
        System.out.println("          CONCESIONARIO DE AUTOS         ");
        System.out.println("          SELECCION DE AMENIDADES        ");
        System.out.println(" ----------------------------------------");
        System.out.println(" 01.- Tipo de transmisión");
        System.out.println(" 02.- Color de pintura exterior");
        System.out.println(" 03.- Aros");
        System.out.println(" 04.- Accesorios exteriores");
        System.out.println(" 05.- Accesorios interiores");
        System.out.println(" 06.- Accesorios electricos");
        System.out.println(" 07.- Regresar a selección de gama de vehículo");
        System.out.println(" Ingrese el tipo de amenidad: ");
        tipo_amenidad = text.nextInt();
        switch (tipo_amenidad)
            {
                case 1:
                    llamado_2.transmision();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;   
            }
    }
    public void transmision()
    {
        Concesionaria llamado_3 = new Concesionaria();
        Scanner text = new Scanner(System.in);
        System.out.println(" ----------------------------------------");
        System.out.println("          CONCESIONARIO DE AUTOS         ");
        System.out.println("          SELECCION DE AMENIDADES        ");
        System.out.println("    SELECCion DE TIPO DE TRANSMISION     ");
        System.out.println(" ----------------------------------------");
        System.out.println(" 01.- Manual");
        System.out.println(" 02.- CVT");
        System.out.println(" 03.- Manual con Turbo");
        System.out.println(" 04.- CVT con Turbo");
        System.out.println(" 05.- Regresar a selección de amenidades");
        System.out.println(" Ingrese el tipo de amenidad: ");
        tipo_transmision = text.nextInt();
        switch (tipo_transmision)
            {
                case 1:
                    llamado_3.resumen();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
        }
    }
    public void resumen()
    {
        System.out.println(" ----------------------------------------");
        System.out.println("          CONCESIONARIO DE AUTOS         ");
        System.out.println("          RESUMEN DE AMENIDADES          ");
        System.out.println(" ----------------------------------------");
        System.out.println(" Gama seleccionada: "+gama+"  US$"+precio_gama);
        System.out.println(" Amenidades: "+ame);
        System.out.println(" Total: "+"  US$"+acumulado);
      
    }
        
        
    
}