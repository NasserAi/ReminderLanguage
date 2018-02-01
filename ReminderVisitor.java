// Generated from Reminder.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReminderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReminderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReminderParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ReminderParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ReminderParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(ReminderParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#idn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdn(ReminderParser.IdnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ReminderParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(ReminderParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(ReminderParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(ReminderParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#edit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdit(ReminderParser.EditContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#modify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify(ReminderParser.ModifyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#new_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_name(ReminderParser.New_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#new_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_content(ReminderParser.New_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#new_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_date(ReminderParser.New_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#new_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_repeat(ReminderParser.New_repeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(ReminderParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#delete_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_id(ReminderParser.Delete_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(ReminderParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#for_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_name(ReminderParser.For_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(ReminderParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl(ReminderParser.ControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#acc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcc(ReminderParser.AccContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(ReminderParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose(ReminderParser.CloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#search}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch(ReminderParser.SearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#if_search}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_search(ReminderParser.If_searchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(ReminderParser.ToContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#if_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_name(ReminderParser.If_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#first_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_date(ReminderParser.First_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#last_date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast_date(ReminderParser.Last_dateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#print_out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_out(ReminderParser.Print_outContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ReminderParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#show_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_all(ReminderParser.Show_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#cbrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCbrace(ReminderParser.CbraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#print_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_all(ReminderParser.Print_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#remind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemind(ReminderParser.RemindContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#remind_day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemind_day(ReminderParser.Remind_dayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#if_remind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_remind(ReminderParser.If_remindContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol(ReminderParser.ColContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#sem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSem(ReminderParser.SemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReminderParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCom(ReminderParser.ComContext ctx);
}