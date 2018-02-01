import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class IR {
	private static ArrayList<String> buffer = new ArrayList<String>();
	private static String className;
	private static String filename;
	
	public static void init(final String f) {
		className = f;
		filename = className + ".java";
	}
	
	public static void setup() {
		buffer.add("import java.util.*;");
        buffer.add("import java.text.SimpleDateFormat;");
		buffer.add("class " + className + " {");
		//buffer.add("public static void output(int a) { System.out.println(a); }");
		buffer.add("public static void main(String[] args) throws Exception {");
        buffer.add("    List<Event> datalist = new ArrayList<Event>();");
        buffer.add("    SimpleDateFormat sdf = new SimpleDateFormat(\"dd-MM-yyyy\");");
        buffer.add("    Calendar c = Calendar.getInstance();");
        buffer.add("    Date today = new Date();");
        buffer.add("    c.setTime(today);");
	}
	
	public static void addCode(String line) {
		buffer.add( line );
	}
	
	public static void tearDown() {
		buffer.add( "  }" );
		buffer.add( "}" );
		buffer.add( "class Event {" + "\n" +
                   "    String id;" + "\n" +
                   "    String name;" + "\n" +
                   "    String content;" + "\n" +
                   "    Date remind_date;" + "\n" +
                   "    String repeat;" + "\n" + "}");
	}
	
	public static void dump() {
		File file = new File( filename );
		
		try {
		  PrintWriter out = new PrintWriter(file);
		  for (String line : buffer) {
			  out.println( line );
		  }
		  out.close();
		} catch (Exception e) {
			
		}
	}
	
}
