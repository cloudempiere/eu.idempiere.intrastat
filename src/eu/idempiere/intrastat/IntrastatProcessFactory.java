package eu.idempiere.intrastat;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

public class IntrastatProcessFactory implements IProcessFactory {

	@Override
	public ProcessCall newProcessInstance(String className) {
		ProcessCall process = null;
		try {
			Class<?> clazz = getClass().getClassLoader().loadClass(className);
			process =  (ProcessCall) clazz.getDeclaredConstructor().newInstance();
		} 
		catch (Exception e) {
		}
		return process;
	}

}
