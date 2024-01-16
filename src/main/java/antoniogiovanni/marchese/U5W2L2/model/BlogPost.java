package antoniogiovanni.marchese.U5W2L2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlogPost {
    private int id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoDiLettura;//minuti
}
