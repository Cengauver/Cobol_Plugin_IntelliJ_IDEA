package io.github.cengauver.cobol_plugin_intellij_idea.psi;

import io.github.cengauver.cobol_plugin_intellij_idea.CobolLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CobolTokenType extends IElementType {

    public CobolTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CobolLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CobolTokenType." + super.toString();
    }
}
