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

public class CobolStatementImpl extends ASTWrapperPsiElement implements CobolStatement {

  public CobolStatementImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CobolDisplayStatement getDisplayStatement() {
    return findChildByClass(CobolDisplayStatement.class);
  }

  @Override
  @Nullable
  public CobolPerformVaryingStatement getPerformVaryingStatement() {
    return findChildByClass(CobolPerformVaryingStatement.class);
  }

  @Override
  @Nullable
  public CobolStopStatement getStopStatement() {
    return findChildByClass(CobolStopStatement.class);
  }

}
