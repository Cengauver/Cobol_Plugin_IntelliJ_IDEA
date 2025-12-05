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

public class CobolConditionImpl extends ASTWrapperPsiElement implements CobolCondition {

  public CobolConditionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitCondition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<CobolArithmeticExp> getArithmeticExpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, CobolArithmeticExp.class);
  }

  @Override
  @NotNull
  public CobolRelationalOperator getRelationalOperator() {
    return findNotNullChildByClass(CobolRelationalOperator.class);
  }

}
