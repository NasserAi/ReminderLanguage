grammar Reminder;

start : prog+ ;
prog : create
     | edit
     | delete
     | remind
     | search
     | print ;

create :
    'CREATE' OBRACE idn name content date repeat CBRACE ;

idn :
    'ID' col ID sem ;

name :
    'NAME' UDS ID col STRING sem ;

content :
    'CONTENT' UDS ID col STRING sem ;

date :
    'REMIND_DATE' UDS ID col STRING sem ;

repeat :
    'REPEAT' UDS ID col ANS sem ;


edit :
    'EDIT' OBRACE for_stat OBRACE if_stat OBRACE modify+ close CBRACE ;

modify : new_name
       | new_content
       | new_date
       | new_repeat;

new_name :
    'NEW_NAME' UDS ID col STRING sem ;

new_content :
    'NEW_CONTENT' UDS ID col STRING sem ;

new_date :
    'NEW_DATE' UDS ID col STRING sem ;

new_repeat :
    'NEW_REPEAT' UDS ID col ANS sem ;

delete :
    'DELETE' OBRACE delete_id CBRACE ;

delete_id :
    'ID' col ID sem ;

for_stat :
    for_name OPAREN init sem control sem acc CPAREN ;

for_name :
    FOR ;

init :
    I col ZERO ;

control :
    I SM DATALIST ;

acc :
    ACC;

if_stat : IF OPAREN 'ID' col ID CPAREN ;

close :
    CBRACE CBRACE;

search :
    'SEARCH' OBRACE for_stat OBRACE if_search OBRACE print_out close CBRACE ;

if_search :
    if_name OPAREN first_date to last_date CPAREN ;

to :
    TO;

if_name :
    IF ;

first_date :
    OPAREN STRING CPAREN ;

last_date :
    OPAREN STRING CPAREN ;

print_out :
    PRINT OPAREN EVENT CPAREN sem ;

print :
    'PRINT' OBRACE show_all sem for_stat OBRACE print_all cbrace CBRACE ;

show_all :
    SHOWALL ;

cbrace :
    CBRACE ;

print_all :
    PRINT OPAREN EVENT CPAREN sem ;

remind :
    'REMIND' OBRACE remind_day sem for_stat OBRACE if_remind OBRACE print_out close CBRACE ;

remind_day :
    DAYS OPAREN STRING CPAREN;

if_remind :
    if_name OPAREN STRING CPAREN ;




BLOCK_COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
SS : '**';
DAYS : 'days';
SHOWALL : 'show all';
EVENT : 'event';
PRINT : 'print';
TO : 'to';
IF : 'if';
ACC : 'i++';
DATALIST : 'datalist';
SM : '<';
I : 'i';
ZERO : '0';
FOR : 'for';
DASH: '-';
UDS : '_';
ANS : 'Yes' | 'yes' | 'No' | 'no' ;
OPAREN : '(';
CPAREN : ')';
OBRACE : '{' ;
CBRACE : '}' ;
ID : [0-9]+ ;
STRING : ( 'a'..'z' | 'A'..'Z' | '0'..'9' | '-' | '#' | ' ') ( 'a'..'z' | 'A'..'Z' | '0'..'9' | '-' | '#' | ' ')* ;
col: ':' ;
sem: ';' ;
com: ',' ;
WS : (' ' | '\t' | '\r' | '\n')+ -> skip ;
