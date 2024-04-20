package inventario;

public class Telefono extends ArticuloElectronico{
    private int cantidadCamaras;
    private float RAM;
    private boolean pantallaTactil;
    public Telefono(){
        super();
        this.cantidadCamaras = 0;
        this.RAM = 0;
        this.pantallaTactil = false;
    }
    public Telefono(String nombre, String modelo, String descripcion, float precio, int cantidadCamaras, float ram, boolean pantallaTactil) {
        super(nombre, modelo, descripcion, precio);
        this.cantidadCamaras = cantidadCamaras;
        this.RAM = ram;
        this.pantallaTactil = pantallaTactil;

    }
    public int getCantidadCamaras() {return cantidadCamaras;}
    public void setCantidadCamaras(int cantidadCamaras) {this.cantidadCamaras = cantidadCamaras;}
    public float getRAM() {return RAM;}
    public void setRAM(float RAM) {this.RAM = RAM;}
    public boolean isPantallaTactil() {return pantallaTactil;}
    public void setPantallaTactil(boolean pantallaTactil) {this.pantallaTactil = pantallaTactil;}
}
