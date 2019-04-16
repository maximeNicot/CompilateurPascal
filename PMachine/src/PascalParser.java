// Generated from C:/Users/maxime/Desktop/MASTER1SEM2/CompilateurPascal/PMachine/src\Pascal.g4 by ANTLR 4.7.2

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, ID=40, WS=41, INT=42;
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
			"'do'", "'for'", "'to'", "'downto'", "'-'", "'+'", "'='", "'<>'", "'<'", 
			"'>'", "'<='", "'>='", "'in'", "'*'", "'/'", "'div'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "WS", "INT"
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
				((TypiContext)_localctx).type = new Type.MyInt();
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

				    ((TypiContext)_localctx).type = new Type.MyTab((((TypiContext)_localctx).INT!=null?Integer.valueOf(((TypiContext)_localctx).INT.getText()):0),((TypiContext)_localctx).typi.type);

				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(T__11);
				((TypiContext)_localctx).type =  new Type.MyBoolean();
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
			case T__24:
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public TerminalNode ID() { return getToken(PascalParser.ID, 0); }
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
			setState(160);
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
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				int ligneBRN=pcode.size();
				setState(140);
				match(T__24);
				setState(141);
				match(ID);
				setState(142);
				match(T__18);
				setState(143);
				expression();
				setState(158);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__25:
					{
					{
					setState(144);
					match(T__25);
					setState(145);
					expression();
					setState(146);
					match(T__23);

					                int ligneBZE=pcode.size();
					                pcode.add(new Instruction.BZE(0));
					            
					setState(148);
					instructions();

					                pcode.add(new Instruction.BRN(ligneBRN));
					                Instruction.BZE bze=(Instruction.BZE) pcode.get(ligneBZE);
					                bze.setParam(pcode.size());
					            
					}
					}
					break;
				case T__26:
					{
					{
					setState(151);
					match(T__26);
					setState(152);
					expression();
					setState(153);
					match(T__23);

					                int ligneBZE=pcode.size();
					                pcode.add(new Instruction.BZE(0));
					            
					setState(155);
					instructions();

					                pcode.add(new Instruction.BRN(ligneBRN));
					                Instruction.BZE bze=(Instruction.BZE) pcode.get(ligneBZE);
					                bze.setParam(pcode.size());
					            
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				{
				setState(162);
				match(T__27);
				setState(163);
				((SimpleexpressionContext)_localctx).term = term();

				        ((SimpleexpressionContext)_localctx).type = ((SimpleexpressionContext)_localctx).term.type;
				        pcode.add(new Instruction.LDI(-1));
				        pcode.add(new Instruction.MUL());
				    
				}
				break;
			case T__28:
				{
				setState(166);
				match(T__28);
				setState(167);
				((SimpleexpressionContext)_localctx).term = term();
				}
				break;
			case T__15:
			case ID:
			case INT:
				{
				setState(168);
				((SimpleexpressionContext)_localctx).term = term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==T__28) {
				{
				setState(179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
					{
					setState(171);
					match(T__28);
					setState(172);
					((SimpleexpressionContext)_localctx).term = term();

					        pcode.add(new Instruction.ADD());
					    
					}
					break;
				case T__27:
					{
					setState(175);
					match(T__27);
					setState(176);
					((SimpleexpressionContext)_localctx).term = term();

					            pcode.add(new Instruction.SUB());
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(183);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				((ExpressionContext)_localctx).simpleexpression = simpleexpression();
				((ExpressionContext)_localctx).type = ((ExpressionContext)_localctx).simpleexpression.type;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				simpleexpression();
				setState(188);
				match(T__29);
				setState(189);
				simpleexpression();

				        pcode.add(new Instruction.EQL());
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				simpleexpression();
				setState(193);
				match(T__30);
				setState(194);
				simpleexpression();

				        pcode.add(new Instruction.NEQ());
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				simpleexpression();
				setState(198);
				match(T__31);
				setState(199);
				simpleexpression();

				        pcode.add(new Instruction.LSS());
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				simpleexpression();
				setState(203);
				match(T__32);
				setState(204);
				simpleexpression();

				        pcode.add(new Instruction.GTR());
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				simpleexpression();
				setState(208);
				match(T__33);
				setState(209);
				simpleexpression();

				        pcode.add(new Instruction.LEQ());
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				simpleexpression();
				setState(213);
				match(T__34);
				setState(214);
				simpleexpression();

				        pcode.add(new Instruction.GEQ());
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(217);
				simpleexpression();
				setState(218);
				match(T__35);
				setState(219);
				simpleexpression();


				    
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
			setState(224);
			((VariableContext)_localctx).ID = match(ID);
			   Donnee donnee = table.getDonnee((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null));
			        Type t = donnee.getType();
			        ((VariableContext)_localctx).type = t;
			        pcode.add(new Instruction.LDA(donnee.getAdresse()));
			    
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(226);
				match(T__8);
				setState(227);
				expression();
				 //pour les MyTab
				        t=((Type.MyTab)t).getType();
				        ((VariableContext)_localctx).type = t;
				        pcode.add(new Instruction.LDI(t.size()));
				        pcode.add(new Instruction.MUL());
				        pcode.add(new Instruction.ADD());

				    
				setState(229);
				match(T__9);
				}
				}
				setState(235);
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
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				((FactorContext)_localctx).INT = match(INT);

				        pcode.add(new Instruction.LDI((((FactorContext)_localctx).INT!=null?Integer.valueOf(((FactorContext)_localctx).INT.getText()):0)));
				        ((FactorContext)_localctx).type = new Type.MyInt();
				    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				((FactorContext)_localctx).variable = variable();


				        pcode.add(new Instruction.LDV());

				        ((FactorContext)_localctx).type = ((FactorContext)_localctx).variable.type;
				    
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(T__15);
				setState(242);
				((FactorContext)_localctx).expression = expression();
				setState(243);
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
			setState(248);
			((TermContext)_localctx).factor = factor();

			    ((TermContext)_localctx).type = ((TermContext)_localctx).factor.type;

			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) {
				{
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__36:
					{
					setState(250);
					match(T__36);
					setState(251);
					((TermContext)_localctx).factor = factor();
					pcode.add(new Instruction.MUL());
					}
					break;
				case T__37:
					{
					setState(254);
					match(T__37);
					setState(255);
					((TermContext)_localctx).factor = factor();
					pcode.add(new Instruction.DIV());
					}
					break;
				case T__38:
					{
					setState(258);
					match(T__38);
					setState(259);
					((TermContext)_localctx).factor = factor();
					pcode.add(new Instruction.DIV());
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(266);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u010e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3#\n\3\f\3\16\3"+
		"&\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\7\6T\n\6\f\6\16"+
		"\6W\13\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\6\3\6\3\6\5\6f"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0084\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a1\n\7\5\7\u00a3\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00ac\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b6"+
		"\n\b\f\b\16\b\u00b9\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e1\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00ea\n\n\f\n\16\n\u00ed\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00f9\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0109\n\f\f\f\16\f\u010c\13\f\3\f\2\2\r"+
		"\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u0123\2\30\3\2\2\2\4\37\3\2\2\2\6\'"+
		"\3\2\2\2\bN\3\2\2\2\ne\3\2\2\2\f\u00a2\3\2\2\2\16\u00ab\3\2\2\2\20\u00e0"+
		"\3\2\2\2\22\u00e2\3\2\2\2\24\u00f8\3\2\2\2\26\u00fa\3\2\2\2\30\31\5\4"+
		"\3\2\31\32\b\2\1\2\32\33\7\3\2\2\33\34\5\n\6\2\34\35\7\4\2\2\35\36\b\2"+
		"\1\2\36\3\3\2\2\2\37$\5\6\4\2 !\7\5\2\2!#\5\6\4\2\" \3\2\2\2#&\3\2\2\2"+
		"$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&$\3\2\2\2\'(\7\6\2\2()\7*\2\2)/\b\4\1"+
		"\2*+\7\7\2\2+,\7*\2\2,.\b\4\1\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\63\7\b\2\2\63\64\5\b\5\2\64\65\b\4"+
		"\1\2\65\7\3\2\2\2\66\67\7\t\2\2\67O\b\5\1\289\7\n\2\29:\7\13\2\2:;\7,"+
		"\2\2;<\7\f\2\2<=\7\r\2\2=>\5\b\5\2>?\b\5\1\2?O\3\2\2\2@A\7\16\2\2AO\b"+
		"\5\1\2BC\7\17\2\2CD\5\b\5\2DI\b\5\1\2EF\7\5\2\2FH\5\b\5\2GE\3\2\2\2HK"+
		"\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\20\2\2MO\3\2\2\2"+
		"N\66\3\2\2\2N8\3\2\2\2N@\3\2\2\2NB\3\2\2\2O\t\3\2\2\2PQ\5\f\7\2QR\7\5"+
		"\2\2RT\3\2\2\2SP\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2"+
		"\2\2Xf\5\f\7\2Y_\7\3\2\2Z[\5\f\7\2[\\\7\5\2\2\\^\3\2\2\2]Z\3\2\2\2^a\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\5\f\7\2cd\7\20\2\2df"+
		"\3\2\2\2eU\3\2\2\2eY\3\2\2\2f\13\3\2\2\2gh\7\21\2\2hi\7\22\2\2ij\5\22"+
		"\n\2jk\7\23\2\2kl\b\7\1\2l\u00a3\3\2\2\2mn\7\24\2\2no\7\22\2\2op\5\20"+
		"\t\2pq\7\23\2\2qr\b\7\1\2r\u00a3\3\2\2\2st\5\22\n\2tu\7\25\2\2uv\5\20"+
		"\t\2vw\b\7\1\2w\u00a3\3\2\2\2xy\7\26\2\2yz\5\20\t\2z{\b\7\1\2{|\7\27\2"+
		"\2|}\5\n\6\2}\u0083\b\7\1\2~\177\b\7\1\2\177\u0080\7\30\2\2\u0080\u0081"+
		"\5\n\6\2\u0081\u0082\b\7\1\2\u0082\u0084\3\2\2\2\u0083~\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u00a3\3\2\2\2\u0085\u0086\b\7\1\2\u0086\u0087\7\31"+
		"\2\2\u0087\u0088\5\20\t\2\u0088\u0089\7\32\2\2\u0089\u008a\b\7\1\2\u008a"+
		"\u008b\5\n\6\2\u008b\u008c\b\7\1\2\u008c\u00a3\3\2\2\2\u008d\u008e\b\7"+
		"\1\2\u008e\u008f\7\33\2\2\u008f\u0090\7*\2\2\u0090\u0091\7\25\2\2\u0091"+
		"\u00a0\5\20\t\2\u0092\u0093\7\34\2\2\u0093\u0094\5\20\t\2\u0094\u0095"+
		"\7\32\2\2\u0095\u0096\b\7\1\2\u0096\u0097\5\n\6\2\u0097\u0098\b\7\1\2"+
		"\u0098\u00a1\3\2\2\2\u0099\u009a\7\35\2\2\u009a\u009b\5\20\t\2\u009b\u009c"+
		"\7\32\2\2\u009c\u009d\b\7\1\2\u009d\u009e\5\n\6\2\u009e\u009f\b\7\1\2"+
		"\u009f\u00a1\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u0099\3\2\2\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2g\3\2\2\2\u00a2m\3\2\2\2\u00a2s\3\2\2\2\u00a2x\3\2\2\2\u00a2"+
		"\u0085\3\2\2\2\u00a2\u008d\3\2\2\2\u00a3\r\3\2\2\2\u00a4\u00a5\7\36\2"+
		"\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\b\b\1\2\u00a7\u00ac\3\2\2\2\u00a8"+
		"\u00a9\7\37\2\2\u00a9\u00ac\5\26\f\2\u00aa\u00ac\5\26\f\2\u00ab\u00a4"+
		"\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00b7\3\2\2\2\u00ad"+
		"\u00ae\7\37\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\b\b\1\2\u00b0\u00b6\3"+
		"\2\2\2\u00b1\u00b2\7\36\2\2\u00b2\u00b3\5\26\f\2\u00b3\u00b4\b\b\1\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\17\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bb\5\16\b\2\u00bb\u00bc\b\t\1\2\u00bc\u00e1\3\2\2\2"+
		"\u00bd\u00be\5\16\b\2\u00be\u00bf\7 \2\2\u00bf\u00c0\5\16\b\2\u00c0\u00c1"+
		"\b\t\1\2\u00c1\u00e1\3\2\2\2\u00c2\u00c3\5\16\b\2\u00c3\u00c4\7!\2\2\u00c4"+
		"\u00c5\5\16\b\2\u00c5\u00c6\b\t\1\2\u00c6\u00e1\3\2\2\2\u00c7\u00c8\5"+
		"\16\b\2\u00c8\u00c9\7\"\2\2\u00c9\u00ca\5\16\b\2\u00ca\u00cb\b\t\1\2\u00cb"+
		"\u00e1\3\2\2\2\u00cc\u00cd\5\16\b\2\u00cd\u00ce\7#\2\2\u00ce\u00cf\5\16"+
		"\b\2\u00cf\u00d0\b\t\1\2\u00d0\u00e1\3\2\2\2\u00d1\u00d2\5\16\b\2\u00d2"+
		"\u00d3\7$\2\2\u00d3\u00d4\5\16\b\2\u00d4\u00d5\b\t\1\2\u00d5\u00e1\3\2"+
		"\2\2\u00d6\u00d7\5\16\b\2\u00d7\u00d8\7%\2\2\u00d8\u00d9\5\16\b\2\u00d9"+
		"\u00da\b\t\1\2\u00da\u00e1\3\2\2\2\u00db\u00dc\5\16\b\2\u00dc\u00dd\7"+
		"&\2\2\u00dd\u00de\5\16\b\2\u00de\u00df\b\t\1\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00ba\3\2\2\2\u00e0\u00bd\3\2\2\2\u00e0\u00c2\3\2\2\2\u00e0\u00c7\3\2"+
		"\2\2\u00e0\u00cc\3\2\2\2\u00e0\u00d1\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e1\21\3\2\2\2\u00e2\u00e3\7*\2\2\u00e3\u00eb\b\n\1\2"+
		"\u00e4\u00e5\7\13\2\2\u00e5\u00e6\5\20\t\2\u00e6\u00e7\b\n\1\2\u00e7\u00e8"+
		"\7\f\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e4\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\23\3\2\2\2\u00ed\u00eb\3\2\2"+
		"\2\u00ee\u00ef\7,\2\2\u00ef\u00f9\b\13\1\2\u00f0\u00f1\5\22\n\2\u00f1"+
		"\u00f2\b\13\1\2\u00f2\u00f9\3\2\2\2\u00f3\u00f4\7\22\2\2\u00f4\u00f5\5"+
		"\20\t\2\u00f5\u00f6\7\23\2\2\u00f6\u00f7\b\13\1\2\u00f7\u00f9\3\2\2\2"+
		"\u00f8\u00ee\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9\25"+
		"\3\2\2\2\u00fa\u00fb\5\24\13\2\u00fb\u010a\b\f\1\2\u00fc\u00fd\7\'\2\2"+
		"\u00fd\u00fe\5\24\13\2\u00fe\u00ff\b\f\1\2\u00ff\u0109\3\2\2\2\u0100\u0101"+
		"\7(\2\2\u0101\u0102\5\24\13\2\u0102\u0103\b\f\1\2\u0103\u0109\3\2\2\2"+
		"\u0104\u0105\7)\2\2\u0105\u0106\5\24\13\2\u0106\u0107\b\f\1\2\u0107\u0109"+
		"\3\2\2\2\u0108\u00fc\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0104\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\27\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\24$/INU_e\u0083\u00a0\u00a2\u00ab\u00b5\u00b7\u00e0"+
		"\u00eb\u00f8\u0108\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}