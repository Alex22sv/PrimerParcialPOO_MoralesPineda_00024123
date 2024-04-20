package inventario;

public class Laptop extends ArticuloElectronico{
    private String sistemaOperativo;
    private float almacenamiento;
    private boolean rgb;
    public Laptop(){
        super();
        this.sistemaOperativo = "";
        this.almacenamiento = 0;
        this.rgb = false;
    }
    public Laptop(String nombre, String modelo, String descripcion, float precio, String sistemaOperativo, float almacenamiento, boolean rgb){
        super(nombre, modelo, descripcion, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.almacenamiento = almacenamiento;
        this.rgb = rgb;
    }
    public String getSistemaOperativo() {return sistemaOperativo;}
    public void setSistemaOperativo(String sistemaOperativo) {this.sistemaOperativo = sistemaOperativo;}
    public float getAlmacenamiento() {return almacenamiento;}
    public void setAlmacenamiento(float almacenamiento) {this.almacenamiento = almacenamiento;}
    public boolean isRgb() {return rgb;}
    public void setRgb(boolean rgb) {this.rgb = rgb;}
}
