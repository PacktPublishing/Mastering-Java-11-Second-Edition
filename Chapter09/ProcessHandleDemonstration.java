import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class ProcessHandleDemonstration 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		provideProcessInformation(ProcessHandle.current());
		Process theProcess = new ProcessBuilder("SnippingTool.exe").start();
		provideProcessInformation(theProcess.toHandle());
		theProcess.waitFor();
		provideProcessInformation(theProcess.toHandle());

	}

	static void provideProcessInformation(ProcessHandle theHandle)
	{
		// get id
		long pid = ProcessHandle.current().pid();
		
		// Get handle information (if available) 
		ProcessHandle.Info handleInformation = theHandle.info();

		// Print header
		System.out.println("|=============================|");
		System.out.println("| INFORMATION ON YOUR PROCESS |");
		System.out.println("|=============================|\n");
		
		// Print the PID
		System.out.println("Process id (PID): " + pid);
		
		System.out.println("Process Owner: " + handleInformation.user().orElse(""));
		
		// Print additional information if available
		System.out.println("Command:" + handleInformation.command().orElse(""));
		String[] args = handleInformation.arguments().orElse(new String[]{});
		
		System.out.println("Argument(s): ");
		for (String arg: args) System.out.printf("\t" + arg);
		
		System.out.println("Command line: " + handleInformation.commandLine().orElse(""));
		
		System.out.println("Start time: " +  
				handleInformation.startInstant().orElse(Instant.now()).toString());
		
		System.out.printf("Run time duration: %sms%n",
				handleInformation.totalCpuDuration()
				.orElse(Duration.ofMillis(0)).toMillis());
		
	}

}
