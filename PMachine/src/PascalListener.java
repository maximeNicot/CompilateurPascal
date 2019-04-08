// Generated from C:/Users/maxime/Desktop/MASTER1SEM2/PMachine/src\Pascal.g4 by ANTLR 4.7.2

import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(PascalParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(PascalParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PascalParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PascalParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#typi}.
	 * @param ctx the parse tree
	 */
	void enterTypi(PascalParser.TypiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#typi}.
	 * @param ctx the parse tree
	 */
	void exitTypi(PascalParser.TypiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(PascalParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(PascalParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(PascalParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(PascalParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleexpression(PascalParser.SimpleexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleexpression(PascalParser.SimpleexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalParser.TermContext ctx);
}