package io.github.cengauver.cobol_plugin_intellij_idea;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import io.github.cengauver.cobol_plugin_intellij_idea.parser.CobolParser;
import io.github.cengauver.cobol_plugin_intellij_idea.psi.CobolFile;
import io.github.cengauver.cobol_plugin_intellij_idea.psi.CobolTokenSets;
import io.github.cengauver.cobol_plugin_intellij_idea.psi.CobolTypes;
import org.jetbrains.annotations.NotNull;


public class CobolParserDefinition implements ParserDefinition{

    public static final IFileElementType FILE = new IFileElementType(CobolLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new CobolLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return CobolTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return CobolTokenSets.STRINGS;
    }

    @NotNull
    @Override
    public  PsiParser createParser(Project project) {
        return new CobolParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new CobolFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return CobolTypes.Factory.createElement(node);
    }
}
