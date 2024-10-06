package fakedb;

import java.util.ArrayList;

public abstract class BaseFAkeDB<TDominio> {

    protected ArrayList<TDominio> tabela;

    // Inicializa a lista no construtor para evitar NullPointerException
    public BaseFAkeDB() {
        this.tabela = new ArrayList<>();  // Inicializa a lista padrão
        this.preencherDados();
    }

    // Método para obter a tabela de dados
    public ArrayList<TDominio> getTabela() {
        return this.tabela;
    }

    // Método abstrato para preencher dados, que será implementado nas subclasses
    public abstract void preencherDados();
}
