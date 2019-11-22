package lab6_alessandroreyes;

import java.util.Date;

public class Bebida {
    private int codigo;
    private String marca;
    private String  nombre;
    private int cantAzucar;
    private int cantalcohol;
    private boolean nacional;
    private int numlote;
    private String colorantes;
    private int precio;
    private int cantidad;
    private Date fdv;

    public Bebida() {
    }

    public Bebida(int codigo, String marca, String nombre, int cantAzucar, int cantalcohol, boolean nacional, int numlote, String colorantes, int precio, int cantidad, Date fdv) {
        this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.cantAzucar = cantAzucar;
        this.cantalcohol = cantalcohol;
        this.nacional = nacional;
        this.numlote = numlote;
        this.colorantes = colorantes;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fdv = fdv;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    public int getCantalcohol() {
        return cantalcohol;
    }

    public void setCantalcohol(int cantalcohol) {
        this.cantalcohol = cantalcohol;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public int getNumlote() {
        return numlote;
    }

    public void setNumlote(int numlote) {
        this.numlote = numlote;
    }

    public String getColorantes() {
        return colorantes;
    }

    public void setColorantes(String colorantes) {
        this.colorantes = colorantes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFdv() {
        return fdv;
    }

    public void setFdv(Date fdv) {
        this.fdv = fdv;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
