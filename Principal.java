import java.util.Scanner; 


public class Principal {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in); 
			
			double i[] = new double[100]; 
			double pv = 0;
			double pmt = 0; 
			double erro=10;
			double potencia = 0;
			double potencia2 = 0;
			double a =0;			
			double b = 0; 
			int n = 0;
	; 
			
			double funcao = 0;
			double funcaoDerivada = 0; 
		
			i[0]= 0.025; 
			
			
			System.out.println("Programa para calcular o custo mensal efetivo do empréstimo. ");
			System.out.println("Por gentileza, informe o emprestimo (PV): "); 
			pv = input.nextDouble(); 
			
			System.out.println("Agora informe a quantidade de pagamentos mensais(n): ");	
			n = input.nextInt(); 
			
			System.out.println("Por fim, o valor das prestacoes mensais sucessivas (PMT): ");
			pmt = input.nextDouble(); 
			
			int k=0;
			//for(; erro >=0.01; k++ ) 
			
			while(erro>=0.01){
				
				a= (1+i[k]); 
				potencia = Math.pow(a,-n );
				potencia2 = Math.pow(a, -n-1);
				funcao = (pv/pmt)*i[k] + potencia -1 ;
				funcaoDerivada = (pv/pmt) -(n*potencia2) ;
				i[k+1] = i[k] - (funcao/funcaoDerivada); 
				double erro2 = (i[k+1]-i[k])/i[k+1];
				
				if(erro2<0) {
					erro = erro2*(-1); 
				}else {
					erro= erro2;
				}
				k++;
			}
			

			System.out.printf("A taxa é igual a: %.4f",i[k]*100);
			System.out.print("%"); 
			
			
			
	}

}
