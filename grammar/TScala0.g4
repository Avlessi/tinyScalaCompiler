grammar TScala0;
     
// regles syntaxiques
program : expr tclass*
        ;
tclass  : CLASS CLASSID LPAR params ? RPAR '{' method * '}'     
        ;
method  : ID LPAR params ? RPAR (':' CLASSID) ? ASSIGN expr 
        ;
params  : param (',' param)*
        ;
param   : ID ':' CLASSID
        ;

expr    : INTLIT                         # IntLit
        | BOOLIT                         # BooLit
        | STRLIT                         # StrLit
        | THIS                           # This
        | NULL                           # Null
        | ID                             # Variable
        | expr '.' ID LPAR exprs ? RPAR  # MethodCall   
        | expr '.' ID                    # FieldAccess                
        | ID LPAR exprs ? RPAR           # LocalMethodCall
        | CLASSID LPAR exprs ? RPAR      # ConstrCall
        | OP1 expr                       # UnExpr      
        | expr OP2 expr                  # BinExpr
        | expr '?' expr ':' expr         # CondExpr         
        | LPAR expr RPAR                 # ParExpr
        ;

exprs : expr (',' expr)*
      ;        
        
// regles lexicales
CLASS: 'class'
     ;
NULL : 'null'
     ;
THIS : 'this'
     ;
BOOLIT  : 'true' | 'false'
        ;
CLASSID : [A-Z][a-zA-Z0-9]*       
        ;
ID      : [a-z][a-zA-Z0-9]*
        ;
INTLIT  : '0' | [1-9][0-9]*
        ;

STRLIT  : '"' (ESC | .)*? '"'          
        ;
OP1     : '-' | '!'
        ;
OP2     : '*' | '/' | '+' | '-' | '&&' | '||' | '==' | '!=' | '>' | '>=' | '<' | '<='   
        ;
ASSIGN  : '='
        ;       
LPAR : '('
     ;
RPAR : ')'
     ;


fragment ESC : '\\' [btnr"\\]
        ;
COMMENT : '//' .*? '\r'? '\n' -> skip // line comment
        ;
WS      : [\n\t\r ] -> skip
        ;
