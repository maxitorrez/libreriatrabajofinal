package libreria;

public class ItemLibreria {
	private String titulo, autor, fechaDePublicacion, editorial, nombre, editor;
	private boolean esDigital;
	private int codigo;
	private double costo;
	private double precioDeVenta;
	private boolean esLibro;
	// libro
	public ItemLibreria(String titulo, String autor, String fecha, String editorial, int codigo, boolean esDigital, double costo) {
		this.titulo = titulo;
		this.autor = autor;
		this.fechaDePublicacion = fecha;
		this.editorial = editorial;
		this.codigo = codigo;
		this.esDigital = esDigital;
		this.costo = costo;
		this.esLibro = true;
		if(esDigital) {
			this.ventaLibroDigital();
		}else {
			this.ventaLibroFisico();
		}
	}
	// revista
	public ItemLibreria(String nombre, String fecha, String editor, int codigo, boolean esDigital, double costo) {
		this.nombre = nombre;
		this.fechaDePublicacion = fecha;
		this.editor = editor;
		this.codigo = codigo;
		this.esDigital = esDigital;
		this.costo = costo;
		this.esLibro = false;
		if(esDigital) {
			this.ventaRevistaDigital();
		}else {
			this.ventaRevistaFisica();
		}
	}
	
	// gets & sets
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getFechaDePublicacion() {
		return fechaDePublicacion;
	}
	public void setFechaDePublicacion(String fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public boolean isEsDigital() {
		return esDigital;
	}
	public void setEsDigital(boolean esDigital) {
		this.esDigital = esDigital;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}

	// metodos
	private void ventaLibroFisico() {
		double resultado = this.costo + (this.costo * 18) / 100;
		this.precioDeVenta = resultado;
	}
	private void ventaLibroDigital() {
		double resultado = this.costo + (this.costo * 8) / 100;
		this.precioDeVenta = resultado;
	}
	private void ventaRevistaFisica() {
		double resultado = this.costo + (this.costo * 22) / 100;
		this.precioDeVenta = resultado;
	}
	private void ventaRevistaDigital() {
		double resultado = this.costo + (this.costo * 12) / 100;
		this.precioDeVenta = resultado;
	}
	
	public double getPrecioDeVenta() {
		return precioDeVenta;
	}
	public void setPrecioDeVenta(double precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}
	@Override
	public String toString() {
		if(this.esLibro) {
			return "[titulo=" + titulo + ", autor=" + autor + ", fechaDePublicacion=" + fechaDePublicacion
				+ ", editorial=" + editorial + ", esDigital=" + esDigital
				+ ", codigo=" + codigo + ", precioDeVenta=" + precioDeVenta + "]" + "\n--------------------";
		} else {
			return "[titulo=" + nombre + ", fechaDePublicacion=" + fechaDePublicacion
					+ ", editor=" + editor + ", esDigital=" + esDigital
					+ ", codigo=" + codigo + ", precioDeVenta=" + precioDeVenta + "]" + "\n--------------------";
		}
		
	}
	
	
}
