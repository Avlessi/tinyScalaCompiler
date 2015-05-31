// Generated from D:\MyProjects\Eclipse\LunaWorkspace\tinyScala0\src\parser\TScala0.g4 by ANTLR 4.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TScala0Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, CLASS=7, NULL=8, THIS=9, 
		BOOLIT=10, CLASSID=11, ID=12, INTLIT=13, STRLIT=14, OP1=15, OP2=16, ASSIGN=17, 
		LPAR=18, RPAR=19, COMMENT=20, WS=21;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'.'", "','", "':'", "'}'", "'?'", "'class'", "'null'", 
		"'this'", "BOOLIT", "CLASSID", "ID", "INTLIT", "STRLIT", "OP1", "OP2", 
		"'='", "'('", "')'", "COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_tclass = 1, RULE_method = 2, RULE_params = 3, RULE_param = 4, 
		RULE_expr = 5, RULE_exprs = 6;
	public static final String[] ruleNames = {
		"program", "tclass", "method", "params", "param", "expr", "exprs"
	};

	@Override
	public String getGrammarFileName() { return "TScala0.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TScala0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<TclassContext> tclass() {
			return getRuleContexts(TclassContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TclassContext tclass(int i) {
			return getRuleContext(TclassContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); expr(0);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(15); tclass();
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TclassContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TScala0Parser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TScala0Parser.LPAR, 0); }
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public TerminalNode CLASSID() { return getToken(TScala0Parser.CLASSID, 0); }
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public TerminalNode CLASS() { return getToken(TScala0Parser.CLASS, 0); }
		public TclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tclass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitTclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TclassContext tclass() throws RecognitionException {
		TclassContext _localctx = new TclassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); match(CLASS);
			setState(22); match(CLASSID);
			setState(23); match(LPAR);
			setState(25);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(24); params();
				}
			}

			setState(27); match(RPAR);
			setState(28); match(1);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(29); method();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35); match(5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TScala0Parser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TScala0Parser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TScala0Parser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(TScala0Parser.ID, 0); }
		public TerminalNode CLASSID() { return getToken(TScala0Parser.CLASSID, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(ID);
			setState(38); match(LPAR);
			setState(40);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(39); params();
				}
			}

			setState(42); match(RPAR);
			setState(45);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(43); match(4);
				setState(44); match(CLASSID);
				}
			}

			setState(47); match(ASSIGN);
			setState(48); expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); param();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(51); match(3);
				setState(52); param();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TScala0Parser.ID, 0); }
		public TerminalNode CLASSID() { return getToken(TScala0Parser.CLASSID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(ID);
			setState(59); match(4);
			setState(60); match(CLASSID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class BooLitContext extends ExprContext {
		public TerminalNode BOOLIT() { return getToken(TScala0Parser.BOOLIT, 0); }
		public BooLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitBooLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstrCallContext extends ExprContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TScala0Parser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TScala0Parser.LPAR, 0); }
		public TerminalNode CLASSID() { return getToken(TScala0Parser.CLASSID, 0); }
		public ConstrCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitConstrCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public TerminalNode ID() { return getToken(TScala0Parser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocalMethodCallContext extends ExprContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TScala0Parser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TScala0Parser.LPAR, 0); }
		public TerminalNode ID() { return getToken(TScala0Parser.ID, 0); }
		public LocalMethodCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitLocalMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLitContext extends ExprContext {
		public TerminalNode INTLIT() { return getToken(TScala0Parser.INTLIT, 0); }
		public IntLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends ExprContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(TScala0Parser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TScala0Parser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(TScala0Parser.ID, 0); }
		public MethodCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisContext extends ExprContext {
		public TerminalNode THIS() { return getToken(TScala0Parser.THIS, 0); }
		public ThisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitThis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinExprContext extends ExprContext {
		public TerminalNode OP2() { return getToken(TScala0Parser.OP2, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitBinExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrLitContext extends ExprContext {
		public TerminalNode STRLIT() { return getToken(TScala0Parser.STRLIT, 0); }
		public StrLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitStrLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldAccessContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(TScala0Parser.ID, 0); }
		public FieldAccessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitFieldAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnExprContext extends ExprContext {
		public TerminalNode OP1() { return getToken(TScala0Parser.OP1, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitUnExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends ExprContext {
		public TerminalNode NULL() { return getToken(TScala0Parser.NULL, 0); }
		public NullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExprContext extends ExprContext {
		public TerminalNode RPAR() { return getToken(TScala0Parser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(TScala0Parser.LPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new UnExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(63); match(OP1);
				setState(64); expr(4);
				}
				break;

			case 2:
				{
				_localctx = new IntLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65); match(INTLIT);
				}
				break;

			case 3:
				{
				_localctx = new BooLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66); match(BOOLIT);
				}
				break;

			case 4:
				{
				_localctx = new StrLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67); match(STRLIT);
				}
				break;

			case 5:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68); match(THIS);
				}
				break;

			case 6:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69); match(NULL);
				}
				break;

			case 7:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70); match(ID);
				}
				break;

			case 8:
				{
				_localctx = new LocalMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71); match(ID);
				setState(72); match(LPAR);
				setState(74);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << THIS) | (1L << BOOLIT) | (1L << CLASSID) | (1L << ID) | (1L << INTLIT) | (1L << STRLIT) | (1L << OP1) | (1L << LPAR))) != 0)) {
					{
					setState(73); exprs();
					}
				}

				setState(76); match(RPAR);
				}
				break;

			case 9:
				{
				_localctx = new ConstrCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77); match(CLASSID);
				setState(78); match(LPAR);
				setState(80);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << THIS) | (1L << BOOLIT) | (1L << CLASSID) | (1L << ID) | (1L << INTLIT) | (1L << STRLIT) | (1L << OP1) | (1L << LPAR))) != 0)) {
					{
					setState(79); exprs();
					}
				}

				setState(82); match(RPAR);
				}
				break;

			case 10:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83); match(LPAR);
				setState(84); expr(0);
				setState(85); match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new BinExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(90); match(OP2);
						setState(91); expr(4);
						}
						break;

					case 2:
						{
						_localctx = new CondExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(92);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(93); match(6);
						setState(94); expr(0);
						setState(95); match(4);
						setState(96); expr(3);
						}
						break;

					case 3:
						{
						_localctx = new MethodCallContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(99); match(2);
						setState(100); match(ID);
						setState(101); match(LPAR);
						setState(103);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << THIS) | (1L << BOOLIT) | (1L << CLASSID) | (1L << ID) | (1L << INTLIT) | (1L << STRLIT) | (1L << OP1) | (1L << LPAR))) != 0)) {
							{
							setState(102); exprs();
							}
						}

						setState(105); match(RPAR);
						}
						break;

					case 4:
						{
						_localctx = new FieldAccessContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(107); match(2);
						setState(108); match(ID);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TScala0Visitor ) return ((TScala0Visitor<? extends T>)visitor).visitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs() throws RecognitionException {
		ExprsContext _localctx = new ExprsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); expr(0);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(115); match(3);
				setState(116); expr(0);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 3 >= _localctx._p;

		case 1: return 2 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\27}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\7\2\23\n\2\f\2\16\2"+
		"\26\13\2\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13"+
		"\3\3\3\3\3\3\4\3\4\3\4\5\4+\n\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\7\58\n\5\f\5\16\5;\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\7\3\7\3\7\3\7\5\7S\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7Z\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7j\n\7\3\7\3\7\3\7\3\7\7\7p\n\7\f\7\16\7s\13\7\3\b\3\b\3\b\7"+
		"\bx\n\b\f\b\16\b{\13\b\3\b\2\t\2\4\6\b\n\f\16\2\2\u008c\2\20\3\2\2\2\4"+
		"\27\3\2\2\2\6\'\3\2\2\2\b\64\3\2\2\2\n<\3\2\2\2\fY\3\2\2\2\16t\3\2\2\2"+
		"\20\24\5\f\7\2\21\23\5\4\3\2\22\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2"+
		"\24\25\3\2\2\2\25\3\3\2\2\2\26\24\3\2\2\2\27\30\7\t\2\2\30\31\7\r\2\2"+
		"\31\33\7\24\2\2\32\34\5\b\5\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2"+
		"\2\35\36\7\25\2\2\36\"\7\3\2\2\37!\5\6\4\2 \37\3\2\2\2!$\3\2\2\2\" \3"+
		"\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\7\2\2&\5\3\2\2\2\'(\7\16\2"+
		"\2(*\7\24\2\2)+\5\b\5\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,/\7\25\2\2-.\7\6"+
		"\2\2.\60\7\r\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\23\2\2\62"+
		"\63\5\f\7\2\63\7\3\2\2\2\649\5\n\6\2\65\66\7\5\2\2\668\5\n\6\2\67\65\3"+
		"\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\t\3\2\2\2;9\3\2\2\2<=\7\16\2\2"+
		"=>\7\6\2\2>?\7\r\2\2?\13\3\2\2\2@A\b\7\1\2AB\7\21\2\2BZ\5\f\7\2CZ\7\17"+
		"\2\2DZ\7\f\2\2EZ\7\20\2\2FZ\7\13\2\2GZ\7\n\2\2HZ\7\16\2\2IJ\7\16\2\2J"+
		"L\7\24\2\2KM\5\16\b\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NZ\7\25\2\2OP\7\r\2"+
		"\2PR\7\24\2\2QS\5\16\b\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TZ\7\25\2\2UV\7"+
		"\24\2\2VW\5\f\7\2WX\7\25\2\2XZ\3\2\2\2Y@\3\2\2\2YC\3\2\2\2YD\3\2\2\2Y"+
		"E\3\2\2\2YF\3\2\2\2YG\3\2\2\2YH\3\2\2\2YI\3\2\2\2YO\3\2\2\2YU\3\2\2\2"+
		"Zq\3\2\2\2[\\\6\7\2\3\\]\7\22\2\2]p\5\f\7\2^_\6\7\3\3_`\7\b\2\2`a\5\f"+
		"\7\2ab\7\6\2\2bc\5\f\7\2cp\3\2\2\2de\6\7\4\3ef\7\4\2\2fg\7\16\2\2gi\7"+
		"\24\2\2hj\5\16\b\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kp\7\25\2\2lm\6\7\5\3"+
		"mn\7\4\2\2np\7\16\2\2o[\3\2\2\2o^\3\2\2\2od\3\2\2\2ol\3\2\2\2ps\3\2\2"+
		"\2qo\3\2\2\2qr\3\2\2\2r\r\3\2\2\2sq\3\2\2\2ty\5\f\7\2uv\7\5\2\2vx\5\f"+
		"\7\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\17\3\2\2\2{y\3\2\2\2\17"+
		"\24\33\"*/9LRYioqy";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}