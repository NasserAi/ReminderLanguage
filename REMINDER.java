import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;
import java.util.Scanner;

public class REMINDER {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.nextLine();
        File file = new File(fileName);
        FileInputStream fis = null;
        
        fis = new FileInputStream(file);
        
        String className = args[0];
        IR.init( className );
        IR.setup();
        
        
        /*
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream file = System.in;
        if (inputFile != null) {
            file = new FileInputStream(inputFile);
        }*/
        
        ANTLRInputStream in = new ANTLRInputStream(fis);
        //ReminderLexer lexer = new ReminderLexer(in);
        LabeledReminderLexer lexer = new LabeledReminderLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        //print each token
        /*
        tokens.fill();
        for(Object tok:tokens.getTokens()){
            System.out.println(tok);
        }
        */
        
        System.out.println("------------------------Result--------------------------");
        
        //ReminderParser parser = new ReminderParser(tokens);
        LabeledReminderParser parser = new LabeledReminderParser(tokens);
        //parser.setBuildParseTree(true);
        //RuleContext tree = parser.start();
        ParseTree tree = parser.start();
        RemVisitor Rem = new RemVisitor();
        Rem.visit( tree );
        
        IR.tearDown();
        IR.dump();
        
        //System.out.println("------------------------Antlr Check--------------------------");
        //System.out.println(tree.toStringTree(parser));
        
    }
}
