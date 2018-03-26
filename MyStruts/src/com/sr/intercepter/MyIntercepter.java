package com.sr.intercepter;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Intercepter;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.UnmarshallingContext.State;
import org.xml.sax.SAXException;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.util.ValueStack;

/*public class MyIntercepter implements Intercepter
{
	public void destory() throws Exception
	{

	}
	
	@Override
	public String intercept(State arg0, Object arg1) throws SAXException {

		ValueStack v=arg0.getTarget(arg0);
		String em=v.findString("email");
		String ps=v.findString("pwd");
		v.set("email",em.toUpperCase());
		v.set("pwd",ps.toUpperCase());
		return arg0.invoke();
	}
}*/