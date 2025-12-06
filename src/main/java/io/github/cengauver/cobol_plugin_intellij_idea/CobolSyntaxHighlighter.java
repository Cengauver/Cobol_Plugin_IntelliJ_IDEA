package io.github.cengauver.cobol_plugin_intellij_idea;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import io.github.cengauver.cobol_plugin_intellij_idea.psi.CobolTokenSets;
import io.github.cengauver.cobol_plugin_intellij_idea.psi.CobolTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class CobolSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey DIVISION_KEYWORD = createTextAttributesKey("DIVISION_KEYWORD", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("COBOL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("COBOL_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey STRING = createTextAttributesKey("COBOL_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER =  createTextAttributesKey("COBOL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey LINE_NUMBER = createTextAttributesKey("COBOL_LINE_NUMBER", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey RELATIONAL_OPERATOR = createTextAttributesKey("COBOL_RELATIONAL_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey ARITHMETIC_OPERATOR = createTextAttributesKey("COBOL_ARITHMETIC_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey DOT = createTextAttributesKey("COBOL_PUNCTUATION", DefaultLanguageHighlighterColors.DOT);

    public static final TextAttributesKey COMMENT = createTextAttributesKey("COBOL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("COBOL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);


    private static final TextAttributesKey[] DIVISION_KEYWORD_KEYS = new TextAttributesKey[]{DIVISION_KEYWORD};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] LINE_NUMBER_KEYS = new TextAttributesKey[]{LINE_NUMBER};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{ARITHMETIC_OPERATOR, RELATIONAL_OPERATOR};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] DOT_KEYS = new TextAttributesKey[]{DOT};

    private static final TextAttributesKey[] BAD_CHARACTER_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new CobolLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(CobolTypes.STRING_LITERAL)) {
            return STRING_KEYS;
        }
        if (tokenType.equals(CobolTypes.NUMBER_LITERAL)) {
            return NUMBER_KEYS;
        }
        if (tokenType.equals(CobolTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        }
        if (tokenType.equals(CobolTypes.LINE_NUMBER)) {
            return LINE_NUMBER_KEYS;
        }
        if (tokenType.equals(CobolTypes.PERIOD)) {
            return DOT_KEYS;
        }
        // It is crucial that division keyword condition check is set before the keyword condition check.
        if (CobolTokenSets.DIVISION_KEYWORDS.contains(tokenType)) {
            return DIVISION_KEYWORD_KEYS;
        }
        if (CobolTokenSets.KEYWORDS.contains(tokenType)) {
            return KEYWORD_KEYS;
        }
        if (CobolTokenSets.COMMENTS.contains(tokenType)) {
            return COMMENT_KEYS;
        }
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHARACTER_KEYS;
        }
        return EMPTY_KEYS;
    }


}
