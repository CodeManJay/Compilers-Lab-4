import java_cup.runtime.Symbol; 
import java_cup.runtime.Scanner; 
%% 
%cup
%eofval{ 
System.exit(0); 
%eofval}
%% 
";"  {System.out.println("LA "+yytext());return new Symbol(sym.SEMI);} 
","  {System.out.println("LA "+yytext());return new Symbol(sym.COMMA);} 
" "  {System.out.println("LA "+yytext());return new Symbol(sym.SPACE);} 
[0-9]+ {System.out.println("LA "+yytext());return new Symbol(sym.INT,new  Integer(yytext()));} 
"int" {System.out.println("LA "+yytext());return new Symbol(sym.INT);} 
"string" {System.out.println("LA "+yytext());return new Symbol(sym.STRING);}
[a-z][a-z0-9]* {System.out.println("LA "+yytext());
return new Symbol(sym.ID,new String(yytext()));} 
[\n\r] {System.out.println("LA"+ "EOF");return new Symbol(sym.EOFILE);} 
