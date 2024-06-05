public class Automovil {
    private String fabricante;
    private String modelo;
    private String color = "black";
    private double cilindrada;
    private int capacidadTanque = 40;

    public Automovil() {
    }

    public Automovil(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, String color) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        this(fabricante, modelo); // Llamando al fabricante de arriba
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public void detalle(){
        // this: para hacer referencia de la misma clase. También se puede omitir, pero no siempre. Mejor ponerlo.
        // por ejemplo si tengo una variable dentro -> Stirng modelo = "";
        System.out.println("---- Detalle del automovil ----");
        System.out.println("this.fabricante = " + this.fabricante);
        System.out.println("this.modelo = " + this.modelo);
        System.out.println("this.color = " + this.color);

        // Buenas prácticas: Dentro de una clase no es buena práctica imprimir datos en consola, mejor devolverlos resumidos.
        // Esto acopla a una sola forma de imprimir datos
    }

    public String detalleStr(){
        StringBuilder sb = new StringBuilder();
        sb.append("---- Detalle del automovil devolviendo un string ----");
        sb.append("\nthis.fabricante = " + getFabricante());
        sb.append("\nthis.modelo = " + this.modelo);
        sb.append("\nthis.color = " + getColor());

        return sb.toString();
    }

    // Sobrecarga de métodos: Mismo nombre de método pero distintos tipos o cantidad de parámetros
    public float calcularConsumo(int km, float porcentajeGasolina){
      return km/(capacidadTanque * porcentajeGasolina);
    };
    public float calcularConsumo(int km, int porcentajeGasolina){
        return km/(capacidadTanque * (porcentajeGasolina/100f));
    };

    @Override // Estamos sobreescribiendo un método de la clase padre
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }
}
