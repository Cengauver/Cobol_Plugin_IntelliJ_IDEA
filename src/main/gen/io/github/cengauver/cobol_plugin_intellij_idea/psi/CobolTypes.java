// This is a generated file. Not intended for manual editing.
package io.github.cengauver.cobol_plugin_intellij_idea.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import generated.psi.impl.*;

public interface CobolTypes {

  IElementType ARITHMETIC_EXP = new CobolElementType("ARITHMETIC_EXP");
  IElementType CONDITION = new CobolElementType("CONDITION");
  IElementType DATA_CONTENT = new CobolElementType("DATA_CONTENT");
  IElementType DATA_DIVISION = new CobolElementType("DATA_DIVISION");
  IElementType DATA_ENTRY = new CobolElementType("DATA_ENTRY");
  IElementType DATA_NAME = new CobolElementType("DATA_NAME");
  IElementType DATA_VALUE_CLAUSE = new CobolElementType("DATA_VALUE_CLAUSE");
  IElementType DISPLAY_STATEMENT = new CobolElementType("DISPLAY_STATEMENT");
  IElementType IDENTIFICATION_DIVISION = new CobolElementType("IDENTIFICATION_DIVISION");
  IElementType PARAGRAPH = new CobolElementType("PARAGRAPH");
  IElementType PARAGRAPH_NAME = new CobolElementType("PARAGRAPH_NAME");
  IElementType PERFORM_VARYING_STATEMENT = new CobolElementType("PERFORM_VARYING_STATEMENT");
  IElementType PICTURE_CLAUSE = new CobolElementType("PICTURE_CLAUSE");
  IElementType PICTURE_STRING = new CobolElementType("PICTURE_STRING");
  IElementType PIC_TYPE = new CobolElementType("PIC_TYPE");
  IElementType PROCEDURE_DIVISION = new CobolElementType("PROCEDURE_DIVISION");
  IElementType RELATIONAL_OPERATOR = new CobolElementType("RELATIONAL_OPERATOR");
  IElementType SENTENCE = new CobolElementType("SENTENCE");
  IElementType STATEMENT = new CobolElementType("STATEMENT");
  IElementType STOP_STATEMENT = new CobolElementType("STOP_STATEMENT");

  IElementType BY_KEYWORD = new CobolTokenType("BY");
  IElementType DATA_KEYWORD = new CobolTokenType("DATA");
  IElementType DISPLAY_KEYWORD = new CobolTokenType("DISPLAY");
  IElementType DIVISION_KEYWORD = new CobolTokenType("DIVISION");
  IElementType EQUALS = new CobolTokenType("=");
  IElementType FROM_KEYWORD = new CobolTokenType("FROM");
  IElementType GREATER_EQUAL = new CobolTokenType(">=");
  IElementType GREATER_THAN = new CobolTokenType(">");
  IElementType IDENTIFICATION_KEYWORD = new CobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType IS_KEYWORD = new CobolTokenType("IS");
  IElementType LESS_EQUAL = new CobolTokenType("<=");
  IElementType LESS_THAN = new CobolTokenType("<");
  IElementType LINE_NUMBER = new CobolTokenType("LINE_NUMBER");
  IElementType LPAREN = new CobolTokenType("(");
  IElementType MINUS = new CobolTokenType("-");
  IElementType NOT_KEYWORD = new CobolTokenType("NOT");
  IElementType NUMBER_LITERAL = new CobolTokenType("NUMBER_LITERAL");
  IElementType PERFORM_KEYWORD = new CobolTokenType("PERFORM");
  IElementType PERIOD = new CobolTokenType(".");
  IElementType PICTURE_KEYWORD = new CobolTokenType("PICTURE");
  IElementType PIC_KEYWORD = new CobolTokenType("PIC");
  IElementType PLUS = new CobolTokenType("+");
  IElementType PROCEDURE_KEYWORD = new CobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID_KEYWORD = new CobolTokenType("PROGRAM-ID");
  IElementType RPAREN = new CobolTokenType(")");
  IElementType RUN_KEYWORD = new CobolTokenType("RUN");
  IElementType SECTION_KEYWORD = new CobolTokenType("SECTION");
  IElementType SINGLE_QUOTE = new CobolTokenType("'");
  IElementType STOP_KEYWORD = new CobolTokenType("STOP");
  IElementType UNTIL_KEYWORD = new CobolTokenType("UNTIL");
  IElementType VALUE_KEYWORD = new CobolTokenType("VALUE");
  IElementType VARYING_KEYWORD = new CobolTokenType("VARYING");
  IElementType WORKING_STORAGE_KEYWORD = new CobolTokenType("WORKING-STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ARITHMETIC_EXP) {
        return new CobolArithmeticExpImpl(node);
      }
      else if (type == CONDITION) {
        return new CobolConditionImpl(node);
      }
      else if (type == DATA_CONTENT) {
        return new CobolDataContentImpl(node);
      }
      else if (type == DATA_DIVISION) {
        return new CobolDataDivisionImpl(node);
      }
      else if (type == DATA_ENTRY) {
        return new CobolDataEntryImpl(node);
      }
      else if (type == DATA_NAME) {
        return new CobolDataNameImpl(node);
      }
      else if (type == DATA_VALUE_CLAUSE) {
        return new CobolDataValueClauseImpl(node);
      }
      else if (type == DISPLAY_STATEMENT) {
        return new CobolDisplayStatementImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new CobolIdentificationDivisionImpl(node);
      }
      else if (type == PARAGRAPH) {
        return new CobolParagraphImpl(node);
      }
      else if (type == PARAGRAPH_NAME) {
        return new CobolParagraphNameImpl(node);
      }
      else if (type == PERFORM_VARYING_STATEMENT) {
        return new CobolPerformVaryingStatementImpl(node);
      }
      else if (type == PICTURE_CLAUSE) {
        return new CobolPictureClauseImpl(node);
      }
      else if (type == PICTURE_STRING) {
        return new CobolPictureStringImpl(node);
      }
      else if (type == PIC_TYPE) {
        return new CobolPicTypeImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolProcedureDivisionImpl(node);
      }
      else if (type == RELATIONAL_OPERATOR) {
        return new CobolRelationalOperatorImpl(node);
      }
      else if (type == SENTENCE) {
        return new CobolSentenceImpl(node);
      }
      else if (type == STATEMENT) {
        return new CobolStatementImpl(node);
      }
      else if (type == STOP_STATEMENT) {
        return new CobolStopStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
