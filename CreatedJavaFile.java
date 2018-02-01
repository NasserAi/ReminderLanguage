import java.util.*;
import java.text.SimpleDateFormat;
class CreatedJavaFile {
public static void main(String[] args) throws Exception {
    List<Event> datalist = new ArrayList<Event>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    Calendar c = Calendar.getInstance();
    Date today = new Date();
    c.setTime(today);
    Event event1 = new Event();
    event1.id = "1";
    event1.name = "OS final exam";
    event1.content = "Need to be well prepared before Wednesday";
    event1.remind_date = sdf.parse("16-05-2017");
    event1.repeat = "no";
    datalist.add(event1);
    Event event2 = new Event();
    event2.id = "2";
    event2.name = "Summer class begin";
    event2.content = "Studying during summer";
    event2.remind_date = sdf.parse("01-06-2017");
    event2.repeat = "no";
    datalist.add(event2);
    Event event3 = new Event();
    event3.id = "3";
    event3.name = "Name3";
    event3.content = "A wonderful day";
    event3.remind_date = sdf.parse("12-04-2018");
    event3.repeat = "no";
    datalist.add(event3);
    Event event4 = new Event();
    event4.id = "4";
    event4.name = "test file 4";
    event4.content = "No matter what is it";
    event4.remind_date = sdf.parse("10-05-2021");
    event4.repeat = "no";
    datalist.add(event4);
    Event event5 = new Event();
    event5.id = "5";
    event5.name = "Moive Night";
    event5.content = "Go to AMC to watch ALIEN";
    event5.remind_date = sdf.parse("19-05-2017");
    event5.repeat = "no";
    datalist.add(event5);
    for
    (int i = 0;
    i<datalist.size();
    i++){
        Event event = (Event)datalist.get(i);
        if(event.id.equals("2")){
            event.content = "NewContent";
            event.remind_date = sdf.parse("19-05-2023");
        }
    }
    datalist.remove(event3);
    c.add(Calendar.DATE,  7);
    Date next_date = c.getTime();
    c.setTime(today);
    for
    (int i = 0;
    i<datalist.size();
    i++){
        Event event = (Event)datalist.get(i);
        if( event.remind_date.after(today) && event.remind_date.before(next_date) ){
            System.out.println("*****Matched Result*****" + "\n" +
                           "ID: " + event.id + "\n" +
                           "NAME: " + event.name + "\n" +
                           "CONTENT: " + event.content + "\n" +
                           "REMIND_DATE: " + sdf.format(event.remind_date) + "\n" +
                           "REPEAT: " + event.repeat + "\n");
        }
    }
    for
    (int i = 0;
    i<datalist.size();
    i++){
        Event event = (Event)datalist.get(i);
        if
        (event.remind_date.after(sdf.parse("11-03-2022"))
        &&
        event.remind_date.before(sdf.parse("25-04-2024")) ){
            System.out.println("*****Matched Result*****" + "\n" +
                           "ID: " + event.id + "\n" +
                           "NAME: " + event.name + "\n" +
                           "CONTENT: " + event.content + "\n" +
                           "REMIND_DATE: " + sdf.format(event.remind_date) + "\n" +
                           "REPEAT: " + event.repeat + "\n");
        }
    }
    System.out.println("*****All Events in Datalist*****");
    for
    (int i = 0;
    i<datalist.size();
    i++){
        Event event = (Event)datalist.get(i);
            System.out.println("ID: " + event.id + "\n" +
                           "NAME: " + event.name + "\n" +
                           "CONTENT: " + event.content + "\n" +
                           "REMIND_DATE: " + sdf.format(event.remind_date) + "\n" +
                           "REPEAT: " + event.repeat + "\n");
     }
  }
}
class Event {
    String id;
    String name;
    String content;
    Date remind_date;
    String repeat;
}
