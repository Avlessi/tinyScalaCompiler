package parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;

import error.ErrorFlag;

public class ReportingTScala0Lexer extends TScala0Lexer {
	public ReportingTScala0Lexer(CharStream input) {
		super(input);
	}
	
	public void recover(LexerNoViableAltException e) {
		ErrorFlag.setFlag();
		super.recover(e);
	}
}
