package inventario;

public abstract class ArticuloElectronico implements ObtenerDatos{
    private String nombre;
    private String modelo;
    private String descripcion;
    private float precio;
    public ArticuloElectronico() {
        this.nombre = "";
        this.modelo = "";
        this.descripcion = "";
        this.precio = 0;
    }
    public ArticuloElectronico(String nombre, String modelo, String descripcion, float precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}
    @Override
    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    @Override
    public float getPrecio() {return precio;}
    public void setPrecio(float precio) {this.precio = precio;}
}
