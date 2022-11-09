package modelo;

/**
 *
 * @author Antonio
 */
public enum Categorias {

    Lacteos(1),
    Frutas(2),
    Congelados(3),
    Desayuno(4),
    Bebidas(5),
    Embutidos(6);

    private final int codigo;
    private static final int size = Categorias.values().length;

    private Categorias(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static int getSize() {
        return size;
    }

    //Java no pasa bien de int --> Enum.. y hay que hacer un poco de ñapa
    private static Categorias[] values = null;

    public static Categorias dimeCategoria(int val) {
        if (Categorias.values == null) {
            Categorias.values = Categorias.values();
        }
        //System.out.println("--> " + Categorias.values[val]);
        return Categorias.values[val];
    }

    /*
     public static Categorias dimeCategoria(int cod) {
     System.out.println("-- cod:" + cod);
     //Categorias cat = Categorias.values()[cod];
     switch (cod) {
     case 1:
     return Categorias.Lacteos;
     case 2:
     return Categorias.Frutas;
     case 3:
     return Categorias.Congelados;
     case 4:
     return Categorias.Desayuno;
     case 5:
     return Categorias.Bebidas;
     case 6:
     return Categorias.Embutidos;
     }
     return Categorias.Bebidas;
     }
     */
    public static void Informe1() {
        StringBuilder sb;
        for (Categorias cat : Categorias.values()) {
            sb = new StringBuilder();
            sb.append("Código 0").
                    append(cat.codigo).
                    append(": ").
                    append(cat);
            System.out.println(sb);
        }
    }

    public static void Informe2() {
        StringBuilder sb;
        for (Categorias cat : Categorias.values()) {
            sb = new StringBuilder();
            sb.append("(").
                    append(cat.codigo).
                    append(")").
                    append(cat).
                    append("|");
            System.out.println(sb);
        }
    }

}
