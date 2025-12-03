package io.github.cengauver.cobol_plugin_intellij_idea;

// Copyright 2000-2024 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.


import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class CobolFileType extends LanguageFileType {

    public static final CobolFileType INSTANCE = new CobolFileType();

    private CobolFileType() {
        super(CobolLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Cobol File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Cobol language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cbl";
    }

    // TODO: Add cob as an extension as well (plugin.xml has a config for that).

    @Override
    public Icon getIcon() {
        return CobolIcons.FILE;
    }

}
