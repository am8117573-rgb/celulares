import java.util.Scanner;
public class Metodos {
    public ObjCelulares[] LlenarCelulares(ObjCelulares[]celulares){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < celulares.length; i++) {
            ObjCelulares c = new ObjCelulares();
            System.out.println("\nModelo: ");
            c.setModelo(sc.next());
            System.out.println("\nMarca: ");
            c.setMarca(sc.next());
            System.out.println("\nPrecio: ");
            c.setPrecio(sc.nextDouble());
            System.out.println("\nCantidad Disponible: ");
            c.setCantidadDisponible(sc.nextInt());
            System.out.println("\nCaracteristicas: ");
            c.setCaracterisiticas(sc.next());
            celulares[i] = c;
        }
        return celulares;
    }
    public void MostrarPromocion(ObjCelulares[] celulares){
        System.out.println("=== CELULARES EN PROMOCION (stock > 50) ===");
        boolean hayPromo = false;
        for (ObjCelulares c: celulares) {
            if (c.getCantidadDisponible() > 50){
                System.out.println(c.getMarca() + " " + c.getModelo()+ " - Stock: " + c.getCantidadDisponible());
                hayPromo = true;
            }
            
        }
        if(!hayPromo){
            System.out.println("NO HAY CELUARES QUE CUMPLAN EL CRITERIO DE PROMOCIÓN");
        }
    }
    
}
