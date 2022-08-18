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
    }
}
