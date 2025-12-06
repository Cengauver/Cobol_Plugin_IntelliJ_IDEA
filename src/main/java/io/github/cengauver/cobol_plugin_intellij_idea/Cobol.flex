package io.github.cengauver.cobol_plugin_intellij_idea;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import io.github.cengauver.cobol_plugin_intellij_idea.psi.CobolTypes;
import com.intellij.psi.TokenType;

%%

%class CobolLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{
    return;
%eof}

//Basic characters
CRLF=\R
WHITE_SPACE=[\ \n\t\f]
DIGIT=[0-9]
ALPHA=[a-zA-Z]
ID_CHAR=[a-zA-Z0-9\-]

//Keywords
IDENTIFICATION_KEYWORD = "IDENTIFICATION"
DIVISION_KEYWORD = "DIVISION"
PROGRAM_ID_KEYWORD = "PROGRAM-ID"
DATA_KEYWORD = "DATA"
WORKING_STORAGE_KEYWORD = "WORKING-STORAGE"
SECTION_KEYWORD = "SECTION"
PICTURE_KEYWORD = "PICTURE"
PIC_KEYWORD = "PIC"
IS_KEYWORD = "IS"
NOT_KEYWORD = "NOT"
VALUE_KEYWORD = "VALUE"
PROCEDURE_KEYWORD = "PROCEDURE"
PERFORM_KEYWORD = "PERFORM"
VARYING_KEYWORD = "VARYING"
FROM_KEYWORD = "FROM"
BY_KEYWORD = "BY"
UNTIL_KEYWORD = "UNTIL"
DISPLAY_KEYWORD = "DISPLAY"
STOP_KEYWORD = "STOP"
RUN_KEYWORD = "RUN"

PLUS = "+"
MINUS = "-"
EQUALS = "="
GREATER_THAN = ">"
LESS_THAN = "<"
GREATER_EQUAL = ">="
LESS_EQUAL = "<="
PERIOD = "."
LPAREN = "("
RPAREN = ")"
SINGLE_QUOTE = "'"


%xstate CODE_STATE

%%

<YYINITIAL> {DIGIT}{2} { yybegin(CODE_STATE); return CobolTypes.LINE_NUMBER; }

<CODE_STATE> {

    // 1. KEYWORDS
    {IDENTIFICATION_KEYWORD}  { return CobolTypes.IDENTIFICATION_KEYWORD; }
    {DIVISION_KEYWORD}        { return CobolTypes.DIVISION_KEYWORD; }
    {PROGRAM_ID_KEYWORD}      { return CobolTypes.PROGRAM_ID_KEYWORD; }
    {DATA_KEYWORD}            { return CobolTypes.DATA_KEYWORD; }
    {WORKING_STORAGE_KEYWORD} { return CobolTypes.WORKING_STORAGE_KEYWORD; }
    {SECTION_KEYWORD}         { return CobolTypes.SECTION_KEYWORD; }
    {PROCEDURE_KEYWORD}       { return CobolTypes.PROCEDURE_KEYWORD; }
    {PICTURE_KEYWORD}         { return CobolTypes.PICTURE_KEYWORD; }
    {PIC_KEYWORD}             { return CobolTypes.PIC_KEYWORD; }
    {IS_KEYWORD}              { return CobolTypes.IS_KEYWORD; }
    {NOT_KEYWORD}             { return CobolTypes.NOT_KEYWORD; }
    {VALUE_KEYWORD}           { return CobolTypes.VALUE_KEYWORD; }
    {PERFORM_KEYWORD}         { return CobolTypes.PERFORM_KEYWORD; }
    {VARYING_KEYWORD}         { return CobolTypes.VARYING_KEYWORD; }
    {FROM_KEYWORD}            { return CobolTypes.FROM_KEYWORD; }
    {BY_KEYWORD}              { return CobolTypes.BY_KEYWORD; }
    {UNTIL_KEYWORD}           { return CobolTypes.UNTIL_KEYWORD; }
    {STOP_KEYWORD}            { return CobolTypes.STOP_KEYWORD; }
    {RUN_KEYWORD}             { return CobolTypes.RUN_KEYWORD; }
    {DISPLAY_KEYWORD}         { return CobolTypes.DISPLAY_KEYWORD; }

    // 2. OPERATORS & PUNCTUATION
    {PLUS}                    { return CobolTypes.PLUS; }
    {MINUS}                   { return CobolTypes.MINUS; }
    {EQUALS}                  { return CobolTypes.EQUALS; }
    {GREATER_THAN}            { return CobolTypes.GREATER_THAN; }
    {LESS_THAN}               { return CobolTypes.LESS_THAN; }
    {GREATER_EQUAL}           { return CobolTypes.GREATER_EQUAL; }
    {LESS_EQUAL}              { return CobolTypes.LESS_EQUAL; }
    {PERIOD}                  { return CobolTypes.PERIOD; }
    {LPAREN}                  { return CobolTypes.LPAREN; }
    {RPAREN}                  { return CobolTypes.RPAREN; }

    // 3. STRING LITERALS
    // Matches: A single quote, followed by anything NOT a quote/newline, ending with a quote.
    {SINGLE_QUOTE} [^'\n\r]* {SINGLE_QUOTE} { return CobolTypes.STRING_LITERAL; }

    // 4. USER DEFINED LITERALS & IDENTIFIERS
    // (Keep these BELOW keywords so "DATA" isn't matched as an ID)
    {DIGIT}+                  { return CobolTypes.NUMBER_LITERAL; }
    {ID_CHAR}+                { return CobolTypes.IDENTIFIER; }

    // 5. HOUSEKEEPING
    {WHITE_SPACE}+            { return TokenType.WHITE_SPACE; }
    {CRLF}                    { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

    // 6. ERROR FALLBACK (Crucial!)
    // If we are in CODE_STATE and see something weird, mark it BAD.
    [^]                       { return TokenType.BAD_CHARACTER; }
}

// Global Error Fallback (For YYINITIAL)
[^] { return TokenType.BAD_CHARACTER; }


