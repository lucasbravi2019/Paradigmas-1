import entity.Edificio;
import entity.Lote;
import entity.Registro;

public class Tp1 {
    public static void main(String[] args) {
        Registro registro = Registro.builder()
                .coefAvaluoEdificio(156.23f)
                .municipio("Lujan de Cuyo")
                .tasa(24.23f)
                .build();

        Lote lote = Lote.builder()
                .domicilio("San Martin")
                .avaluoxmt(20.5f)
                .idPadron(1)
                .superficie(153)
                .build();

        registro.registrar(lote);
        registro.emitirBoletos();
        registro.valuar(lote);
        System.out.printf("Registro de lote: %s%n", lote.getInscripto());
        System.out.printf("Lotes registrados: %s%n", registro.getInmuebles());
        System.out.printf("Escrituras: %s%n", registro.getEscrituras());
        Edificio edificio = lote.construir();
        System.out.printf("Lote construido: %s%n", lote);
        System.out.printf("Edificio: %s%n", edificio);
        System.out.printf("Avaluo edificio: $ %.2f%n", edificio.valuar(75));
        edificio = edificio.demoler();
        System.out.printf("Edificio demolido: %s%n", edificio == null ? "OK" : "ERROR");
    }
}
