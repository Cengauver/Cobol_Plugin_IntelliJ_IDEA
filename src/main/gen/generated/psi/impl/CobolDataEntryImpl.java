// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static io.github.cengauver.cobol_plugin_intellij_idea.psi.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import io.github.cengauver.cobol_plugin_intellij_idea.psi.impl.*;

public class CobolDataEntryImpl extends ASTWrapperPsiElement implements CobolDataEntry {

  public CobolDataEntryImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitDataEntry(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolDataName getDataName() {
    return findNotNullChildByClass(CobolDataName.class);
  }

  @Override
  @NotNull
  public List<CobolDataValueClause> getDataValueClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolDataValueClause.class);
  }

  @Override
  @NotNull
  public List<CobolPictureClause> getPictureClauseList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolPictureClause.class);
  }

  @Override
  @NotNull
  public PsiElement getLineNumber() {
    return findNotNullChildByType(LINE_NUMBER);
  }

  @Override
  @NotNull
  public PsiElement getNumberLiteral() {
    return findNotNullChildByType(NUMBER_LITERAL);
  }

}
