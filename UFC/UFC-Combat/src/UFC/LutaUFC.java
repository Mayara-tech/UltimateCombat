package UFC;

import java.util.Random;

public class LutaUFC {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria())&& l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante =l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
			
		}
	}
	public void lutar() {
		if (this.aprovada) {
			System.out.print("==================================================\n");
			System.out.print("VAMOS CONHECER O NOSSO PRIMEIRO DESAFIANTE\n");
			this.desafiante.apresentar();
			System.out.print("E O NOSSO DESAFIADO DA NOITE\n");
			this.desafiado.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			switch(vencedor) {
			case 0: // Empate
				System.out.print("A  LUTA EMPATOU !!!!!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: // Desafiado Vence 
				System.out.print("O DESAFIADO VENCEU COM VOCÊS O NOSSO VENCEDOR " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: // Desafiante Ganha
				System.out.print("O DESAFIANTE VENCEU COM VOCÊS NOSSO VENCEDOR " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			}
		}else {
			System.out.print("A LUTA NÃO PODE ACONTECER!");
		}
	}
	
}
