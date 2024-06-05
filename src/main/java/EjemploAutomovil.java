public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil automovil = new Automovil(); // Crea la instancia, la inicializa y se guarda la referencia en memoria hacia ese objeto.

        // automovil.cilindrada = 1.5;
        automovil.setCilindrada(1.5);
        // automovil.fabricante = "Honda";
        automovil.setFabricante("Honda");

        Automovil.setColorPatente("Gris");

        //System.out.println("automovil = " + automovil.fabricante); // Por ahora accediendo a los atributos de forma pública
        //System.out.println("automovil = " + automovil.color);
        //System.out.println("automovil = " + automovil.cilindrada);

        //automovil.detalle();
        String strDetalle = automovil.detalleStr();
        System.out.println(strDetalle);

        System.out.println("Kilómetros por litro = " + automovil.calcularConsumo(300, 0.6f));
        System.out.println("Kilómetros por litro = " + automovil.calcularConsumo(300, 60));
    }
}
