import dominio.ClasseProduto;
import dominio.Produto;
import dominio.SubclasseProduto;
import visao.ClasseProdutoVisao;
import visao.ProdutoVisao;
import visao.SubclasseProdutoVisao;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Testando ClasseProduto
        ClasseProdutoVisao classeProdutoVisao = new ClasseProdutoVisao();
        System.out.println("=== Testando ClasseProduto ===");
        classeProdutoVisao.Exibir(); // Exibir todas as classes de produto
        ClasseProduto novaClasse = new ClasseProduto(0, "Pães", LocalDate.now());
        classeProdutoVisao.Criar(novaClasse); // Adiciona nova classe
        System.out.println("Adiciona nova classe");
        classeProdutoVisao.Exibir(); // Exibe novamente para ver a nova classe
        classeProdutoVisao.Editar(novaClasse.getCodigo(), new ClasseProduto(0, "Pães e Bolos", LocalDate.now())); // Edita a nova classe
        System.out.println("Edita a nova classe");
        classeProdutoVisao.Exibir(); // Exibe novamente para ver a edição
        classeProdutoVisao.Remover(novaClasse.getCodigo()); // Remove a classe
        System.out.println("Remove a classe");
        classeProdutoVisao.Exibir(); // Exibe para verificar se foi removido

        System.out.println("--------------------------------------------------------");

        // Testando SubclasseProduto
        SubclasseProdutoVisao subclasseProdutoVisao = new SubclasseProdutoVisao();
        System.out.println("=== Testando SubclasseProduto ===");
        subclasseProdutoVisao.Exibir(); // Exibe todas as subclasses de produto
        SubclasseProduto novaSubclasse = new SubclasseProduto(0, "Pães Integrais", LocalDate.now(), 1); // Cria nova subclasse
        subclasseProdutoVisao.Criar(novaSubclasse); // Adiciona nova subclasse
        System.out.println("Adiciona nova classe");
        subclasseProdutoVisao.Exibir(); // Exibe novamente para ver a nova subclasse
        subclasseProdutoVisao.Editar(novaSubclasse.getCodigo(), new SubclasseProduto(0, "Pães Integrais Light", LocalDate.now(), 1)); // Edita a subclasse
        System.out.println("Edita a nova classe");
        subclasseProdutoVisao.Exibir(); // Exibe novamente para ver a edição
        subclasseProdutoVisao.Remover(novaSubclasse.getCodigo()); // Remove a subclasse
        System.out.println("Remove a classe");
        subclasseProdutoVisao.Exibir(); // Exibe para verificar se foi removido

        System.out.println("--------------------------------------------------------");

        // Testando Produto
        ProdutoVisao produtoVisao = new ProdutoVisao();
        System.out.println("=== Testando Produto ===");
        produtoVisao.Exibir(); // Exibe todos os produtos
        Produto novoProduto = new Produto(0, "Pão Francês", LocalDate.now(), 1, 0.50); // Cria novo produto
        produtoVisao.Criar(novoProduto); // Adiciona novo produto
        System.out.println("Adiciona nova classe");
        produtoVisao.Exibir(); // Exibe novamente para ver o novo produto
        produtoVisao.Editar(novoProduto.getCodigo(), new Produto(0, "Pão de Queijo", LocalDate.now(), 1, 0.75)); // Edita o produto
        System.out.println("Edita a nova classe");
        produtoVisao.Exibir(); // Exibe novamente para ver a edição
        produtoVisao.Remover(novoProduto.getCodigo()); // Remove o produto
        System.out.println("Remove a classe");
        produtoVisao.Exibir(); // Exibe para verificar se foi removido
    }
}
