package datos;

import excepciones.StockException;

/**
*
* @author Antonio Santos
* 
*/

import modelo.Producto;

public interface IStock {
	
    public boolean AddProducto(int codigo, Producto p) throws StockException;   
    public boolean existeCodigo(int cod);
    public void eliminarProducto(int cod) throws StockException;
    public void ListarProductos();    
    public boolean CantidadesProducto(int cod) throws StockException;
    public boolean CantidadesMenores(int limite) throws StockException;
    
    public void serializarStock(String fichero);
    public void deSerializarStock(String fichero);
    
    public void CasosDePrueba();

}
