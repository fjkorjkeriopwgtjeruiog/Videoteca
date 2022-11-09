package services;

import excepciones.StockException;

/**
*
* @author Antonio Santos
* 
*/

import modelo.Producto;

public interface ISuperServices {
	
	public boolean AddProducto() throws StockException;
    public boolean AddProducto(Producto p) throws StockException;  
    public boolean eliminarProducto() throws StockException, Exception;
    public void ListarProductos();
    public boolean CantidadesProducto() throws StockException, Exception;
    public void CantidadesMenores(int cant) throws StockException;
    public void serializarStock();
    public void deSerializarStock();
    public void CasosDePrueba();

}
