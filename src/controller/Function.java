/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class Function {
    
    public String inhoachudau(char[] str){
        for(int i = 0; i < str.length; i++){
            if(i == 0 || ( i > 0 && str[i-1] == ' ')){
                if(str[i] >= 'a' && str[i] <= 'z'){
                    str[i] = Character.toUpperCase(str[i]);
                }
            }
        }
        
        String str1 = new String(str);
        
        return str1;
    }
    
    public String xoacach(char[] str){
        int luu = 0;
        
        for(int i = 0; i < str.length; i++){
            if(str[i] != ' '){                
                luu = i; 
                break;
            }
        }
              
        String str1 = new String(Arrays.copyOfRange(str, luu, str.length));
        
        return str1;
    }
    
    public String xoacachsau(char[] str){
        int luu = 0;
        
        for(int i = str.length-1; i >= 0; i--){
            if(str[i] != ' '){                
                luu = i+1; 
                break;
            }
        }
              
        String str1 = new String(Arrays.copyOfRange(str, 0, luu));
        
        return str1;
    }
    
}