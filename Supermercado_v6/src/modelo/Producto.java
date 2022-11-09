package modelo;

/**
 *
 * @author Antonio Santos
 */
import java.io.Serializable;
import utilidades.Datos;

public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre;
    private Categorias categoria;
    private int cantidad;

    public Producto() {
    }

    public Producto(String nombre, Categorias categoria, int cantidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void crearProducto() {

        try {
            this.nombre = Datos.recogeString("Introduce el nombre del producto");
            Categorias.Informe2();
            this.categoria = Categorias.dimeCategoria(Datos.recogeInt());
            this.cantidad = Datos.recogeInt("Introduce la cantidad existente");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + categoria + ") -- " + cantidad + " unidades";
    }
}
