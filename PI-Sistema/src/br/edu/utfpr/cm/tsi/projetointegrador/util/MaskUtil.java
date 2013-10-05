/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.projetointegrador.util;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Daniele
 */
public class MaskUtil {
    
    
    public MaskFormatter maskData(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;  
        mask = new MaskFormatter("##/##/####");  
        mask.setOverwriteMode(true);  
        mask.setValidCharacters("0123456789");  
        mask.setPlaceholderCharacter('_');  
        mask.install(textfield);  
        return mask;  
    }

    public MaskFormatter maskCpf(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;  
        mask = new MaskFormatter("###.###.###-##");  
        mask.setOverwriteMode(true);  
        mask.setValidCharacters("0123456789");  
        mask.setPlaceholderCharacter('_');  
        mask.install(textfield);  
        return mask;  
    }
    
    public MaskFormatter maskRg(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;  
        mask = new MaskFormatter("##.###.###-#");  
        mask.setOverwriteMode(true);  
        mask.setValidCharacters("0123456789");  
        mask.setPlaceholderCharacter('_');  
        mask.install(textfield);  
        return mask;  
    }
    
    public MaskFormatter maskTelFixo(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;  
        mask = new MaskFormatter("(##)####-####");  
        mask.setOverwriteMode(true);  
        mask.setValidCharacters("0123456789");  
        mask.setPlaceholderCharacter('_');  
        mask.install(textfield);  
        return mask;  
    }
    
    public MaskFormatter maskCep(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;  
        mask = new MaskFormatter("#####-###");  
        mask.setOverwriteMode(true);  
        mask.setValidCharacters("0123456789");  
        mask.setPlaceholderCharacter('_');  
        mask.install(textfield);  
        return mask;  
    }
     public MaskFormatter maskNumeroResidencia(JFormattedTextField textfield) throws ParseException{
        MaskFormatter mask = null;  
        mask = new MaskFormatter("#####");  
        mask.setOverwriteMode(true);  
        mask.setValidCharacters("0123456789");  
        mask.setPlaceholderCharacter('_');  
        mask.install(textfield);  
        return mask;  
    }
    
}
    

