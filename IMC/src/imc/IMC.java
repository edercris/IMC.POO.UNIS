/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import javax.swing.JOptionPane;

/**
 *
 * @author ederc
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double peso, alt, imc;
        String inserePeso,insereAlt;
        
        inserePeso = JOptionPane.showInputDialog( "Informe o peso: " );
        peso = Integer.parseInt(inserePeso);
        
        insereAlt = JOptionPane.showInputDialog( "Informe o altura em cm " );
        alt = Integer.parseInt(insereAlt);
       
        imc = ( peso / (( alt / 100 ) * ( alt / 100)) );
        
        if( imc < 17 ){
            JOptionPane.showMessageDialog(null, String.format("A classificação do seu IMC é : "+ imc) + " Muito abaixo do peso");
        }else if(( imc > 17) && (imc < 18.5 )){
            JOptionPane.showMessageDialog(null, String.format( "A classificação do seu IMC é : "+ imc) + " Abaixo do peso");
        }else if (( imc > 18.5) && (imc < 25)){
            JOptionPane.showMessageDialog(null, String.format( "A classificação do seu IMC é : "+ imc) + " Peso normal");
        }else if (( imc > 25 ) && (imc < 30)){
            JOptionPane.showMessageDialog(null, String.format( "A classificação do seu IMC é : "+ imc) + " Acima do peso");
        }else if (( imc > 30 ) && (imc < 35)){
            JOptionPane.showMessageDialog(null, String.format( "A classificação do seu IMC é : "+ imc) + " Obesidade I");
        }else if (( imc > 35 ) && (imc < 40)){
            JOptionPane.showMessageDialog(null, String.format( "A classificação do seu IMC é : "+ imc) + " Obesidade II (severa)");
        }else{
            JOptionPane.showMessageDialog(null, String.format( "A classificação do seu IMC é : "+ imc) + " Obesidade III (mórbida)" );
        }
    }
    
}
