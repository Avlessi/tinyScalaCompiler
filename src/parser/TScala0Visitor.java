// Generated from D:\MyProjects\Eclipse\LunaWorkspace\tinyScala0\src\parser\TScala0.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TScala0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TScala0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TScala0Parser#ConstrCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrCall(@NotNull TScala0Parser.ConstrCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#BooLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooLit(@NotNull TScala0Parser.BooLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#Variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull TScala0Parser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#LocalMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalMethodCall(@NotNull TScala0Parser.LocalMethodCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(@NotNull TScala0Parser.ParamContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#IntLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(@NotNull TScala0Parser.IntLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull TScala0Parser.ParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#MethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(@NotNull TScala0Parser.MethodCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#tclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTclass(@NotNull TScala0Parser.TclassContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#This}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(@NotNull TScala0Parser.ThisContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#BinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinExpr(@NotNull TScala0Parser.BinExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#StrLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLit(@NotNull TScala0Parser.StrLitContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#FieldAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(@NotNull TScala0Parser.FieldAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull TScala0Parser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#CondExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(@NotNull TScala0Parser.CondExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull TScala0Parser.MethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#exprs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprs(@NotNull TScala0Parser.ExprsContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#UnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnExpr(@NotNull TScala0Parser.UnExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#Null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(@NotNull TScala0Parser.NullContext ctx);

	/**
	 * Visit a parse tree produced by {@link TScala0Parser#ParExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(@NotNull TScala0Parser.ParExprContext ctx);
}