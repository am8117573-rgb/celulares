
public class ObjCelulares {
    private String Modelo;
    private  String Marca;
    private String Caracteristicas;
    private double Precio;
    private int CantidadDisponible;
    public ObjCelulares(String modelo, String marca, String caracterisiticas, double precio, int cantidadDisponible) {
        this.Modelo = modelo;
        this.Marca = marca;
        Caracteristicas = caracterisiticas;
        this.Precio = precio;
        CantidadDisponible = cantidadDisponible;
    }
    public ObjCelulares() {
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        this.Marca = marca;
    }
    public String getCaracterisiticas() {
        return Caracteristicas;
    }
    public void setCaracterisiticas(String caracterisiticas) {
        Caracteristicas = caracterisiticas;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        this.Precio = precio;
    }
    public int getCantidadDisponible() {
        return CantidadDisponible;
    }
    public void setCantidadDisponible(int cantidadDisponible) {
        CantidadDisponible = cantidadDisponible;
    }

    
    
}

