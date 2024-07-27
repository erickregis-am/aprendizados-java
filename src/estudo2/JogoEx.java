package estudo2;

import java.util.Scanner;

public class JogoEx {
	private String nickname;
	private int idade;
	private String origem;
	
	
	
	JogoEx(){
		Scanner s = new Scanner(System.in);
		this.nickname = s.nextLine();
		this.origem = s.nextLine();
		this.idade = s.nextInt();
		
		}



	
	
	
	
	
	
	public String getNickname() {
		return nickname;
	}



	public void setNickname(String nickname) {
		this.nickname = nickname;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getOrigem() {
		return origem;
	}



	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	
	
}