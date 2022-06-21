package classe;

public class ProdutosTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Pc game Moster", 2630.89);
		p1.nome = "Pc game Moster";
		p1.preco = 2630.89;
		
		
		var p2 = new Produto("Notebook MSI", 7000.00);
		p2.nome = "Notebook MSI";
		p2.preco = 7000.00;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome + "" + p1.precoComDesconto());
		System.out.println(p2.nome + "" + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double MediaCarrinho = precoFinal1 + precoFinal2 / 2;
		
		System.out.printf("Media do carrinho = R$%.2f" , MediaCarrinho);
		
	}
}
