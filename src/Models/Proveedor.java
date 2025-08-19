package Models;

public class Proveedor {
    private String nombreProveedor;
    private String ruc;
    private String rubro;

    public Proveedor(String nombreProveedor, String ruc, String rubro) {
        this.nombreProveedor = nombreProveedor;
        this.ruc = ruc;
        this.rubro = rubro;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
}
