package eleição;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

   int eleitores = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de eleitores:"));
   int candidatos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de candidatos:"));    
   String[] nmcandidatos = new String[candidatos];
   int[] vtcandidato = new int[candidatos];    
   int branco = 0;
   int nulo = 0;
  
     for (int i = 0; i < candidatos; i++) { 	
        nmcandidatos[i] = JOptionPane.showInputDialog("Insira o nome do candidato " + (i + 1) + ":");
        }

     for (int e = 1; e <= eleitores; e++) {
        int voto = Integer.parseInt(JOptionPane.showInputDialog("insira o seu voto:"));
            
        if (voto == 0) {
           branco++;
           
        } else if (voto > 0 && voto <= candidatos) {
        vtcandidato[voto - 1]++;
        
        } else {
           nulo++;
      }
   }

        String resultado = " Resultados \n";
        
   int maisVotos = -1;
   int vencedor = -1;

     for (int i = 0; i < candidatos; i++) {
        resultado += nmcandidatos[i] + ": " + vtcandidato[i] + " votos";
            
     if (vtcandidato[i] > maisVotos) {
        maisVotos = vtcandidato[i];
        vencedor = i;
        
        } else if (vtcandidato[i] == maisVotos && maisVotos > 0) {
      }
   }

        resultado += "Votos em Branco: " + branco;
        resultado += "Votos Nulos: " + nulo + "\n";

     if (maisVotos == 0 && candidatos > 0) {
            resultado += "A eleição não teve votos";
            
    } else if (vencedor != -1) {
            resultado += "O vencedor é: " + nmcandidatos[vencedor] + " com " + maisVotos + " votos";
     }

        JOptionPane.showMessageDialog(null, resultado);
   }
}