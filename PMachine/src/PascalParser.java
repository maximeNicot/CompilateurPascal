// Generated from C:/Users/maxime/Desktop/MASTER1SEM2/PMachine/src\Pascal.g4 by ANTLR 4.7.2

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, ID=35, WS=36, INT=37;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_declaration = 2, RULE_typi = 3, 
		RULE_instructions = 4, RULE_instruction = 5, RULE_simpleexpression = 6, 
		RULE_expression = 7, RULE_variable = 8, RULE_factor = 9, RULE_term = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declarations", "declaration", "typi", "instructions", "instruction", 
			"simpleexpression", "expression", "variable", "factor", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end.'", "';'", "'var'", "','", "':'", "'integer'", 
			"'array'", "'['", "']'", "'of'", "'boolean'", "'type'", "'end'", "'read'", 
			"'('", "')'", "'write'", "':='", "'if'", "'then'", "'else'", "'while'", 
			"'do'", "'-'", "'+'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'*'", 
			"'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"WS", "INT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private ArrayList<Instruction> pcode;
	    private TableSymboles table;
	    private Boolean pasderreur;


	    public  Instruction[] lire() throws Exception {
	        pcode = new ArrayList<Instruction>();
	        table = new TableSymboles();
	        program();
	        pasderreur = false;
	        return pcode.toArray(new Instruction[]{});
	    }

	public PascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			declarations();
			 pcode.add(new Instruction.INC(table.size));
			setState(24);
			match(T__0);
			setState(25);
			instructions();
			setState(26);
			match(T__1);

			        pcode.add(new Instruction.HLT());
			    
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

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			declaration();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(30);
				match(T__2);
				setState(31);
				declaration();
				}
				}
				setState(36);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token ID;
		public TypiContext typi;
		public List<TerminalNode> ID() { return getTokens(PascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PascalParser.ID, i);
		}
		public TypiContext typi() {
			return getRuleContext(TypiContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__3);
			setState(38);
			((DeclarationContext)_localctx).ID = match(ID);

			        ArrayList<String> liste=new ArrayList<String>();
			        liste.add((((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null));
			    
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(40);
				match(T__4);
				setState(41);
				((DeclarationContext)_localctx).ID = match(ID);

				        liste.add((((DeclarationContext)_localctx).ID!=null?((DeclarationContext)_localctx).ID.getText():null));
				    
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(T__5);
			setState(49);
			((DeclarationContext)_localctx).typi = typi();

			    for(String id:liste){
			        table.put(id,((DeclarationContext)_localctx).typi.type);
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

	public static class TypiContext extends ParserRuleContext {
		public Type type;
		public Token INT;
		public TypiContext typi;
		public TerminalNode INT() { return getToken(PascalParser.INT, 0); }
		public List<TypiContext> typi() {
			return getRuleContexts(TypiContext.class);
		}
		public TypiContext typi(int i) {
			return getRuleContext(TypiContext.class,i);
		}
		public TypiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTypi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTypi(this);
		}
	}

	public final TypiContext typi() throws RecognitionException {
		TypiContext _localctx = new TypiContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typi);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__6);
				((TypiContext)_localctx).type = new Entier();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__7);
				setState(55);
				match(T__8);
				setState(56);
				((TypiContext)_localctx).INT = match(INT);
				setState(57);
				match(T__9);
				setState(58);
				match(T__10);
				setState(59);
				((TypiContext)_localctx).typi = typi();

				    ((TypiContext)_localctx).type = new Tab((((TypiContext)_localctx).INT!=null?Integer.valueOf(((TypiContext)_localctx).INT.getText()):0),((TypiContext)_localctx).typi.type);

				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(T__11);
				((TypiContext)_localctx).type =  new Boolean();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				match(T__12);
				setState(65);
				typi();

				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(67);
					match(T__2);
					setState(68);
					typi();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instructions);
		try {
			int _alt;
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__17:
			case T__19:
			case T__22:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(78);
						instruction();
						setState(79);
						match(T__2);
						}
						} 
					}
					setState(85);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(86);
				instruction();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(T__0);
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
						instruction();
						setState(89);
						match(T__2);
						}
						} 
					}
					setState(95);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(96);
				instruction();
				setState(97);
				match(T__13);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InstructionContext extends ParserRuleContext {
		public Type type;
		public VariableContext variable;
		public ExpressionContext expression;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__14);
				setState(102);
				match(T__15);
				setState(103);
				((InstructionContext)_localctx).variable = variable();
				setState(104);
				match(T__16);

				        ((InstructionContext)_localctx).type = ((InstructionContext)_localctx).variable.type;
				        pcode.add(new Instruction.INN());
				        pcode.add(new Instruction.STO());
				    
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__17);
				setState(108);
				match(T__15);
				setState(109);
				((InstructionContext)_localctx).expression = expression();
				setState(110);
				match(T__16);

				        ((InstructionContext)_localctx).type = ((InstructionContext)_localctx).expression.type;
				        pcode.add(new Instruction.PRN());
				    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				variable();
				setState(114);
				match(T__18);
				setState(115);
				expression();

				            pcode.add(new Instruction.STO());
				        
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(T__19);
				setState(119);
				expression();

				            int ligneBZE=pcode.size();
				            pcode.add(new Instruction.BZE(0));
				        
				setState(121);
				match(T__20);
				setState(122);
				instructions();

				            Instruction.BZE bze=(Instruction.BZE) pcode.get(ligneBZE);
				            bze.setParam(pcode.size());
				        
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{

					            int ligneBRN=pcode.size();
					            pcode.add(new Instruction.BRN(0));
					            bze.setParam(pcode.size());
					        
					setState(125);
					match(T__21);
					setState(126);
					instructions();

					            Instruction.BRN brn=(Instruction.BRN) pcode.get(ligneBRN);
					            brn.setParam(pcode.size());

					        
					}
					break;
				}
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				int ligneBRN=pcode.size();
				setState(132);
				match(T__22);
				setState(133);
				expression();
				setState(134);
				match(T__23);

				        int ligneBZE=pcode.size();
				        pcode.add(new Instruction.BZE(0));
				     
				setState(136);
				instructions();

				        pcode.add(new Instruction.BRN(ligneBRN));
				        Instruction.BZE bze=(Instruction.BZE) pcode.get(ligneBZE);
				        bze.setParam(pcode.size());
				     
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SimpleexpressionContext extends ParserRuleContext {
		public Type type;
		public TermContext term;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public SimpleexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterSimpleexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitSimpleexpression(this);
		}
	}

	public final SimpleexpressionContext simpleexpression() throws RecognitionException {
		SimpleexpressionContext _localctx = new SimpleexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simpleexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				{
				setState(141);
				match(T__24);
				setState(142);
				((SimpleexpressionContext)_localctx).term = term();

				        ((SimpleexpressionContext)_localctx).type = ((SimpleexpressionContext)_localctx).term.type;
				        pcode.add(new Instruction.LDI(-1));
				        pcode.add(new Instruction.MUL());
				    
				}
				break;
			case T__25:
				{
				setState(145);
				match(T__25);
				setState(146);
				((SimpleexpressionContext)_localctx).term = term();
				}
				break;
			case T__15:
			case ID:
			case INT:
				{
				setState(147);
				((SimpleexpressionContext)_localctx).term = term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24 || _la==T__25) {
				{
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					setState(150);
					match(T__25);
					setState(151);
					((SimpleexpressionContext)_localctx).term = term();

					        pcode.add(new Instruction.ADD());
					    
					}
					break;
				case T__24:
					{
					setState(154);
					match(T__24);
					setState(155);
					((SimpleexpressionContext)_localctx).term = term();

					            pcode.add(new Instruction.SUB());
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(162);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Type type;
		public SimpleexpressionContext simpleexpression;
		public List<SimpleexpressionContext> simpleexpression() {
			return getRuleContexts(SimpleexpressionContext.class);
		}
		public SimpleexpressionContext simpleexpression(int i) {
			return getRuleContext(SimpleexpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				((ExpressionContext)_localctx).simpleexpression = simpleexpression();
				((ExpressionContext)_localctx).type = ((ExpressionContext)_localctx).simpleexpression.type;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				simpleexpression();
				setState(167);
				match(T__26);
				setState(168);
				simpleexpression();

				        pcode.add(new Instruction.EQL());

				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				simpleexpression();
				setState(172);
				match(T__27);
				setState(173);
				simpleexpression();

				        pcode.add(new Instruction.NEQ());

				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				simpleexpression();
				setState(177);
				match(T__28);
				setState(178);
				simpleexpression();

				        pcode.add(new Instruction.LSS());

				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				simpleexpression();
				setState(182);
				match(T__29);
				setState(183);
				simpleexpression();

				        pcode.add(new Instruction.GTR());

				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				simpleexpression();
				setState(187);
				match(T__30);
				setState(188);
				simpleexpression();

				        pcode.add(new Instruction.LEQ());

				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				simpleexpression();
				setState(192);
				match(T__31);
				setState(193);
				simpleexpression();

				        pcode.add(new Instruction.GEQ());

				    
				}
				break;
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

	public static class VariableContext extends ParserRuleContext {
		public Type type;
		public Token ID;
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			((VariableContext)_localctx).ID = match(ID);
			      Data d=table.get((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null));
			        Type t=d.getType();
			        ((VariableContext)_localctx).type = t;
			        pcode.add(new Instruction.LDA(d.getAdresse()));
			    
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(200);
				match(T__8);
				setState(201);
				expression();

				        t=((Tab)t).getType();
				        ((VariableContext)_localctx).type = t;
				        pcode.add(new Instruction.LDI(t.size()));
				        pcode.add(new Instruction.MUL());
				        pcode.add(new Instruction.ADD());

				    
				setState(203);
				match(T__9);
				}
				}
				setState(209);
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

	public static class FactorContext extends ParserRuleContext {
		public Type type;
		public Token INT;
		public VariableContext variable;
		public ExpressionContext expression;
		public TerminalNode INT() { return getToken(PascalParser.INT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((FactorContext)_localctx).INT = match(INT);

				        pcode.add(new Instruction.LDI((((FactorContext)_localctx).INT!=null?Integer.valueOf(((FactorContext)_localctx).INT.getText()):0)));
				        ((FactorContext)_localctx).type = new Entier();
				    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				((FactorContext)_localctx).variable = variable();


				        pcode.add(new Instruction.LDV());

				        ((FactorContext)_localctx).type = ((FactorContext)_localctx).variable.type;
				    
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(T__15);
				setState(216);
				((FactorContext)_localctx).expression = expression();
				setState(217);
				match(T__16);

				    ((FactorContext)_localctx).type = ((FactorContext)_localctx).expression.type;

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TermContext extends ParserRuleContext {
		public Type type;
		public FactorContext factor;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PascalListener ) ((PascalListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			((TermContext)_localctx).factor = factor();

			    ((TermContext)_localctx).type = ((TermContext)_localctx).factor.type;

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32 || _la==T__33) {
				{
				setState(232);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__32:
					{
					setState(224);
					match(T__32);
					setState(225);
					((TermContext)_localctx).factor = factor();
					pcode.add(new Instruction.MUL());
					}
					break;
				case T__33:
					{
					setState(228);
					match(T__33);
					setState(229);
					((TermContext)_localctx).factor = factor();
					pcode.add(new Instruction.DIV());
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(236);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3#\n\3\f\3\16\3"+
		"&\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\7\6T\n\6\f\6\16"+
		"\6W\13\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\3\6\3\6\5\6f"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0084\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u008e\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0097"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c7"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d0\n\n\f\n\16\n\u00d3\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00df\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00eb\n\f\f\f\16\f\u00ee\13\f\3\f"+
		"\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u0101\2\30\3\2\2\2\4\37\3\2\2"+
		"\2\6\'\3\2\2\2\bN\3\2\2\2\ne\3\2\2\2\f\u008d\3\2\2\2\16\u0096\3\2\2\2"+
		"\20\u00c6\3\2\2\2\22\u00c8\3\2\2\2\24\u00de\3\2\2\2\26\u00e0\3\2\2\2\30"+
		"\31\5\4\3\2\31\32\b\2\1\2\32\33\7\3\2\2\33\34\5\n\6\2\34\35\7\4\2\2\35"+
		"\36\b\2\1\2\36\3\3\2\2\2\37$\5\6\4\2 !\7\5\2\2!#\5\6\4\2\" \3\2\2\2#&"+
		"\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&$\3\2\2\2\'(\7\6\2\2()\7%\2\2"+
		")/\b\4\1\2*+\7\7\2\2+,\7%\2\2,.\b\4\1\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2"+
		"\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\b\2\2\63\64\5\b\5\2\64"+
		"\65\b\4\1\2\65\7\3\2\2\2\66\67\7\t\2\2\67O\b\5\1\289\7\n\2\29:\7\13\2"+
		"\2:;\7\'\2\2;<\7\f\2\2<=\7\r\2\2=>\5\b\5\2>?\b\5\1\2?O\3\2\2\2@A\7\16"+
		"\2\2AO\b\5\1\2BC\7\17\2\2CD\5\b\5\2DI\b\5\1\2EF\7\5\2\2FH\5\b\5\2GE\3"+
		"\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\20\2\2MO"+
		"\3\2\2\2N\66\3\2\2\2N8\3\2\2\2N@\3\2\2\2NB\3\2\2\2O\t\3\2\2\2PQ\5\f\7"+
		"\2QR\7\5\2\2RT\3\2\2\2SP\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2"+
		"\2WU\3\2\2\2Xf\5\f\7\2Y_\7\3\2\2Z[\5\f\7\2[\\\7\5\2\2\\^\3\2\2\2]Z\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\5\f\7\2cd\7\20"+
		"\2\2df\3\2\2\2eU\3\2\2\2eY\3\2\2\2f\13\3\2\2\2gh\7\21\2\2hi\7\22\2\2i"+
		"j\5\22\n\2jk\7\23\2\2kl\b\7\1\2l\u008e\3\2\2\2mn\7\24\2\2no\7\22\2\2o"+
		"p\5\20\t\2pq\7\23\2\2qr\b\7\1\2r\u008e\3\2\2\2st\5\22\n\2tu\7\25\2\2u"+
		"v\5\20\t\2vw\b\7\1\2w\u008e\3\2\2\2xy\7\26\2\2yz\5\20\t\2z{\b\7\1\2{|"+
		"\7\27\2\2|}\5\n\6\2}\u0083\b\7\1\2~\177\b\7\1\2\177\u0080\7\30\2\2\u0080"+
		"\u0081\5\n\6\2\u0081\u0082\b\7\1\2\u0082\u0084\3\2\2\2\u0083~\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u008e\3\2\2\2\u0085\u0086\b\7\1\2\u0086\u0087"+
		"\7\31\2\2\u0087\u0088\5\20\t\2\u0088\u0089\7\32\2\2\u0089\u008a\b\7\1"+
		"\2\u008a\u008b\5\n\6\2\u008b\u008c\b\7\1\2\u008c\u008e\3\2\2\2\u008dg"+
		"\3\2\2\2\u008dm\3\2\2\2\u008ds\3\2\2\2\u008dx\3\2\2\2\u008d\u0085\3\2"+
		"\2\2\u008e\r\3\2\2\2\u008f\u0090\7\33\2\2\u0090\u0091\5\26\f\2\u0091\u0092"+
		"\b\b\1\2\u0092\u0097\3\2\2\2\u0093\u0094\7\34\2\2\u0094\u0097\5\26\f\2"+
		"\u0095\u0097\5\26\f\2\u0096\u008f\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\u00a2\3\2\2\2\u0098\u0099\7\34\2\2\u0099\u009a\5\26\f\2"+
		"\u009a\u009b\b\b\1\2\u009b\u00a1\3\2\2\2\u009c\u009d\7\33\2\2\u009d\u009e"+
		"\5\26\f\2\u009e\u009f\b\b\1\2\u009f\u00a1\3\2\2\2\u00a0\u0098\3\2\2\2"+
		"\u00a0\u009c\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5\16\b\2\u00a6"+
		"\u00a7\b\t\1\2\u00a7\u00c7\3\2\2\2\u00a8\u00a9\5\16\b\2\u00a9\u00aa\7"+
		"\35\2\2\u00aa\u00ab\5\16\b\2\u00ab\u00ac\b\t\1\2\u00ac\u00c7\3\2\2\2\u00ad"+
		"\u00ae\5\16\b\2\u00ae\u00af\7\36\2\2\u00af\u00b0\5\16\b\2\u00b0\u00b1"+
		"\b\t\1\2\u00b1\u00c7\3\2\2\2\u00b2\u00b3\5\16\b\2\u00b3\u00b4\7\37\2\2"+
		"\u00b4\u00b5\5\16\b\2\u00b5\u00b6\b\t\1\2\u00b6\u00c7\3\2\2\2\u00b7\u00b8"+
		"\5\16\b\2\u00b8\u00b9\7 \2\2\u00b9\u00ba\5\16\b\2\u00ba\u00bb\b\t\1\2"+
		"\u00bb\u00c7\3\2\2\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\7!\2\2\u00be\u00bf"+
		"\5\16\b\2\u00bf\u00c0\b\t\1\2\u00c0\u00c7\3\2\2\2\u00c1\u00c2\5\16\b\2"+
		"\u00c2\u00c3\7\"\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5\b\t\1\2\u00c5\u00c7"+
		"\3\2\2\2\u00c6\u00a5\3\2\2\2\u00c6\u00a8\3\2\2\2\u00c6\u00ad\3\2\2\2\u00c6"+
		"\u00b2\3\2\2\2\u00c6\u00b7\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00c1\3\2"+
		"\2\2\u00c7\21\3\2\2\2\u00c8\u00c9\7%\2\2\u00c9\u00d1\b\n\1\2\u00ca\u00cb"+
		"\7\13\2\2\u00cb\u00cc\5\20\t\2\u00cc\u00cd\b\n\1\2\u00cd\u00ce\7\f\2\2"+
		"\u00ce\u00d0\3\2\2\2\u00cf\u00ca\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\23\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7\'\2\2\u00d5\u00df\b\13\1\2\u00d6\u00d7\5\22\n\2\u00d7\u00d8\b"+
		"\13\1\2\u00d8\u00df\3\2\2\2\u00d9\u00da\7\22\2\2\u00da\u00db\5\20\t\2"+
		"\u00db\u00dc\7\23\2\2\u00dc\u00dd\b\13\1\2\u00dd\u00df\3\2\2\2\u00de\u00d4"+
		"\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\25\3\2\2\2\u00e0"+
		"\u00e1\5\24\13\2\u00e1\u00ec\b\f\1\2\u00e2\u00e3\7#\2\2\u00e3\u00e4\5"+
		"\24\13\2\u00e4\u00e5\b\f\1\2\u00e5\u00eb\3\2\2\2\u00e6\u00e7\7$\2\2\u00e7"+
		"\u00e8\5\24\13\2\u00e8\u00e9\b\f\1\2\u00e9\u00eb\3\2\2\2\u00ea\u00e2\3"+
		"\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\27\3\2\2\2\u00ee\u00ec\3\2\2\2\23$/INU_e\u0083\u008d"+
		"\u0096\u00a0\u00a2\u00c6\u00d1\u00de\u00ea\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}