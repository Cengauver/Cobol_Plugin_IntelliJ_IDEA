package io.github.cengauver.cobol_plugin_intellij_idea;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.SimpleTypes;
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

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
DIGIT=[0-9]
ALPHA=[a-zA-Z]
ID_CHAR=[a-zA-Z0-9\-]


%xstate CODE_STATE

%%

<YYINITIAL> {DIGIT}{2} { yybegin(YYINITIAL) return CobolTypes.}