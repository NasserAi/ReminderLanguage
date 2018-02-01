import java.util.HashMap;
import java.util.Map;


public class RemVisitor extends ReminderBaseVisitor<String> {
	Map<String,String> symTable = new HashMap<String, String>();
	
    public boolean check_date(String date){
        String check_day = date.substring(0,2);
        String check_month = date.substring(3,5);
        int d1 = check_day.charAt(0);
        int d2 = check_day.charAt(1);
        int m1 = check_month.charAt(0);
        int m2 = check_month.charAt(1);
        
        //System.out.println(check_day);
        //System.out.println(check_month);
        
        if( !(d1==48 && d2>48 && d2<58) && !(d1==49 && d2>47 && d2<58) && !(d1==50 && d2>47 && d2<58) && !(d1==51 && d2>47 && d2<50) ){
            System.out.println("Remind_date - wrong input!");
        }
        
        else if( !(m1==48 && m2>48 && m2 <58) && !(d1==49 && d2>47 && d2<51)){
            System.out.println("Remind_date - wrong input!");
        }
        
        else if( date.charAt(2)!=45 && date.charAt(5)!=45){
            System.out.println("Remind_date - wrong input!");
        }
        
        else{
            for(int i=6; i<date.length(); i++){
                if( date.charAt(i)<48 || date.charAt(i) >57){
                    System.out.println("Year of Remind_date - wrong input!");
                }
            }
        }
        return true;
    }
    
    
    //CREATE FUNCTION
	public String visitIdn(LabeledReminderParser.IdnContext ctx) {
		String id = ctx.ID().getText();
        
        if (!symTable.containsKey(id)) {
            symTable.put(id, null);
        }
        else {
            System.out.println("Same ID: '" + id + "' EXSIT! System cannot allow Two same ID there!");
        }
        
        IR.addCode("    Event event" + id + " = new Event();");
        IR.addCode("    event" + id + ".id = \"" + id + "\";");
		return null;
	}
    
    public String visitName(LabeledReminderParser.NameContext ctx) {
        String name = ctx.STRING().getText();
        String id = ctx.ID().getText();
        
        
        if (!symTable.containsKey(name)) {
            symTable.put(name, null);
        }
        else if (name.equals(null)) {
            System.out.println("There is no NAME VALUE in CREATE FUNCTION!");
        }
        else {
            System.out.println("Same Name: '" + name + "' EXSIT in CREATE FUNCTION! It will confuse you in the future!");
        }
        
        
        IR.addCode("    event" + id + ".name = \"" + name + "\";");
        return null;
    }
    
    public String visitContent(LabeledReminderParser.ContentContext ctx) {
        String content = ctx.STRING().getText();
        String id = ctx.ID().getText();
        
        IR.addCode("    event" + id + ".content = \"" + content + "\";");
        return null;
    }
    
    public String visitDate(LabeledReminderParser.DateContext ctx) {
        String remind_date = ctx.STRING().getText();
        String id = ctx.ID().getText();
        check_date(remind_date);
        
        //for(int i=check_day.length();; i>=0; i--){}
        
        
        IR.addCode("    event" + id + ".remind_date = sdf.parse(\"" + remind_date + "\");");
        return null;
    }
    
    
    public String visitRepeat(LabeledReminderParser.RepeatContext ctx) {
        String repeat = ctx.ANS().getText();
        String id = ctx.ID().getText();
        
        IR.addCode("    event" + id + ".repeat = \"" + repeat + "\";");
        IR.addCode("    datalist.add(event" + id + ");");
        return null;
    }
    
    
    //EDIT FUNCTION
    public String visitFor_name(ReminderParser.For_nameContext ctx) {
        String for_name = ctx.FOR().getText();
        
        IR.addCode("    " + for_name);
        return null;
    }
    
    
    public String visitInit(ReminderParser.InitContext ctx) {
        String i = ctx.I().getText();
        String zero = ctx.ZERO().getText();
        
        
        IR.addCode("    (int " + i + " = " + zero + ";");
        return null;
    }
    
    public String visitControl(ReminderParser.ControlContext ctx) {
        String i = ctx.I().getText();
        String sm = ctx.SM().getText();
        String datalist = ctx.DATALIST().getText();
        
        
        IR.addCode("    " + i + sm + datalist + ".size();");
        return null;
    }
    
    public String visitAcc(ReminderParser.AccContext ctx) {
        String acc = ctx.ACC().getText();
        
        IR.addCode("    " + acc + "){");
        IR.addCode("        Event event = (Event)datalist.get(i);");
        return null;
    }
    
