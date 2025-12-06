package io.github.cengauver.cobol_plugin_intellij_idea.psi;

import com.intellij.psi.tree.TokenSet;

public interface CobolTokenSets {

    TokenSet KEYWORDS = TokenSet.create(
            CobolTypes.IDENTIFICATION_KEYWORD,
            CobolTypes.DIVISION_KEYWORD,
            CobolTypes.PROGRAM_ID_KEYWORD,
            CobolTypes.DATA_KEYWORD,
            CobolTypes.WORKING_STORAGE_KEYWORD,
            CobolTypes.SECTION_KEYWORD,
            CobolTypes.PICTURE_KEYWORD,
            CobolTypes.PIC_KEYWORD,
            CobolTypes.IS_KEYWORD,
            CobolTypes.NOT_KEYWORD,
            CobolTypes.VALUE_KEYWORD,
            CobolTypes.PROCEDURE_KEYWORD,
            CobolTypes.PERFORM_KEYWORD,
            CobolTypes.VARYING_KEYWORD,
            CobolTypes.FROM_KEYWORD,
            CobolTypes.BY_KEYWORD,
            CobolTypes.UNTIL_KEYWORD,
            CobolTypes.DISPLAY_KEYWORD,
            CobolTypes.STOP_KEYWORD,
            CobolTypes.RUN_KEYWORD
    );

    // There is no comment support yet.
    TokenSet COMMENTS = TokenSet.EMPTY;

    TokenSet STRINGS = TokenSet.create(CobolTypes.STRING_LITERAL);

    TokenSet IDENTIFIERS = TokenSet.create(CobolTypes.IDENTIFIER);

    TokenSet NUMBERS = TokenSet.create(CobolTypes.NUMBER_LITERAL);

    TokenSet LINE_NUMBERS = TokenSet.create(CobolTypes.LINE_NUMBER);

    TokenSet ARITHMETIC_OPERATORS = TokenSet.create(
            CobolTypes.PLUS,
            CobolTypes.MINUS
    );

    TokenSet RELATIONAL_OPERATORS = TokenSet.create(
            CobolTypes.EQUALS,
            CobolTypes.GREATER_EQUAL,
            CobolTypes.GREATER_THAN,
            CobolTypes.LESS_EQUAL,
            CobolTypes.LESS_THAN
    );
}
