package practica1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pci10
 */
public class Gestion extends Practica1 {  
    public Scanner teclado= new Scanner (System.in);

    private String Nombre;
    private String autor;
    private int año;
    private int selec;
    private  String codigo;
    private int cantidad;
    private String area;
    private int selctarea;
    
    
    public void Menu(){
    }
            
   public void datos(){
     Scanner teclado = new Scanner(System.in);
     System.out.println("Ingrese Nombre");
     this.Nombre=teclado.nextLine();
     System.out.println("Ingrese Autor");
     this.autor=teclado.nextLine();
     System.out.println("Ingrese Año de publicaciòn");
     this.año=teclado.nextInt();
     System.out.println("Ingrese Codigo");
     this.codigo=teclado.next();
     System.out.println("Ingrese Cantidad");
     this.cantidad=teclado.nextInt();
     System.out.println("Escoja Area de publicación");
                System.out.println("/////////////////");
                System.out.println("1. Química");
                System.out.println("2. Física");
                System.out.println("3. Tecnología");
                System.out.println("4. Cálculo");
                System.out.println("5. Programación");
                System.out.println("/////////////////");
     this.selctarea=teclado.nextInt();
     switch (selctarea){
         case 1:
            this.area="Química";
            break;
         case 2:
            this.area="Física";
            break;
         case 3:
            this.area="Tecnología";
            break;
         case 4:
            this.area="Cálculo";
            break;
         case 5:
            this.area="Programación";
            break;
     }
    //esta saltando a preguntar por el telefono 
 }
 public void  Buscar(){
     System.out.println("Nombre: "+Nombre);
     System.out.println("Autor: "+autor);
     System.out.println("Año de publicaciòn: "+año);
     System.out.println("Codigo: "+codigo);
     System.out.println("Cantidad: "+cantidad);
     System.out.println("Area: "+area);
 }
 
 public int getaño() {
        return año;
    }

    public void setaño(int año) {
        this.año = año;
    }
 
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getcodigo() {
        return codigo;
    }

    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getautor() {
        return autor;
    }

    public void setautor(String autor) {
        this.autor = autor;
    }
    public String getarea() {
        return area;
    }

    public void setarea(String area) {
        this.area = area;
    }
    public int getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }
 /*public void Loading_Data(String n){
     Scanner teclado = new Scanner(System.in);
     System.out.println(n+" Nombre");
     Nombre=teclado.next();
     System.out.println(n+" Aprellidos");
     Apellidos=teclado.next();
     System.out.println(n+" Edad");
     Edad=teclado.nextInt();
     System.out.println(n+" Cedula");
     Cedula=teclado.nextDouble();
     System.out.println(n+" Fecha de nacimiento");
     Nacimiento=teclado.next();
     System.out.println(n+" Direccion");
     Direcion=teclado.next();
     System.out.println(n+" Telefono");
     Telefono=teclado.nextDouble(); 
  }
    public void prestar(int cantidad,String Nombre, String autor, int año,String codigo, String area) {
        this.cantidad = cantidad-1;
        this.Nombre=Nombre;
        this.autor=autor;
        this.año=año;
        this.codigo=codigo;
        this.area=area;
    }
    
    public void devolver(int cantidad,String Nombre, String autor, int año,String codigo, String area) {
        this.cantidad =cantidad+1;
        this.Nombre=Nombre;
        this.autor=autor;
        this.año=año;
        this.codigo=codigo;
        this.area=area;
    }*/
}
