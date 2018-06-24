// required imports
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class EmbeddedAddTest 

{

	public static void main(String[] args) throws Throwable
	{
		// instantiate a new ScriptEngineManager
		ScriptEngineManager myEngineManager = new ScriptEngineManager();

		// instantiate a new Nashorn ScriptEngine
		ScriptEngine myEngine = myEngineManager.getEngineByName("nashorn");
		
		// create the JavaScript function
		myEngine.eval("function addTest(x, y) { return x + y; }");
		
		// generate output including a call to the addTest function via the engine
		System.out.println("The addition results are: " + myEngine.eval("addTest(300, 19);"));
	}

}
