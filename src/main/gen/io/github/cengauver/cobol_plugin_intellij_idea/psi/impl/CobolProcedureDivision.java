// This is a generated file. Not intended for manual editing.
package io.github.cengauver.cobol_plugin_intellij_idea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CobolProcedureDivision extends PsiElement {

  @NotNull
  List<CobolParagraph> getParagraphList();

  @NotNull
  List<CobolSentence> getSentenceList();

  @NotNull
  PsiElement getLineNumber();

}
