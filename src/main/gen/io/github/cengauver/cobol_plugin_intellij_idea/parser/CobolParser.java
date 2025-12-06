// This is a generated file. Not intended for manual editing.
package io.github.cengauver.cobol_plugin_intellij_idea.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static io.github.cengauver.cobol_plugin_intellij_idea.psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cobol_source(b, l + 1);
  }

  /* ********************************************************** */
  // (IDENTIFIER | NUMBER_LITERAL) ((PLUS|MINUS) (IDENTIFIER | NUMBER_LITERAL))*
  public static boolean arithmetic_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmetic_exp")) return false;
    if (!nextTokenIs(b, "<arithmetic exp>", IDENTIFIER, NUMBER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARITHMETIC_EXP, "<arithmetic exp>");
    r = arithmetic_exp_0(b, l + 1);
    r = r && arithmetic_exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // IDENTIFIER | NUMBER_LITERAL
  private static boolean arithmetic_exp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmetic_exp_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    return r;
  }

  // ((PLUS|MINUS) (IDENTIFIER | NUMBER_LITERAL))*
  private static boolean arithmetic_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmetic_exp_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!arithmetic_exp_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arithmetic_exp_1", c)) break;
    }
    return true;
  }

  // (PLUS|MINUS) (IDENTIFIER | NUMBER_LITERAL)
  private static boolean arithmetic_exp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmetic_exp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = arithmetic_exp_1_0_0(b, l + 1);
    r = r && arithmetic_exp_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS|MINUS
  private static boolean arithmetic_exp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmetic_exp_1_0_0")) return false;
    boolean r;
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    return r;
  }

  // IDENTIFIER | NUMBER_LITERAL
  private static boolean arithmetic_exp_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arithmetic_exp_1_0_1")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    return r;
  }

  /* ********************************************************** */
  // identification_division data_division? procedure_division?
  static boolean cobol_source(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobol_source")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identification_division(b, l + 1);
    r = r && cobol_source_1(b, l + 1);
    r = r && cobol_source_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // data_division?
  private static boolean cobol_source_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobol_source_1")) return false;
    data_division(b, l + 1);
    return true;
  }

  // procedure_division?
  private static boolean cobol_source_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobol_source_2")) return false;
    procedure_division(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // arithmetic_exp relational_operator arithmetic_exp
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    if (!nextTokenIs(b, "<condition>", IDENTIFIER, NUMBER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = arithmetic_exp(b, l + 1);
    r = r && relational_operator(b, l + 1);
    r = r && arithmetic_exp(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (LINE_NUMBER WORKING_STORAGE_KEYWORD SECTION_KEYWORD PERIOD (data_entry)* )?
  public static boolean data_content(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_content")) return false;
    Marker m = enter_section_(b, l, _NONE_, DATA_CONTENT, "<data content>");
    data_content_0(b, l + 1);
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  // LINE_NUMBER WORKING_STORAGE_KEYWORD SECTION_KEYWORD PERIOD (data_entry)*
  private static boolean data_content_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_content_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, WORKING_STORAGE_KEYWORD, SECTION_KEYWORD, PERIOD);
    r = r && data_content_0_4(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (data_entry)*
  private static boolean data_content_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_content_0_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_content_0_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_content_0_4", c)) break;
    }
    return true;
  }

  // (data_entry)
  private static boolean data_content_0_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_content_0_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = data_entry(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER DATA_KEYWORD DIVISION_KEYWORD PERIOD data_content
  public static boolean data_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_division")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, DATA_KEYWORD, DIVISION_KEYWORD, PERIOD);
    r = r && data_content(b, l + 1);
    exit_section_(b, m, DATA_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER NUMBER_LITERAL data_name (picture_clause | data_value_clause)*
  public static boolean data_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_entry")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, NUMBER_LITERAL);
    r = r && data_name(b, l + 1);
    r = r && data_entry_3(b, l + 1);
    exit_section_(b, m, DATA_ENTRY, r);
    return r;
  }

  // (picture_clause | data_value_clause)*
  private static boolean data_entry_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_entry_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!data_entry_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "data_entry_3", c)) break;
    }
    return true;
  }

  // picture_clause | data_value_clause
  private static boolean data_entry_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_entry_3_0")) return false;
    boolean r;
    r = picture_clause(b, l + 1);
    if (!r) r = data_value_clause(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean data_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, DATA_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // VALUE_KEYWORD IS_KEYWORD? NUMBER_LITERAL PERIOD?
  public static boolean data_value_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_value_clause")) return false;
    if (!nextTokenIs(b, VALUE_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE_KEYWORD);
    r = r && data_value_clause_1(b, l + 1);
    r = r && consumeToken(b, NUMBER_LITERAL);
    r = r && data_value_clause_3(b, l + 1);
    exit_section_(b, m, DATA_VALUE_CLAUSE, r);
    return r;
  }

  // IS_KEYWORD?
  private static boolean data_value_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_value_clause_1")) return false;
    consumeToken(b, IS_KEYWORD);
    return true;
  }

  // PERIOD?
  private static boolean data_value_clause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_value_clause_3")) return false;
    consumeToken(b, PERIOD);
    return true;
  }

  /* ********************************************************** */
  // LINE_NUMBER DISPLAY_KEYWORD (IDENTIFIER | NUMBER_LITERAL | STRING_LITERAL)+
  public static boolean display_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, DISPLAY_STATEMENT, null);
    r = consumeTokens(b, 2, LINE_NUMBER, DISPLAY_KEYWORD);
    p = r; // pin = 2
    r = r && display_statement_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // (IDENTIFIER | NUMBER_LITERAL | STRING_LITERAL)+
  private static boolean display_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = display_statement_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!display_statement_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "display_statement_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | NUMBER_LITERAL | STRING_LITERAL
  private static boolean display_statement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_statement_2_0")) return false;
    boolean r;
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER IDENTIFICATION_KEYWORD DIVISION_KEYWORD PERIOD LINE_NUMBER PROGRAM_ID_KEYWORD PERIOD? IDENTIFIER PERIOD?
  public static boolean identification_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identification_division")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, IDENTIFICATION_KEYWORD, DIVISION_KEYWORD, PERIOD, LINE_NUMBER, PROGRAM_ID_KEYWORD);
    r = r && identification_division_6(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && identification_division_8(b, l + 1);
    exit_section_(b, m, IDENTIFICATION_DIVISION, r);
    return r;
  }

  // PERIOD?
  private static boolean identification_division_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identification_division_6")) return false;
    consumeToken(b, PERIOD);
    return true;
  }

  // PERIOD?
  private static boolean identification_division_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identification_division_8")) return false;
    consumeToken(b, PERIOD);
    return true;
  }

  /* ********************************************************** */
  // LINE_NUMBER paragraph_name PERIOD (sentence)*
  public static boolean paragraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LINE_NUMBER);
    r = r && paragraph_name(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    r = r && paragraph_3(b, l + 1);
    exit_section_(b, m, PARAGRAPH, r);
    return r;
  }

  // (sentence)*
  private static boolean paragraph_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paragraph_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paragraph_3", c)) break;
    }
    return true;
  }

  // (sentence)
  private static boolean paragraph_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sentence(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  public static boolean paragraph_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, PARAGRAPH_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER PERFORM_KEYWORD IDENTIFIER VARYING_KEYWORD IDENTIFIER FROM_KEYWORD NUMBER_LITERAL BY_KEYWORD NUMBER_LITERAL UNTIL_KEYWORD condition
  public static boolean perform_varying_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_varying_statement")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, PERFORM_VARYING_STATEMENT, null);
    r = consumeTokens(b, 2, LINE_NUMBER, PERFORM_KEYWORD, IDENTIFIER, VARYING_KEYWORD, IDENTIFIER, FROM_KEYWORD, NUMBER_LITERAL, BY_KEYWORD, NUMBER_LITERAL, UNTIL_KEYWORD);
    p = r; // pin = 2
    r = r && condition(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  /* ********************************************************** */
  // NUMBER_LITERAL | IDENTIFIER
  public static boolean pic_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pic_type")) return false;
    if (!nextTokenIs(b, "<pic type>", IDENTIFIER, NUMBER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PIC_TYPE, "<pic type>");
    r = consumeToken(b, NUMBER_LITERAL);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (PIC_KEYWORD | PICTURE_KEYWORD) IS_KEYWORD? picture_string
  public static boolean picture_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picture_clause")) return false;
    if (!nextTokenIs(b, "<picture clause>", PICTURE_KEYWORD, PIC_KEYWORD)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_CLAUSE, "<picture clause>");
    r = picture_clause_0(b, l + 1);
    r = r && picture_clause_1(b, l + 1);
    r = r && picture_string(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // PIC_KEYWORD | PICTURE_KEYWORD
  private static boolean picture_clause_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picture_clause_0")) return false;
    boolean r;
    r = consumeToken(b, PIC_KEYWORD);
    if (!r) r = consumeToken(b, PICTURE_KEYWORD);
    return r;
  }

  // IS_KEYWORD?
  private static boolean picture_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picture_clause_1")) return false;
    consumeToken(b, IS_KEYWORD);
    return true;
  }

  /* ********************************************************** */
  // pic_type (LPAREN NUMBER_LITERAL RPAREN)?
  public static boolean picture_string(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picture_string")) return false;
    if (!nextTokenIs(b, "<picture string>", IDENTIFIER, NUMBER_LITERAL)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PICTURE_STRING, "<picture string>");
    r = pic_type(b, l + 1);
    r = r && picture_string_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LPAREN NUMBER_LITERAL RPAREN)?
  private static boolean picture_string_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picture_string_1")) return false;
    picture_string_1_0(b, l + 1);
    return true;
  }

  // LPAREN NUMBER_LITERAL RPAREN
  private static boolean picture_string_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "picture_string_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LPAREN, NUMBER_LITERAL, RPAREN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER PROCEDURE_KEYWORD DIVISION_KEYWORD PERIOD sentence* paragraph*
  public static boolean procedure_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_division")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, PROCEDURE_KEYWORD, DIVISION_KEYWORD, PERIOD);
    r = r && procedure_division_4(b, l + 1);
    r = r && procedure_division_5(b, l + 1);
    exit_section_(b, m, PROCEDURE_DIVISION, r);
    return r;
  }

  // sentence*
  private static boolean procedure_division_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_division_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sentence(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "procedure_division_4", c)) break;
    }
    return true;
  }

  // paragraph*
  private static boolean procedure_division_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_division_5")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paragraph(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "procedure_division_5", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IS_KEYWORD | NOT_KEYWORD | GREATER_EQUAL | LESS_EQUAL | GREATER_THAN | LESS_THAN | EQUALS
  public static boolean relational_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_OPERATOR, "<relational operator>");
    r = consumeToken(b, IS_KEYWORD);
    if (!r) r = consumeToken(b, NOT_KEYWORD);
    if (!r) r = consumeToken(b, GREATER_EQUAL);
    if (!r) r = consumeToken(b, LESS_EQUAL);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, EQUALS);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (statement)+ PERIOD
  public static boolean sentence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sentence_0(b, l + 1);
    r = r && consumeToken(b, PERIOD);
    exit_section_(b, m, SENTENCE, r);
    return r;
  }

  // (statement)+
  private static boolean sentence_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = sentence_0_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!sentence_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "sentence_0", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (statement)
  private static boolean sentence_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // perform_varying_statement|display_statement|stop_statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = perform_varying_statement(b, l + 1);
    if (!r) r = display_statement(b, l + 1);
    if (!r) r = stop_statement(b, l + 1);
    exit_section_(b, m, STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER STOP_KEYWORD (RUN_KEYWORD|IDENTIFIER|NUMBER_LITERAL)
  public static boolean stop_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_statement")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, STOP_STATEMENT, null);
    r = consumeTokens(b, 2, LINE_NUMBER, STOP_KEYWORD);
    p = r; // pin = 2
    r = r && stop_statement_2(b, l + 1);
    exit_section_(b, l, m, r, p, null);
    return r || p;
  }

  // RUN_KEYWORD|IDENTIFIER|NUMBER_LITERAL
  private static boolean stop_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_statement_2")) return false;
    boolean r;
    r = consumeToken(b, RUN_KEYWORD);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER_LITERAL);
    return r;
  }

}
