package UFC;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private String categoria;
	private int idade;
	private float altura;
	private float peso;
	private int empate;
	private int vitoria;
	private int derrota;


	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int empate, int vitoria,
			int derrota) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.empate = empate;
		this.vitoria = vitoria;
		this.derrota = derrota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {

		if (this.getPeso() < 52.2 ) {
			categoria = "Inválido";
		}else if(this.getPeso() <= 70.3) {
			categoria = "Leve";
		} else if (this.getPeso() <= 83.9) {
			categoria = "Medio";
		}else if (this.getPeso() <= 120.2) {
			categoria = "Pesado";
		} else {
			categoria =" Inválido";
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public int getEmpate() {
		return empate;
	}

	public void setEmpate(int empate) {
		this.empate = empate;
	}

	public int getVitoria() {
		return vitoria;
	}

	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}

	public int getDerrota() {
		return derrota;
	}

	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}
	
	public void ganharLuta () {
		this.setVitoria(this.getVitoria() + 1);
	}
	public void empatarLuta () {
		this.setEmpate(this.getEmpate() + 1);
	}
	public void perderLuta () {
		this.setDerrota(this.getDerrota() +1);
	}
	public void apresentar() {
		System.out.print("====================================================================\n");
		System.out.print("NOME: " + this.getNome() + "\n");
		System.out.print("NACIONALIDADE: " + this.getNacionalidade() + "\n");
		System.out.print("IDADE: " + this.getIdade() + "\n");
		System.out.print("ALTURA: " + this.getAltura() + "\n");
		System.out.print("PESO: " + this.getPeso() + "KG\n");
		System.out.print("CATEGORIA: " + this.getCategoria() + "\n");
		System.out.print("VITÓRIAS: " + this.getVitoria() + "\n");
		System.out.print("EMPATES: " + this.getEmpate() + "\n");
		System.out.print("DERROTAS: " + this.getDerrota() + "\n\n");
	}
	public void status() {
		System.out.print("====================================================================================\n");
		System.out.print( this.getNome());
		System.out.print(" é um peso " + this.getPeso());
		System.out.print(" da categoria peso " + this.getCategoria() );
		System.out.print(" com " + this.getVitoria() + " vitórias ");
		System.out.print( this.getEmpate() + " empates e ");
		System.out.print(this.getDerrota() + " derrotas\n\n");
	}

}
