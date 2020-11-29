package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Produtos_Nota_Fiscal")
public class Produto_Nota_Fiscal implements Serializable {
	//deposito no qual ocorrer� a movimenta��o
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo")
	private int codigo;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Deposito Deposito;
	@Column(name = "Custo")
	private double Custo;
	@Column(name = "Quantidade")
	private int Quantidade;
	@OneToOne(fetch = FetchType.LAZY)
	private Produto Produto;
	@Column(name = "Numeracao_NF")
	private String Numeracao_NF;
	
	public Produto_Nota_Fiscal() {
		
	}
	

	public Produto_Nota_Fiscal(Model.Deposito deposito, double custo, Produto Produto, int quantidade,
			Nota_Fiscal Nota_Fiscal) {
		super();
		Deposito = deposito;
		Custo = custo;
		Produto = Produto;
		Quantidade = quantidade;
		Nota_Fiscal = Nota_Fiscal;
	}

	

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Deposito getDeposito() {
		return Deposito;
	}

	public void setDeposito(Deposito deposito) {
		Deposito = deposito;
	}
	
	public double getCusto() {
		return Custo;
	}

	public void setCusto(double custo) {
		Custo = custo;
	}


	public Model.Produto getProduto() {
		return Produto;
	}

	public void setProduto(Produto Produto) {
		this.Produto = Produto;
	}


	public int getQuantidade() {
		return Quantidade;
	}


	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}


	public String getNumeracao_NF() {
		return Numeracao_NF;
	}


	public void setNumeracao_NF(String numeracao_NF) {
		Numeracao_NF = numeracao_NF;
	}








	


	
	
}
