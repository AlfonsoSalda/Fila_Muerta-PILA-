import java.util.Scanner;
public class TestVagon {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Scanner j = new Scanner(System.in);
    int vgm,num,cap,op=0,i=0;
    boolean agujas=false;
    String name;
        System.out.println("\t¿Cuantos vagones puede haber como maximo?");
        vgm=s.nextInt();
        Pila fila=new Pila(vgm);
        Vagon vagones[]=new Vagon[vgm];
        
        for (int k = 0; k < vgm; k++) {
            vagones[k]=new Vagon();
        }
        
        do {            
            System.out.println("\n\tVia Muerta");
            System.out.println("\n\t1.-Aparcar Vagon");
            System.out.println("\n\t2.-Sacar Vagon");
            System.out.println("\n\t3.-Imprimir");
            System.out.println("\n\t4.-Salir");
            op=s.nextInt();
            
            switch (op) {
                case 1:
                    if (i<vgm) {
                    if (agujas==true) {
                        System.out.println("\n\tDame el numero que se le asignara a este vagon: ");
                        num=s.nextInt();
                        System.out.println("\n\tDame la capacidad de este vagon: ");
                        cap=s.nextInt();
                        System.out.println("\n\tDame el nombre de este vagon: ");
                        name=j.nextLine();
                        System.out.println("\n\tInsertando....");
                        vagones[i].vagon(num, cap, name);
                        fila.apilar(vagones[i].toString());
                        i=i+1;
                    } else{
                        System.out.println("\n\tCambaindo el sentido de las agujas");
                        agujas=true;
                        System.out.println("\n\tDame el numero que se le asignara a este vagon: ");
                        num=s.nextInt();
                        System.out.println("\n\tDame la capacidad de este vagon: ");
                        cap=s.nextInt();
                        System.out.println("\n\tDame el nombre de este vagon: ");
                        name=j.nextLine();
                        System.out.println("\n\tInsertando....");
                        vagones[i].vagon(num, cap, name);
                        fila.apilar(vagones[i].toString());
                        i=i+1;
                    }
                    } else{
                        System.out.println("\n\t Fila muerta llena");
                    }
                    break;
                    case 2:
                        if (agujas==false) {
                            System.out.println("\n\tSaliendo: ");
                            fila.obtenerCima();
                            fila.desapilar();
                            i=i-1;
                        } else{
                            agujas=false;
                            System.out.println("\n\tCambiando sentido de agujas");
                            System.out.println("\n\tSaliendo: ");
                            fila.obtenerCima();
                            fila.desapilar();
                            i=i-1;
                        }
                    break;
                    case 3:
                        fila.mostrar();
                    break;
                    case 4:
                        System.out.println("\n\tSaliendo....");
                    break;
                default:
                    System.out.println("\n\tOpcion no valida");
            }
            
        } while (op!=4);
}
}
