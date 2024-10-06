package repositorio;

import dominio.SubclasseProduto;
import fakedb.SubclasseProdutoFakeDB;
import java.util.ArrayList;

public class SubclasseProdutoRepo extends BaseRepositorio<SubclasseProduto> {

    private SubclasseProdutoFakeDB db;

    public SubclasseProdutoRepo() {
        this.db = new SubclasseProdutoFakeDB();
        // Inicialize a lista, mesmo se a db retornar null
        this.dados = this.db.getTabela();
        if (this.dados == null) {
            this.dados = new ArrayList<>();  // Inicializa a lista se estiver nula
        }
    }

    @Override
    public ArrayList<SubclasseProduto> Browse() {
        if (dados == null) {
            return new ArrayList<>();  // Retorna uma lista vazia se os dados forem nulos
        }
        return dados;
    }

    @Override
    public SubclasseProduto Read(int chave) {
        for (SubclasseProduto iteravel : dados) {
            if (chave == iteravel.getCodigo()) {
                return iteravel;
            }
        }
        return null;
    }

    @Override
    public SubclasseProduto Edit(SubclasseProduto instancia) {
        SubclasseProduto ler = this.Read(instancia.getCodigo());
        if (ler != null) {
            ler.setDescricao(instancia.getDescricao());
            return ler;
        }
        return null;
    }

    @Override
    public SubclasseProduto Add(SubclasseProduto instancia) {
        if (this.Read(instancia.getCodigo()) != null) {
            System.out.println("Subclasse já existe!");
            return null; // ou lançar uma exceção, se preferir
        }
        
        int proximo = (this.dados.isEmpty() ? 1 : this.dados.get(this.dados.size() - 1).getCodigo() + 1);
        instancia.setCodigo(proximo);
        this.dados.add(instancia);
        return instancia;
    }

    @Override
    public SubclasseProduto Delete(int chave) {
        SubclasseProduto ler = this.Read(chave);
        if (ler != null) {
            this.dados.remove(ler);
            return ler;
        }

        return null;
    }
}
