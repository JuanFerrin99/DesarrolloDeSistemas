import java.util.HashMap;

public class Carrito {
    private HashMap<Producto,Integer> productos;
    private int clienteId;
    private boolean pagado;

    private void agregarProducto(Producto producto, int cantidad){
        this.productos.put(producto, this.productos.get(producto)+cantidad);
    }
    private void removerProducto(int idProducto){
        for(Producto p : this.productos.keySet()){
            if(p.getIdProducto() == idProducto){
                this.productos.remove(p,this.productos.get(p));
            }
        }
    }
    private void pagarCarrito() {
        this.pagado=true;
    }
        public HashMap<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Producto, Integer> productos) {
        this.productos = productos;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public Carrito(HashMap<Producto, Integer> productos, int clienteId, boolean pagado) {
        this.productos = productos;
        this.clienteId = clienteId;
        this.pagado = pagado;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
}
