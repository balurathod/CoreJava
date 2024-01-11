package com.rathod.java6;

import javax.script.*;

public class ScriptTest {
	public static void main(String[] args){
		
		try {
            // Create an instance of the Scripting manager.		
            ScriptEngineManager manager = new ScriptEngineManager();
            
            // Get the reference to the rhino scripting engine.
            ScriptEngine rhinoEngine = manager.getEngineByName("javascript");
            
            // Get the Binding object for this Engine.
            Bindings bindings = rhinoEngine.getBindings(ScriptContext.ENGINE_SCOPE);
            
            // Put the input value to the Binding.
            bindings.put("strValue", "A Test String");
            
            // Populate the script code to be executed.
            StringBuilder scriptCode = new StringBuilder();
            
            scriptCode.append("var javaString = new java.lang.String(strValue);");

            scriptCode.append("var result = javaString.length();");

            // Evaluate the Script code.	
            rhinoEngine.eval(scriptCode.toString());
            
            // Take the output value from the script, i.e from the Bindings.	
            int strLength = (Integer)bindings.get("result");		 

            System.out.println("Length is " + strLength);
	
        }catch(Exception exception){	
            exception.printStackTrace();		
        }		
    }		
}

/*
 * 
 * In the above code, a new instance of ScriptEngineManager is created in the very first line. Then, the Scripting Engine
that comes shipped with the Mustang, (i.e, Rhino Java Script Engine) is obtained by calling ScriptEngineManager.getEngineByName(“javascript”). Arguments are passed from and to the Java Code with the help of Bindings. The input string to be processed is added to the Bindings with the call to Bindings.put(“strValue”, “A Test String”). Notice how the input string is populated within the script code at run-time, var javaString = new java.lang.String(strValue). It means that at run-time the Script code becomes var javaString = new java.lang.String(‘A Test String’). Then the script is executed by calling the ScriptEngine.eval(String) method. The output which is the length of the input string is now in the Script variable called result. And as mentioned previously, since all the Script and the Java Objects will be maintained and controlled by the Bindings, it is possible to get the value of the Script object result directly by calling Bindings.get(“result”).
 * */
 