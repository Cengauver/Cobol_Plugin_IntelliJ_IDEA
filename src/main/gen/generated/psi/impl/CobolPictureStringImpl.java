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

public class CobolPictureStringImpl extends ASTWrapperPsiElement implements CobolPictureString {

  public CobolPictureStringImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitPictureString(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolPicType getPicType() {
    return findNotNullChildByClass(CobolPicType.class);
  }

  @Override
  @NotNull
  public PsiElement getNumberLiteral() {
    return findNotNullChildByType(NUMBER_LITERAL);
  }

}
