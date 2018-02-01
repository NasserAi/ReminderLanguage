// Generated from Reminder.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReminderParser}.
 */
public interface ReminderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReminderParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ReminderParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ReminderParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ReminderParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ReminderParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(ReminderParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(ReminderParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#idn}.
	 * @param ctx the parse tree
	 */
	void enterIdn(ReminderParser.IdnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#idn}.
	 * @param ctx the parse tree
	 */
	void exitIdn(ReminderParser.IdnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ReminderParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ReminderParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ReminderParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ReminderParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(ReminderParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(ReminderParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(ReminderParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(ReminderParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#edit}.
	 * @param ctx the parse tree
	 */
	void enterEdit(ReminderParser.EditContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#edit}.
	 * @param ctx the parse tree
	 */
	void exitEdit(ReminderParser.EditContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#modify}.
	 * @param ctx the parse tree
	 */
	void enterModify(ReminderParser.ModifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#modify}.
	 * @param ctx the parse tree
	 */
	void exitModify(ReminderParser.ModifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#new_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_name(ReminderParser.New_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#new_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_name(ReminderParser.New_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#new_content}.
	 * @param ctx the parse tree
	 */
	void enterNew_content(ReminderParser.New_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#new_content}.
	 * @param ctx the parse tree
	 */
	void exitNew_content(ReminderParser.New_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#new_date}.
	 * @param ctx the parse tree
	 */
	void enterNew_date(ReminderParser.New_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#new_date}.
	 * @param ctx the parse tree
	 */
	void exitNew_date(ReminderParser.New_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#new_repeat}.
	 * @param ctx the parse tree
	 */
	void enterNew_repeat(ReminderParser.New_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#new_repeat}.
	 * @param ctx the parse tree
	 */
	void exitNew_repeat(ReminderParser.New_repeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(ReminderParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(ReminderParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#delete_id}.
	 * @param ctx the parse tree
	 */
	void enterDelete_id(ReminderParser.Delete_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#delete_id}.
	 * @param ctx the parse tree
	 */
	void exitDelete_id(ReminderParser.Delete_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(ReminderParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(ReminderParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#for_name}.
	 * @param ctx the parse tree
	 */
	void enterFor_name(ReminderParser.For_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#for_name}.
	 * @param ctx the parse tree
	 */
	void exitFor_name(ReminderParser.For_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(ReminderParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(ReminderParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#control}.
	 * @param ctx the parse tree
	 */
	void enterControl(ReminderParser.ControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#control}.
	 * @param ctx the parse tree
	 */
	void exitControl(ReminderParser.ControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#acc}.
	 * @param ctx the parse tree
	 */
	void enterAcc(ReminderParser.AccContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#acc}.
	 * @param ctx the parse tree
	 */
	void exitAcc(ReminderParser.AccContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(ReminderParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(ReminderParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#close}.
	 * @param ctx the parse tree
	 */
	void enterClose(ReminderParser.CloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#close}.
	 * @param ctx the parse tree
	 */
	void exitClose(ReminderParser.CloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#search}.
	 * @param ctx the parse tree
	 */
	void enterSearch(ReminderParser.SearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#search}.
	 * @param ctx the parse tree
	 */
	void exitSearch(ReminderParser.SearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#if_search}.
	 * @param ctx the parse tree
	 */
	void enterIf_search(ReminderParser.If_searchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#if_search}.
	 * @param ctx the parse tree
	 */
	void exitIf_search(ReminderParser.If_searchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(ReminderParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(ReminderParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#if_name}.
	 * @param ctx the parse tree
	 */
	void enterIf_name(ReminderParser.If_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#if_name}.
	 * @param ctx the parse tree
	 */
	void exitIf_name(ReminderParser.If_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#first_date}.
	 * @param ctx the parse tree
	 */
	void enterFirst_date(ReminderParser.First_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#first_date}.
	 * @param ctx the parse tree
	 */
	void exitFirst_date(ReminderParser.First_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#last_date}.
	 * @param ctx the parse tree
	 */
	void enterLast_date(ReminderParser.Last_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#last_date}.
	 * @param ctx the parse tree
	 */
	void exitLast_date(ReminderParser.Last_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#print_out}.
	 * @param ctx the parse tree
	 */
	void enterPrint_out(ReminderParser.Print_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#print_out}.
	 * @param ctx the parse tree
	 */
	void exitPrint_out(ReminderParser.Print_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ReminderParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ReminderParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#show_all}.
	 * @param ctx the parse tree
	 */
	void enterShow_all(ReminderParser.Show_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#show_all}.
	 * @param ctx the parse tree
	 */
	void exitShow_all(ReminderParser.Show_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#cbrace}.
	 * @param ctx the parse tree
	 */
	void enterCbrace(ReminderParser.CbraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#cbrace}.
	 * @param ctx the parse tree
	 */
	void exitCbrace(ReminderParser.CbraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#print_all}.
	 * @param ctx the parse tree
	 */
	void enterPrint_all(ReminderParser.Print_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#print_all}.
	 * @param ctx the parse tree
	 */
	void exitPrint_all(ReminderParser.Print_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#remind}.
	 * @param ctx the parse tree
	 */
	void enterRemind(ReminderParser.RemindContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#remind}.
	 * @param ctx the parse tree
	 */
	void exitRemind(ReminderParser.RemindContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#remind_day}.
	 * @param ctx the parse tree
	 */
	void enterRemind_day(ReminderParser.Remind_dayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#remind_day}.
	 * @param ctx the parse tree
	 */
	void exitRemind_day(ReminderParser.Remind_dayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#if_remind}.
	 * @param ctx the parse tree
	 */
	void enterIf_remind(ReminderParser.If_remindContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#if_remind}.
	 * @param ctx the parse tree
	 */
	void exitIf_remind(ReminderParser.If_remindContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(ReminderParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(ReminderParser.ColContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#sem}.
	 * @param ctx the parse tree
	 */
	void enterSem(ReminderParser.SemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#sem}.
	 * @param ctx the parse tree
	 */
	void exitSem(ReminderParser.SemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReminderParser#com}.
	 * @param ctx the parse tree
	 */
	void enterCom(ReminderParser.ComContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReminderParser#com}.
	 * @param ctx the parse tree
	 */
	void exitCom(ReminderParser.ComContext ctx);
}