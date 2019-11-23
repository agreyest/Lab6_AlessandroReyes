package lab6_alessandroreyes;

import java.util.Date;

public class Bebida {
    private String codigo;
    private String marca;
    private String nombre;
    private int cantAzucar;
    private int cantalcohol;
    private boolean nacional;
    private int numlote;
    private String colorantes;
    private int precio;
    private int cantidad;
    private String fdv;

    public Bebida() {
    }

    public Bebida(String codigo, String marca, String nombre, int cantAzucar, int cantalcohol, boolean nacional, int numlote, String colorantes, int precio, int cantidad, String fdv) {
        if(codigo.length() == 8)
            this.codigo = codigo;
        this.marca = marca;
        this.nombre = nombre;
        this.cantAzucar = cantAzucar;
        if(cantalcohol < 100)
            this.cantalcohol = cantalcohol;
        this.nacional = nacional;
        this.numlote = numlote;
        this.colorantes = colorantes;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fdv = fdv;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.length() == 8)
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
        if(cantalcohol < 100)
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

    public String getFdv() {
        return fdv;
    }

    public void setFdv(String fdv) {
        this.fdv = fdv;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