    public String visitIf_stat(ReminderParser.If_statContext ctx) {
        String if_name = ctx.IF().getText();
        String id = ctx.ID().getText();
        
        if (!symTable.containsKey(id)) {
            System.out.println("ID: '" + id + "' doesn't exist, so it cannot be EDITED!");
        }
        
        IR.addCode("        " + if_name + "(event.id.equals(\"" + id + "\")){");
        return null;
    }
    

    
    public String visitNew_name(LabeledReminderParser.New_nameContext ctx) {
        String new_name = ctx.STRING().getText();
        
        if (!symTable.containsKey(new_name)) {
            symTable.put(new_name, null);
        }
        else if (new_name.equals(null)) {
            System.out.println("There is no NAME VALUE in EDIT FUNCTION!");
        }
        else {
            System.out.println("Same Name: '" + new_name + "' EXSIT in EDIT FUNCTION! It will confuse you in the future!");
        }
        
        
        IR.addCode("            event.name = \"" + new_name + "\";");
        return null;
    }
    
    public String visitNew_content(LabeledReminderParser.New_contentContext ctx) {
        String new_content = ctx.STRING().getText();
        
        IR.addCode("            event.content = \"" + new_content + "\";");
        return null;
    }
    
    public String visitNew_date(LabeledReminderParser.New_dateContext ctx) {
        String new_date = ctx.STRING().getText();
        
        IR.addCode("            event.remind_date = sdf.parse(\"" + new_date + "\");");
        return null;
    }
    
    public String visitClose(LabeledReminderParser.CloseContext ctx) {
        IR.addCode("        }" + "\n" + "    }");
        return null;
    }
    
    //DELETE FUNCTION
    public String visitDelete_id(LabeledReminderParser.Delete_idContext ctx) {
        String id = ctx.ID().getText();
        
        if (!symTable.containsKey(id)) {
            System.out.println("ID: '" + id + "' doesn't exist, so it cannot be DELETED!");
        }
        
        
        IR.addCode("    datalist.remove(event" + id + ");");
        return null;
    }
    
    //SEARCH FUNCTION
    public String visitIf_name(LabeledReminderParser.If_nameContext ctx) {
        String if_name = ctx.IF().getText();
        
        IR.addCode("        " + if_name);
        return null;
    }
    
    public String visitFirst_date(LabeledReminderParser.First_dateContext ctx) {
        String first_date = ctx.STRING().getText();
        check_date(first_date);
        
        IR.addCode("        (event.remind_date.after(sdf.parse(\"" + first_date + "\"))");
        return null;
    }

    public String visitTo(LabeledReminderParser.ToContext ctx) {
        
        IR.addCode("        &&");
        return null;
    }
    
    public String visitLast_date(LabeledReminderParser.Last_dateContext ctx) {
        String last_date = ctx.STRING().getText();
        check_date(last_date);
        
        IR.addCode("        event.remind_date.before(sdf.parse(\"" + last_date + "\")) ){");
        return null;
    }

    public String visitPrint_out(LabeledReminderParser.Print_outContext ctx) {
        
        IR.addCode("            System.out.println(\"*****Matched Result*****\" + \"\\n\" +");
        IR.addCode("                           \"ID: \" + event.id + \"\\n\" +");
        IR.addCode("                           \"NAME: \" + event.name + \"\\n\" +");
        IR.addCode("                           \"CONTENT: \" + event.content + \"\\n\" +");
        IR.addCode("                           \"REMIND_DATE: \" + sdf.format(event.remind_date) + \"\\n\" +");
        IR.addCode("                           \"REPEAT: \" + event.repeat + \"\\n\");");
        return null;
    }
    
    //PRINT ALL FUNCTION
    public String visitShow_all(LabeledReminderParser.Show_allContext ctx) {
        IR.addCode("    System.out.println(\"*****All Events in Datalist*****\");");
        return null;
    }
    
    public String visitCbrace(LabeledReminderParser.CbraceContext ctx) {
        IR.addCode("     }");
        return null;
    }
    
    public String visitPrint_all(LabeledReminderParser.Print_allContext ctx) {
        IR.addCode("            System.out.println(\"ID: \" + event.id + \"\\n\" +");
        IR.addCode("                           \"NAME: \" + event.name + \"\\n\" +");
        IR.addCode("                           \"CONTENT: \" + event.content + \"\\n\" +");
        IR.addCode("                           \"REMIND_DATE: \" + sdf.format(event.remind_date) + \"\\n\" +");
        IR.addCode("                           \"REPEAT: \" + event.repeat + \"\\n\");");
        return null;
    }
    
    public String visitRemind_day(LabeledReminderParser.Remind_dayContext ctx) {
        String day = ctx.STRING().getText();
        
        
        for(int i=1; i<day.length(); i++){
            if( day.charAt(i)<48 || day.charAt(i) >57){
                System.out.println("In Remind function days should be number!");
            }
        }
        
        
        IR.addCode("    c.add(Calendar.DATE, " + day + ");");
        IR.addCode("    Date next_date = c.getTime();");
        IR.addCode("    c.setTime(today);");
        return null;
    }
    
    public String visitIf_remind(LabeledReminderParser.If_remindContext ctx) {
        String day = ctx.STRING().getText();
        
        
        for(int i=1; i<day.length(); i++){
            if( day.charAt(i)<48 || day.charAt(i) >57){
                System.out.println("In Remind function days should be number!");
            }
        }
        
        
        
        IR.addCode("        if( event.remind_date.after(today) && event.remind_date.before(next_date) ){");
        return null;
    }

}
