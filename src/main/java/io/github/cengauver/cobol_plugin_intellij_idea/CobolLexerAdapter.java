package io.github.cengauver.cobol_plugin_intellij_idea;

import com.intellij.lexer.FlexAdapter;

public class CobolLexerAdapter extends FlexAdapter {

    public CobolLexerAdapter() {
        super(new CobolLexer(null));
    }
}
