package services;

import datos.IStock;
import datos.Stock;
import excepciones.StockException;
import modelo.Producto;
import utilidades.Datos;

/**
 *
 * @author Antonio
 */
public class SuperServices implements ISuperServices {

    private IStock stock = new Stock();

    public boolean AddProducto() throws StockException {
        Producto p = new Producto();
        p.crearProducto();
        return this.AddProducto(p);
    }

    public boolean AddProducto(Producto p) throws StockException  {
        //Habria que decidir un algoritmo de códigos (una funciona Hash)
        return stock.AddProducto((int) (Math.random() * 100000), p);
    }

    //Esto hace que el metodo de Datos sea más sencillo.. pero compkica la capa servicios
    public boolean eliminarProducto() throws StockException, Exception {
        int codigo = Datos.recogeInt("   Indica el código del producto a eliminar");

        if (stock.existeCodigo(codigo)) {
            stock.eliminarProducto(codigo);
            System.out.println("   Producto eliminado");
            return true;
        } else {
        	throw new StockException("El supermercado no tiene ese producto",3);
            //return false;
        }
    }

    public void ListarProductos() {
        stock.ListarProductos();
    }

    public boolean CantidadesProducto() throws StockException, Exception {
        int codigo = Datos.recogeInt("   Indica el código del producto del que quieres saber la cantidad");
        return stock.CantidadesProducto(codigo);
    }

    public void CantidadesMenores(int cant) throws StockException {
        stock.CantidadesMenores(cant);
    }

    public void CasosDePrueba() {
        stock.CasosDePrueba();
    }

    public void serializarStock() {
        //Por defecto
        stock.serializarStock("listado_stock.dat");
    }

    public void deSerializarStock() {
        //Por defecto
        stock.deSerializarStock("listado_stock.dat");
    }
}
