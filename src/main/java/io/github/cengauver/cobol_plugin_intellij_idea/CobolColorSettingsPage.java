package io.github.cengauver.cobol_plugin_intellij_idea;

import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

final class CobolColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Keywords//Division_Keyword", CobolSyntaxHighlighter.DIVISION_KEYWORD),
            new AttributesDescriptor("Keywords//Keyword", CobolSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Identifier", CobolSyntaxHighlighter.IDENTIFIER),
            new AttributesDescriptor("String", CobolSyntaxHighlighter.STRING),
            new AttributesDescriptor("Number", CobolSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("Line_Number", CobolSyntaxHighlighter.LINE_NUMBER),
            new AttributesDescriptor("Operators//Relational_Operator", CobolSyntaxHighlighter.RELATIONAL_OPERATOR),
            new AttributesDescriptor("Operators//Arithmetic_Operator", CobolSyntaxHighlighter.ARITHMETIC_OPERATOR),
            new AttributesDescriptor("Dot",  CobolSyntaxHighlighter.DOT),
            new AttributesDescriptor("Comment",  CobolSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Bad_Value", CobolSyntaxHighlighter.BAD_CHARACTER)
    };

    @Override
    public Icon getIcon() {
        return CobolIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new CobolSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "01 IDENTIFICATION DIVISION.\n" +
                "02 PROGRAM-ID. HELLO.\n" +
                "03 DATA DIVISION.\n" +
                "04 WORKING-STORAGE SECTION.\n" +
                "05 01 WS-A PIC 9(2) VALUE 0.\n" +
                "06 PROCEDURE DIVISION.\n" +
                "07 A-PARA.\n" +
                "08 PERFORM B-PARA VARYING WS-A FROM 2 BY 2 UNTIL WS-A=12\n" +
                "09 STOP RUN.\n" +
                "10 B-PARA.\n" +
                "11 DISPLAY 'B-PARA ' WS-A.\n" +
                "12 DISPLAY 'B-PARA'.";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Cobol";
    }

}
