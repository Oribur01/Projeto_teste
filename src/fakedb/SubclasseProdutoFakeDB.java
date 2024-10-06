package fakedb;

import dominio.SubclasseProduto;
import java.time.LocalDate;
import java.util.ArrayList;

public class SubclasseProdutoFakeDB extends BaseFAkeDB<SubclasseProduto> {

public void preencherDados() {
    if (this.tabela == null) {
        this.tabela = new ArrayList<>();  // Certifique-se de que a lista é inicializada
    }
    
    if (this.tabela.isEmpty()) { // Adiciona dados apenas se a lista estiver vazia
        this.tabela.add(new SubclasseProduto(1, "Teste 1", LocalDate.now(), 2));
        this.tabela.add(new SubclasseProduto(2, "Teste 2", LocalDate.now(), 2));
        this.tabela.add(new SubclasseProduto(3, "Teste 3", LocalDate.now(), 2));
        this.tabela.add(new SubclasseProduto(4, "Teste 4", LocalDate.now(), 2));
        this.tabela.add(new SubclasseProduto(5, "Teste 5", LocalDate.now(), 2));
    }
}

    public SubclasseProdutoFakeDB() {
        super();
    }
}
