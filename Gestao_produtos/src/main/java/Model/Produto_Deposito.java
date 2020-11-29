package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Produtos_Deposito")
public class Produto_Deposito implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Codigo")
	private int Codigo;
	@Column(name = "Custo")
	private double Custo;
	@Column(name = "Estoque")
	private int Estoque;
	@Column(name = "Estoque_Maximo")
	private int Estoque_Maximo;
	@Column(name = "Estoque_Minimo")
	private int Estoque_Minimo;
	//@JoinColumn(name = "idProduto")
	@OneToOne(fetch = FetchType.LAZY)
	private Produto Produto;
	//@JoinColumn(name = "idDeposito")
	@OneToOne(fetch = FetchType.LAZY)
	private Deposito Deposito;
	private int qtd;
	
	public Produto_Deposito(int codigo, double custo, int estoque, int estoque_Maximo, int estoque_Minimo,
			Model.Produto produto, Model.Deposito deposito) {
		super();
		Custo = custo;
		Estoque = estoque;
		Estoque_Maximo = estoque_Maximo;
		Estoque_Minimo = estoque_Minimo;
		Produto = produto;
		Deposito = deposito;
		Codigo = codigo;
	}
	
	public Produto_Deposito() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getCodigo() {
		return Codigo;
	}
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	
	

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getCusto() {
		return Custo;
	}
	public void setCusto(double custo) {
		Custo = custo;
	}
	public int getEstoque() {
		return Estoque;
	}
	public void setEstoque(int estoque) {
		Estoque = estoque;
	}
	public int getEstoque_Maximo() {
		return Estoque_Maximo;
	}
	public void setEstoque_Maximo(int estoque_Maximo) {
		Estoque_Maximo = estoque_Maximo;
	}
	public int getEstoque_Minimo() {
		return Estoque_Minimo;
	}
	public void setEstoque_Minimo(int estoque_Minimo) {
		Estoque_Minimo = estoque_Minimo;
	}
	public Produto getProduto() {
		return Produto;
	}
	public void setProduto(Produto produto) {
		Produto = produto;
	}
	public Deposito getDeposito() {
		return Deposito;
	}
	public void setDeposito(Deposito deposito) {
		Deposito = deposito;
	}
	
	
}
